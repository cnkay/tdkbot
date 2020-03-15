package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class Ozellik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long ozellik_id;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String tur;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String tamAd;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String kisa_ad;
    /*@ManyToOne(cascade = {CascadeType.ALL})
    private Anlam anlam;*/

    public Ozellik() {
    }

    public Ozellik(String tur, String tamAd, String kisa_ad) {
        this.tur = tur;
        this.tamAd = tamAd;
        this.kisa_ad = kisa_ad;
    }

    public Long getOzellik_id() {
        return ozellik_id;
    }

    public void setOzellik_id(Long ozellik_id) {
        this.ozellik_id = ozellik_id;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
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

}
