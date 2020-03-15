package com.example.demo.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Anlam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long anlam_id;
    @Column
    private Integer anlam_sira;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String fiil;
    @Column(columnDefinition = "NVARCHAR(2000)")
    private String anlam;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Ornek> ornekler = new ArrayList<>();
    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Ozellik> ozellikler = new ArrayList<>();
//    @ManyToOne(cascade = {CascadeType.ALL})
//    private Kelime kelime;
    public Anlam() {
    }

    public Anlam(Integer anlam_sira, String fiil, String anlam, List<Ornek> ornekler, List<Ozellik> ozellikler) {
        this.anlam_sira = anlam_sira;
        this.fiil = fiil;
        this.anlam = anlam;
        this.ornekler = ornekler;
        this.ozellikler = ozellikler;
    }


    public Long getAnlam_id() {
        return anlam_id;
    }

    public void setAnlam_id(Long anlam_id) {
        this.anlam_id = anlam_id;
    }

    public Integer getAnlam_sira() {
        return anlam_sira;
    }

    public void setAnlam_sira(Integer anlam_sira) {
        this.anlam_sira = anlam_sira;
    }

    public String getFiil() {
        return fiil;
    }

    public void setFiil(String fiil) {
        this.fiil = fiil;
    }

    public String getAnlam() {
        return anlam;
    }

    public void setAnlam(String anlam) {
        this.anlam = anlam;
    }

    public List<Ornek> getOrnekler() {
        return ornekler;
    }

    public void setOrnekler(List<Ornek> ornekler) {
        this.ornekler = ornekler;
    }

    public List<Ozellik> getOzellikler() {
        return ozellikler;
    }

    public void setOzellikler(List<Ozellik> ozellikler) {
        this.ozellikler = ozellikler;
    }
}
