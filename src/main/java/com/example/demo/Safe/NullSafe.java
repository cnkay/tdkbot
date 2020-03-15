package com.example.demo.Safe;

import com.example.demo.Model.Atasozu;
import com.example.demo.Model.OrneklerListe;
import com.example.demo.Model.OzelliklerListe;
import com.example.demo.Model.Yazar;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface NullSafe {
    List<OrneklerListe> safeOrnek(List<OrneklerListe> list);
    List<OzelliklerListe> safeOzellik(List<OzelliklerListe> list);
    List<Atasozu> safeAtasozu(List<Atasozu> list);
    List<Yazar> safeYazar(List<Yazar> list);
}
