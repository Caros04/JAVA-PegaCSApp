package com.example.PegaCS.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class user {
    @Id
    private long CIF;
    private String nama;
    private String tipe;

    public user() {
    }

    public user(long CIF, String nama, String tipe) {
        this.CIF = CIF;
        this.nama = nama;
        this.tipe = tipe;
    }

    public long getCIF() {
        return this.CIF;
    }

    public void setCIF(long CIF) {
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

    public user CIF(long CIF) {
        setCIF(CIF);
        return this;
    }

    public user nama(String nama) {
        setNama(nama);
        return this;
    }

    public user tipe(String tipe) {
        setTipe(tipe);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof user)) {
            return false;
        }
        user user = (user) o;
        return CIF == user.CIF && Objects.equals(nama, user.nama) && Objects.equals(tipe, user.tipe);
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
