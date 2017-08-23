package com.arief.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Arief on 8/23/2017.
 */
@Entity
@Table(name="t_kelas")
public class Kelas {

    @Id
    @Column(name="id_kelas")
    private String idKelas;


    @OneToOne(mappedBy = "kelas")
    private WaliKelas waliKelas;

    @OneToMany(mappedBy = "kelas")
    private List<Murid> muridList;

    public Kelas() {
    }


    public Kelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public Kelas(String idKelas, List<Murid> muridList) {
        this.idKelas = idKelas;
        this.muridList = muridList;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public WaliKelas getWaliKelas() {
        return waliKelas;
    }

    public void setWaliKelas(WaliKelas waliKelas) {
        this.waliKelas = waliKelas;
    }

    public List<Murid> getMuridList() {
        return muridList;
    }

    public void setMuridList(List<Murid> muridList) {
        this.muridList = muridList;
    }
}
