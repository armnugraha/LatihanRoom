package com.xd.afrian.latihanroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface AktivisDao {

    @Insert
    void tambahAktivis(AktivisEntitiy aktivisEntitiy);

    @Delete
    void deleteAktivis(AktivisEntitiy aktivisEntitiy);

    @Query("SELECT * FROM AktivisEntitiy")
    List<AktivisEntitiy> tampilSemuaData();

    @Query("SELECT * FROM AktivisEntitiy WHERE zona_tugas LIKE :zona")
    List<AktivisEntitiy> tampilByZona(String zona);

}
