package com.example.PegaCS.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MS_NASABAH")
public class nasabah {
    @Id
    private Long CIF;
    private String Nama;
    private String tipe;
    private long kodecabang;

    public nasabah() {
    }

    public nasabah(Long CIF, String Nama, String tipe, long kodeCabang) {
        this.CIF = CIF;
        this.Nama = Nama;
        this.tipe = tipe;
        this.kodecabang = kodeCabang;
    }

    public Long getCIF() {
        return this.CIF;
    }

    public void setCIF(Long CIF) {
        this.CIF = CIF;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public long getKodeCabang() {
        return this.kodecabang;
    }

    public void setKodeCabang(long kodeCabang) {
        this.kodecabang = kodeCabang;
    }

    public nasabah CIF(Long CIF) {
        setCIF(CIF);
        return this;
    }

    public nasabah Nama(String Nama) {
        setNama(Nama);
        return this;
    }

    public nasabah tipe(String tipe) {
        setTipe(tipe);
        return this;
    }

    public nasabah kodeCabang(long kodeCabang) {
        setKodeCabang(kodeCabang);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof nasabah)) {
            return false;
        }
        nasabah nasabah = (nasabah) o;
        return Objects.equals(CIF, nasabah.CIF) && Objects.equals(Nama, nasabah.Nama)
                && Objects.equals(tipe, nasabah.tipe) && kodecabang == nasabah.kodecabang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(CIF, Nama, tipe, kodecabang);
    }

    @Override
    public String toString() {
        return "{" +
                " CIF='" + getCIF() + "'" +
                ", Nama='" + getNama() + "'" +
                ", tipe='" + getTipe() + "'" +
                ", kodeCabang='" + getKodeCabang() + "'" +
                "}";
    }

}
