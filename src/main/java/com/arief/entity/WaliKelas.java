package com.arief.entity;

import javax.persistence.*;

/**
 * Created by Arief on 8/23/2017.
 */
@Entity
@Table(name="t_wali")
public class WaliKelas {


    @Id
    @Column(name="kode_wali",length = 4)
    private String kodeWali;


    @Column(name="nama_wali")
    private String nama;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_kelas")
    private Kelas kelas;

    public WaliKelas() {
    }

    public WaliKelas(String kodeWali, String nama, Kelas kelas) {
        this.kodeWali = kodeWali;
        this.nama = nama;
        this.kelas = kelas;
    }

    public String getKodeWali() {
        return kodeWali;
    }

    public void setKodeWali(String kodeWali) {
        this.kodeWali = kodeWali;
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
}
