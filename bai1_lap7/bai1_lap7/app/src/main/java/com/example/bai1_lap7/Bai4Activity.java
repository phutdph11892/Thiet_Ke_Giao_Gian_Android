package com.example.bai1_lap7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bai4Activity extends AppCompatActivity {
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        navigationView =(BottomNavigationView)findViewById(R.id.nav1);
        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.icon1){
                    Toast.makeText(Bai4Activity.this,"Click Mới nhất",Toast.LENGTH_SHORT).show();
                } else if(item.getItemId()==R.id.icon2){
                    Toast.makeText(Bai4Activity.this,"Click Yêu thích",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Bai4Activity.this,"Click Ngẫu nhiên",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}