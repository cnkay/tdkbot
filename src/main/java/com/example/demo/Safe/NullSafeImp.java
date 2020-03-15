package com.example.demo.Safe;

import com.example.demo.Model.Atasozu;
import com.example.demo.Model.OrneklerListe;
import com.example.demo.Model.OzelliklerListe;
import com.example.demo.Model.Yazar;

import java.util.Collections;
import java.util.List;

public class NullSafeImp implements NullSafe{

    public NullSafeImp() {
    }

    @Override
    public List<OrneklerListe> safeOrnek(List<OrneklerListe> list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }
    @Override
    public List<OzelliklerListe> safeOzellik(List<OzelliklerListe> list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }
    @Override
    public List<Atasozu> safeAtasozu(List<Atasozu> list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }
    @Override
    public List<Yazar> safeYazar(List<Yazar> list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }
}
