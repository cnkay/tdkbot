package com.example.demo;

import com.example.demo.DB.KelimeDAO;
import com.example.demo.DB.OzellikDAO;
import com.example.demo.DB.YazarDAO;
import com.example.demo.Entity.*;
import com.example.demo.Entity.Atasozu;
import com.example.demo.Model.*;
import com.example.demo.Model.Yazar;
import com.example.demo.Safe.NullSafe;
import org.hibernate.JDBCException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@Service
public class Servis {
    private MappingJackson2HttpMessageConverter converter;
    private RestTemplate restTemplate;
    @Autowired
    private KelimeDAO kelimeDao;
    @Autowired
    private YazarDAO yazarDAO;
    @Autowired
    private OzellikDAO ozellikDAO;
    @Autowired
    private NullSafe nullSafe;
    private void createRestTemplate(){
        restTemplate = new RestTemplate();
        converter = new MappingJackson2HttpMessageConverter();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);
    }
    public void tester() {
        final String uri = "https://sozluk.gov.tr/gts?ara=araba";
        createRestTemplate();
        Word[] json = restTemplate.getForObject(uri, Word[].class);
        Word word = json[0];
        writeDB(word);
    }

    public void fileTester() {
        List<String> wordList = new ArrayList<>();
        List<String> returnedWords = new ArrayList<>();
        try {
            File file = ResourceUtils.getFile("classpath:dic.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                wordList.add(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        final String uri = "https://sozluk.gov.tr/gts?ara=";
        createRestTemplate();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) { // Change i value for resume
            list.add(wordList.get(i));
        }

        for (String word : list) {
            System.out.print(word + " ");
            if (containsWhiteSpace(word)) {
                word = word.replaceAll("\\s", "+");
            }
            String newUri = uri + word;
            Word[] json;
            try {
                json = restTemplate.getForObject(newUri, Word[].class);
            } catch (Exception ex) {
                continue;
            }
            Word result = json[0];
            if(result.anlamlarListe!=null) {
                if (result.madde != null) {
                    writeDB(result);
                    System.out.println(new Date());
                }
            }

        }
    }


    public void writeDB(Word word) {
        int commitable = 0;
        Kelime kelime = new Kelime();
        kelime.setKelime(word.madde);
        if (word.onTaki != null)
            kelime.setOn_taki(word.onTaki.toString());
        if (word.taki != null)
            kelime.setTaki(word.taki.toString());
        if (word.birlesikler != null) {
            List<String> birlesikWordList = Arrays.asList(word.birlesikler.split(","));
            List<Birlesik> birlesikList = new ArrayList<>();
            for (String birlesik : birlesikWordList) {
                if (birlesik.charAt(0) == ' ')
                    birlesik = birlesik.replaceFirst("\\s", "");
                Birlesik birlesikObject = new Birlesik(birlesik);
                birlesikList.add(birlesikObject);
            }
            kelime.setBirlesiklerListe(birlesikList);
        }
        List<Atasozu> atasozuList = new ArrayList<>();
        if (word.atasozu != null) {
            for (com.example.demo.Model.Atasozu atasozu : nullSafe.safeAtasozu(word.atasozu)) {
                Atasozu atasozu1 = new Atasozu();
                atasozu1.setAtasozu(atasozu.madde);
                atasozuList.add(atasozu1);
            }
        }
        if (atasozuList.isEmpty())
            atasozuList = null;
        List<Anlam> anlamList = new ArrayList<>();
        for (AnlamlarListe list : word.anlamlarListe) {
            Anlam anlam = new Anlam();
            anlam.setAnlam(list.anlam);
            anlam.setAnlam_sira(Integer.parseInt(list.anlamSira));
            anlam.setFiil(list.fiil);
            List<Ornek> ornekList = new ArrayList<>();
            for (OrneklerListe list1 : nullSafe.safeOrnek(list.orneklerListe)) {
                if (!list.orneklerListe.isEmpty()) {
                    Ornek ornek = new Ornek();
                    ornek.setOrnek_sira(Integer.parseInt(list1.ornekSira));
                    ornek.setOrnek(list1.ornek);
                    ornek.setKac(list1.kac);
                    com.example.demo.Entity.Yazar yazar1 = new com.example.demo.Entity.Yazar();
                    for (Yazar yazar : nullSafe.safeYazar(list1.yazar)) {
                        if (yazar.tamAdi != null) {
                            if (checkYazarExist(yazar.tamAdi))
                                yazar1 = yazarDAO.findByTamAd(yazar.tamAdi);
                            else {
                                yazar1.setTamAd(yazar.tamAdi);
                                yazar1.setKisa_ad(yazar.kisaAdi);
                            }

                            yazar1.getOrnekler().add(ornek);
                            yazar1 = yazarDAO.save(yazar1);
                            yazarDAO.flush();
                            ornek.setYazar(yazar1);
                        }
                    }

                    ornekList.add(ornek);
                }
            }
            Set<Ornek> ornekSet = new HashSet<>(ornekList);
            List<Ornek> pureOrnek = new ArrayList<>(ornekSet);
            anlam.setOrnekler(pureOrnek);
            List<Ozellik> ozellikList = new ArrayList<>();
            for (OzelliklerListe liste : nullSafe.safeOzellik(list.ozelliklerListe)) {
                Ozellik ozellik = new Ozellik();
                if (checkOzellikExist(liste.tamAdi)) {
                    ozellik = ozellikDAO.findByTamAd(liste.tamAdi);
                } else {
                    ozellik.setKisa_ad(liste.kisaAdi);
                    ozellik.setTamAd(liste.tamAdi);
                    ozellik.setTur(liste.tur);
                    ozellik = ozellikDAO.save(ozellik);
                    ozellikDAO.flush();
                }
                ozellikList.add(ozellik);
            }
            anlam.setOzellikler(ozellikList);
            anlamList.add(anlam);
        }
        kelime.setAtasozuListe(atasozuList);
        kelime.setAnlamlarListe(anlamList);
        try {
            kelimeDao.save(kelime);
            commitable++;
            if (commitable == 200) { // For performance
                kelimeDao.flush();
                commitable = 0;
            }
        } catch (JDBCException ex) {
            return;
        }
    }

    public Long count() {
        return kelimeDao.count();
    }

    private boolean checkYazarExist(String tamAd) {
        if (yazarDAO.existsYazarByTamAd(tamAd))
            return true;
        return false;
    }

    private boolean checkOzellikExist(String tamAd) {
        if (ozellikDAO.existsByTamAd(tamAd))
            return true;
        return false;
    }
    public static boolean containsWhiteSpace(final String testCode) {
        if (testCode != null) {
            for (int i = 0; i < testCode.length(); i++) {
                if (Character.isWhitespace(testCode.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsComma(final String testCode) {
        if (testCode != null) {
            for (int i = 0; i < testCode.length(); i++) {
                if (testCode.charAt(i) == ',') {
                    return true;
                }
            }
        }
        return false;
    }
}
