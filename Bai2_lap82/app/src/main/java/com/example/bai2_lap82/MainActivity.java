package com.example.bai2_lap82;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawer_9);
        navigationView = findViewById(R.id.Nav_9);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.resust){
                    Toast.makeText(getApplicationContext(),"Rrfest",Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else  if(item.getItemId()==R.id.black){

                    Toast.makeText(getApplicationContext(),"Black",Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }else  if(item.getItemId()==R.id.chilk){
                    Toast.makeText(getApplicationContext(),"Chilk",Toast.LENGTH_LONG).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });
    }
}