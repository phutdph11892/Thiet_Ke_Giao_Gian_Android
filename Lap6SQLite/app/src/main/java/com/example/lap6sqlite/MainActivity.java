package com.example.lap6sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lap6sqlite.ProductDatabase.ProductAdapter;
import com.example.lap6sqlite.controlor.ProductDAO;
import com.example.lap6sqlite.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText txtMaSP;
EditText txtTenSP;
EditText txtSoLuongSP;
ProductDAO productDAO;
ListView lv;
    private List<Product> lsProuduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.lv);
        txtMaSP=findViewById(R.id.txtMaSP);
        txtTenSP=findViewById(R.id.txtTenSP);
        txtSoLuongSP=findViewById(R.id.txtSoLuongSP);
        productDAO = new ProductDAO(this);
    }
    public void them(View view){
        Product product = new Product();
        product.setMaSP(txtMaSP.getText().toString());
        product.setTenSP(txtTenSP.getText().toString());
        product.setSoLuongSP(txtSoLuongSP.getText().toString());
      if(productDAO.insertProduct(product)>0){
          Toast.makeText(getApplicationContext(),"Them Thanh Cong",Toast.LENGTH_LONG).show();
      }else{
          Toast.makeText(getApplicationContext(),"Them That Bai",Toast.LENGTH_LONG).show();
      }
    }
    public void xem(View view){
        List<Product> products = new ArrayList<>();
        products = productDAO.getListProduct();
        ProductAdapter productAdapter = new ProductAdapter(this,R.layout.i,products);
        lv.setAdapter(productAdapter);
    }

    List<String> list = new ArrayList<>();

    public void Sua(View view) {
        Product product = new Product();
        product.setMaSP(txtMaSP.getText().toString());
        product.setTenSP(txtTenSP.getText().toString());
        product.setSoLuongSP(txtSoLuongSP.getText().toString());
        if (productDAO.UpdateProduct(product) > 0) {
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
            lv.setAdapter(adapter);
            Toast.makeText(MainActivity.this,"Sua thanh cong",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(MainActivity.this,"Sua thanh cong",Toast.LENGTH_LONG).show();
        }
    }
}
