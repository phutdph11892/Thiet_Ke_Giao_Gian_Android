package com.example.bai3_lap6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);
        ((TabLayout)this.findViewById(R.id.tabLayout)).setupWithViewPager(viewPager);
        addTabs(viewPager);
    }
    private void addTabs(ViewPager viewPager){
       pagerAdapter adapter  = new pagerAdapter(getSupportFragmentManager());
      adapter.addFrag(new Tab1(),"Tab 1");
      adapter.addFrag(new Tab2(),"Tab 2");
        adapter.addFrag(new Tab3(),"Tab 3");
  viewPager.setAdapter(adapter);
    }
}
