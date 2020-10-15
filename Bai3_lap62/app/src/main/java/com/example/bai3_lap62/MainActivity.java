package com.example.bai3_lap62;

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
        viewPager = findViewById(R.id.viewPager2);
        addFrag(viewPager);
        ((TabLayout)this.findViewById(R.id.tabLayout2)).setupWithViewPager(viewPager);
    }
    private void addFrag(ViewPager viewPager){
   lap6Adapter adapter = new lap6Adapter(getSupportFragmentManager());
 adapter.addTab(new Lap6_Fragment1(),"FRM1");
 adapter.addTab(new Lap6_Fragment2(),"FRM2");
 viewPager.setAdapter(adapter);
    }
}