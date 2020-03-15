package com.example.demo.Entity;

import org.hibernate.annotations.GeneratorType;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "kelime")
public class Kelime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long kelime_id;
    @Column(columnDefinition = "NVARCHAR(2000)")
    private String kelime;
    @Nullable
    @Column(columnDefinition = "NVARCHAR(255)")
    private String taki;
    @Nullable
    @Column(columnDefinition = "NVARCHAR(255)")
    private String on_taki;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Anlam> anlamlarListe = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Birlesik> birlesiklerListe = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Atasozu> atasozuListe = new ArrayList<>();

    public Kelime() {
    }

    public Kelime(String kelime, String taki, String on_taki, List<Anlam> anlamlarListe, List<Birlesik> birlesiklerListe, List<Atasozu> atasozuListe) {
        this.kelime = kelime;
        this.taki = taki;
        this.on_taki = on_taki;
        this.anlamlarListe = anlamlarListe;
        this.birlesiklerListe = birlesiklerListe;
        this.atasozuListe = atasozuListe;
    }

    public Long getKelime_id() {
        return kelime_id;
    }

    public void setKelime_id(Long kelime_id) {
        this.kelime_id = kelime_id;
    }

    public String getKelime() {
        return kelime;
    }

    public void setKelime(String kelime) {
        this.kelime = kelime;
    }

    public String getTaki() {
        return taki;
    }

    public void setTaki(String taki) {
        this.taki = taki;
    }

    public String getOn_taki() {
        return on_taki;
    }

    public void setOn_taki(String on_taki) {
        this.on_taki = on_taki;
    }

    public List<Anlam> getAnlamlarListe() {
        return anlamlarListe;
    }

    public void setAnlamlarListe(List<Anlam> anlamlarListe) {
        this.anlamlarListe = anlamlarListe;
    }

    public List<Birlesik> getBirlesiklerListe() {
        return birlesiklerListe;
    }

    public void setBirlesiklerListe(List<Birlesik> birlesiklerListe) {
        this.birlesiklerListe = birlesiklerListe;
    }

    public List<Atasozu> getAtasozuListe() {
        return atasozuListe;
    }

    public void setAtasozuListe(List<Atasozu> atasozuListe) {
        this.atasozuListe = atasozuListe;
    }
}
