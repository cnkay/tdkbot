package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class Birlesik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long birlesik_id;
    @Column(columnDefinition = "NVARCHAR(255)")
    private String birlesik;
  /*  @ManyToOne(cascade = {CascadeType.ALL})
    private Kelime kelime;*/

    public Birlesik() {
    }

    public Birlesik(String birlesik) {
        this.birlesik = birlesik;
    }

    public Long getBirlesik_id() {
        return birlesik_id;
    }

    public void setBirlesik_id(Long birlesik_id) {
        this.birlesik_id = birlesik_id;
    }

    public String getBirlesik() {
        return birlesik;
    }

    public void setBirlesik(String birlesik) {
        this.birlesik = birlesik;
    }
}
