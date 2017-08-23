package com.arief.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Arief on 8/23/2017.
 */

@Entity
@Table(name="t_mapel")
public class Mapel {


    @Id
    @Column(name="id_mapel",length = 3)
    private String kodeMapel;

    @Column(name="nama")
    private String nama;


    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.REMOVE,CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinTable(name = "mapel_murid",joinColumns = @JoinColumn(name="id_mapel"),inverseJoinColumns = @JoinColumn(name="nisn"))
    private List<Murid> muridList;

    public Mapel() {
    }

    public Mapel(String kodeMapel, String nama, List<Murid> muridList) {
        this.kodeMapel = kodeMapel;
        this.nama = nama;
        this.muridList = muridList;
    }

    public String getKodeMapel() {
        return kodeMapel;
    }

    public void setKodeMapel(String kodeMapel) {
        this.kodeMapel = kodeMapel;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public List<Murid> getMuridList() {
        return muridList;
    }

    public void setMuridList(List<Murid> muridList) {
        this.muridList = muridList;
    }
}
