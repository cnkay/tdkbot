package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class Ornek {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long ornek_id;
    @Column
    private Integer ornek_sira;
    @Column(columnDefinition = "NVARCHAR(2000)")
    private String ornek;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String kac;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Yazar yazar;

//    @ManyToOne(cascade = {CascadeType.ALL})
//    private Anlam anlam;

    public Ornek() {
    }

    public Ornek(Integer ornek_sira, String ornek, String kac) {
        this.ornek_sira = ornek_sira;
        this.ornek = ornek;
        this.kac = kac;
    }

    public Long getOrnek_id() {
        return ornek_id;
    }

    public void setOrnek_id(Long ornek_id) {
        this.ornek_id = ornek_id;
    }

    public Integer getOrnek_sira() {
        return ornek_sira;
    }

    public void setOrnek_sira(Integer ornek_sira) {
        this.ornek_sira = ornek_sira;
    }

    public String getOrnek() {
        return ornek;
    }

    public void setOrnek(String ornek) {
        this.ornek = ornek;
    }

    public String getKac() {
        return kac;
    }

    public void setKac(String kac) {
        this.kac = kac;
    }

    public Yazar getYazar() {
        return yazar;
    }

    public void setYazar(Yazar yazar) {
        this.yazar = yazar;
    }
}
