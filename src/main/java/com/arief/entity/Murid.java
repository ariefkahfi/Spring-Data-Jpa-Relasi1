package com.arief.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Arief on 8/23/2017.
 */

@Entity
@Table(name="t_murid")
public class Murid {


    @Id
    @Column(name="nisn",length = 4)
    private int nisn;

    @Column(name="nama_murid")
    private String nama;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "kelas_murid",joinColumns = @JoinColumn(name="nisn"),inverseJoinColumns = @JoinColumn(name="id_kelas"))
    private Kelas kelas;

    @ManyToMany(mappedBy = "muridList")
    private List<Mapel> mapelList;

    public Murid() {
    }

    public Murid(int nisn, String nama, Kelas kelas) {
        this.nisn = nisn;
        this.nama = nama;
        this.kelas = kelas;
    }

    public int getNisn() {
        return nisn;
    }

    public void setNisn(int nisn) {
        this.nisn = nisn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public List<Mapel> getMapelList() {
        return mapelList;
    }

    public void setMapelList(List<Mapel> mapelList) {
        this.mapelList = mapelList;
    }
}
