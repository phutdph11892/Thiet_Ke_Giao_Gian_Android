package com.example.bai2_lap62;

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
        viewPager = findViewById(R.id.viewpager1);

        ((TabLayout)this.findViewById(R.id.tabLayout_6)).setupWithViewPager(viewPager);
        this.addTab(viewPager);
    }
    private void addTab(ViewPager viewPager){
        Lap6Adapter adapter = new Lap6Adapter(getSupportFragmentManager());
        adapter.addFrag(new Lap61_Fragment1(),"ONE");
        adapter.addFrag(new Lap61_Fragment2(),"TWO");
        viewPager.setAdapter(adapter);
    }


}