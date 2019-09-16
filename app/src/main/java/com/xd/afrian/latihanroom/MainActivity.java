package com.xd.afrian.latihanroom;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static AppDatabase db;
    private AktivisEntitiy aktivisEntitiy;

//    tampil data
    List<AktivisEntitiy> aktivisEntitiyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "aktivis")
                .allowMainThreadQueries().build();

        //db.aktivisDao().tampilSemuaData();

        Log.d("TAMBAH", "TAMBAH DATA AKTIVIS");
        Log.d("TAMBAH", "===================");

        aktivisEntitiy = new AktivisEntitiy();
        aktivisEntitiy.setNamaAktivis("Arman Nugraha");
        aktivisEntitiy.setEmailAktivis("armannugraha@gmail.com");
        aktivisEntitiy.setZonaTugas("Bandung");

        db.aktivisDao().tambahAktivis(aktivisEntitiy);

        Log.d("Tambah", "Nama : " + aktivisEntitiy.getNamaAktivis());
        Log.d("Tambah", "Email : " + aktivisEntitiy.getEmailAktivis());
        Log.d("Tambah", "Zona : " + aktivisEntitiy.getZonaTugas());

        Log.e("TAMPIL", "TAMBAH DATA AKTIVIS");
        Log.e("TAMPIL", "===================");

        aktivisEntitiyList = db.aktivisDao().tampilSemuaData();

        for (int i = 0; i < aktivisEntitiyList.size(); i++){
            Log.e("Tampil", "Data Aktivis ke - " + (i+1));
            Log.e("Tampil", "Nama : " + aktivisEntitiyList.get(i).getNamaAktivis());
            Log.e("Tampil", "Email : " + aktivisEntitiyList.get(i).getEmailAktivis());
            Log.e("Tampil", "Zona : " + aktivisEntitiyList.get(i).getZonaTugas());
        }
    }
}
