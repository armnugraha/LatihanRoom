package com.xd.afrian.latihanroom;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class AktivisEntitiy {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "nama_aktivis")
    private String namaAktivis;

    @ColumnInfo(name = "email_aktivis")
    private String emailAktivis;

    @ColumnInfo(name = "zona_tugas")
    private String zonaTugas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaAktivis() {
        return namaAktivis;
    }

    public void setNamaAktivis(String namaAktivis) {
        this.namaAktivis = namaAktivis;
    }

    public String getEmailAktivis() {
        return emailAktivis;
    }

    public void setEmailAktivis(String emailAktivis) {
        this.emailAktivis = emailAktivis;
    }

    public String getZonaTugas() {
        return zonaTugas;
    }

    public void setZonaTugas(String zonaTugas) {
        this.zonaTugas = zonaTugas;
    }
}
