package com.example.bai1_lap82.lap3_NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.bai1_lap82.R;
import com.google.android.material.navigation.NavigationView;

public class Lap83_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap83_);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout_83);
        NavigationView navigationView = findViewById(R.id.Nav_83);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.resust){
                    Toast.makeText(getApplicationContext(),"Refret",Toast.LENGTH_LONG).show();
                }else  if(item.getItemId()==R.id.black){
                    Toast.makeText(getApplicationContext(),"Black",Toast.LENGTH_LONG).show();}
                else  if(item.getItemId()==R.id.chilk){
                    Toast.makeText(getApplicationContext(),"Chick",Toast.LENGTH_LONG).show();}
                return false;
            }
        });
    }
}