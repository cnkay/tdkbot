package com.example.demo.Entity;

import javax.persistence.*;
@Entity
public class Atasozu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long atasozu_id;
    @Column(columnDefinition = "NVARCHAR(2000)")
    private String atasozu;
//    @ManyToOne(cascade = {CascadeType.ALL})
//    private Kelime kelime;

    public Atasozu() {
    }

    public Atasozu(String atasozu) {
        this.atasozu = atasozu;
    }

    public Long getAtasozu_id() {
        return atasozu_id;
    }

    public void setAtasozu_id(Long atasozu_id) {
        this.atasozu_id = atasozu_id;
    }

    public String getAtasozu() {
        return atasozu;
    }

    public void setAtasozu(String atasozu) {
        this.atasozu = atasozu;
    }
}
