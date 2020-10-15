package com.example.bai1_lap82.lap84_activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.bai1_lap82.R;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class Lap84_Activity extends AppCompatActivity {
DrawerLayout drawerLayout;
NavigationView navigationView;
ViewPager viewPager;
TabLayout tabLayout;
    Lap84AdapterViewPager adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap84_);
        drawerLayout=findViewById(R.id.drawer_layout_84);
        navigationView = findViewById(R.id.Nav_84);

        viewPager = findViewById(R.id.viewPager84);
        addTabs(viewPager);
        tabLayout=findViewById(R.id.tablayout_84);
        tabLayout.setupWithViewPager(viewPager);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.resust){
//goi fragment
                     viewPager.setAdapter(adapter);
                     viewPager.setCurrentItem(0);
                }else if(item.getItemId()==R.id.black){
                    viewPager.setAdapter(adapter);
                    viewPager.setCurrentItem(1);

                }else if(item.getItemId()==R.id.chilk){

                    viewPager.setAdapter(adapter);
                    viewPager.setCurrentItem(2);
                }
                return false;
            }
        });
    }
    void addTabs(ViewPager viewPager){
         adapter= new Lap84AdapterViewPager(getSupportFragmentManager());
        adapter.addFrag(new Lap84_Fragment1(),"ONE");//tab 1
        adapter.addFrag(new Lap84_Fragment1(),"TWO");//tab 2
        adapter.addFrag(new Lap84_Fragment1(),"THREE");//tab 3
        viewPager.setAdapter(adapter);
    }
}