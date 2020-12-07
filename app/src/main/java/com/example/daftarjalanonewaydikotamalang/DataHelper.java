package com.example.daftarjalanonewaydikotamalang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "jalanan.db";
    private static final int DATABASE_VERTSION = 1;
    public DataHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERTSION);
    }
    @Override
    public void OnCreate (SQLiteDatabase db) {
        String sql = "create table jalanan (no integer primary key, nama_jalan text null, kecamatan text null, landmark text null";);
        Log.d("Data"."OnCreate: "+sql);
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade (SQLiteDatabase arg0, int arg1, int arg2){

    }

}
