package com.example.demo.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Yazar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long yazar_id;
    @Column(columnDefinition = "NVARCHAR(255)",unique = true)
    private String tamAd;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String kisa_ad;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Ornek> ornekler = new ArrayList<>();

    public Yazar() {
    }

    public Yazar(String tamAd, String kisa_ad, List<Ornek> ornekler) {
        this.tamAd = tamAd;
        this.kisa_ad = kisa_ad;
        this.ornekler = ornekler;
    }

    public Long getYazar_id() {
        return yazar_id;
    }

    public void setYazar_id(Long yazar_id) {
        this.yazar_id = yazar_id;
    }

    public String getTamAd() {
        return tamAd;
    }

    public void setTamAd(String tamAd) {
        this.tamAd = tamAd;
    }

    public String getKisa_ad() {
        return kisa_ad;
    }

    public void setKisa_ad(String kisa_ad) {
        this.kisa_ad = kisa_ad;
    }

    public List<Ornek> getOrnekler() {
        return ornekler;
    }

    public void setOrnekler(List<Ornek> ornekler) {
        this.ornekler = ornekler;
    }
}
