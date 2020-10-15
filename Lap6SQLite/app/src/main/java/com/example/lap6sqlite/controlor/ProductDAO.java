package com.example.lap6sqlite.controlor;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.lap6sqlite.database.SQLiteHelper;
import com.example.lap6sqlite.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private SQLiteDatabase db;
    private SQLiteOpenHelper dbHelper;
    private Context context;
    public static final String SQL_TAO_BANG_PRODUCT = "CREATE TABLE product(" +
            "maSP text,tenSP text,soLuongSP text)";
    public static final String TABLE_NAME ="product";

    public ProductDAO(Context context) {
        this.context = context;
        dbHelper = new SQLiteHelper(context);
        db= dbHelper.getWritableDatabase();
    }
    //insert
    public int insertProduct(Product product){
        ContentValues values = new ContentValues();
        values.put("maSP",product.getMaSP());
        values.put("tenSP",product.getTenSP());
        values.put("soLuongSP",String.valueOf(product.getSoLuongSP()));
        if(db.insert(TABLE_NAME,null,values)<0){
            return -1;//insert khong thanh cong
        }
        return 1;//insert thanh cong
    }
    public List<Product> getListProduct(){
  List<Product> ls =new  ArrayList<>();
        Cursor cursor =db.query(TABLE_NAME,null,null,null,null,null,null);
               cursor.moveToFirst();
               while (cursor.isAfterLast()==false){
                  Product product = new Product();
                  product.setMaSP(cursor.getString(0));
                  product.setTenSP(cursor.getString(1));
                  product.setSoLuongSP(cursor.getString(2));
                    ls.add(product);
                     cursor.moveToNext();
               }
               cursor.close();
               return ls;
    }

    public int deleProduct(String maSP){
         if(db.delete(TABLE_NAME,"maSP=?",new String[]{maSP})<0){
             return -1;//xoa khong thanh cong
         }
            return 1;//xoa thanh cong
    }
    public int UpdateProduct(Product product){
        ContentValues values = new ContentValues();
        values.put("maSP",product.getMaSP());
        values.put("tenSP",product.getTenSP());
        values.put("soLuongSP",product.getSoLuongSP());
if(db.update(TABLE_NAME,values,"maSP=?",new String[]{product.getMaSP()})<0){
      return -1;//update that bai
}
      return 1;//update thanh cong
    }
}
