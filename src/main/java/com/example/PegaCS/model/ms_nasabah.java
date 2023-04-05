package com.example.PegaCS.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MS_NASABAH")
public class ms_nasabah {
    @Id
    private int CIF;
    private String nama;
    private String tipe;

    public ms_nasabah() {
    }

    public ms_nasabah(int CIF, String nama, String tipe) {
        this.CIF = CIF;
        this.nama = nama;
        this.tipe = tipe;
    }

    public int getCIF() {
        return this.CIF;
    }

    public void setCIF(int CIF) {
        this.CIF = CIF;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTipe() {
        return this.tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public ms_nasabah CIF(int CIF) {
        setCIF(CIF);
        return this;
    }

    public ms_nasabah nama(String nama) {
        setNama(nama);
        return this;
    }

    public ms_nasabah tipe(String tipe) {
        setTipe(tipe);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ms_nasabah)) {
            return false;
        }
        ms_nasabah ms_nasabah = (ms_nasabah) o;
        return CIF == ms_nasabah.CIF && Objects.equals(nama, ms_nasabah.nama) && Objects.equals(tipe, ms_nasabah.tipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CIF, nama, tipe);
    }

    @Override
    public String toString() {
        return "{" +
                " CIF='" + getCIF() + "'" +
                ", nama='" + getNama() + "'" +
                ", tipe='" + getTipe() + "'" +
                "}";
    }

}
