package com.example.lap6sqlite.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.lap6sqlite.controlor.ProductDAO;

public class SQLiteHelper extends SQLiteOpenHelper {
    public static final String DB_NAME ="qlsp";
    public static final int version=1;
//tao db
    public SQLiteHelper( Context context) {
        super(context, DB_NAME,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
  db.execSQL(ProductDAO.SQL_TAO_BANG_PRODUCT);
    }
//upgare bang
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
db.execSQL("DROP TABLE IF EXISTS p"+ProductDAO.SQL_TAO_BANG_PRODUCT);
    }
}
