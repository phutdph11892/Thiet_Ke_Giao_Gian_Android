package com.example.bai2_lap82.lap87;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bai2_lap82.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity_87 extends AppCompatActivity {
RecyclerView recyclerView;
List<User87> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_87);
        recyclerView=findViewById(R.id.recycle_87);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        list.add(new User87("Nguyen Van A",R.mipmap.ic_launcher));
        list.add(new User87("Nguyen Van b",R.mipmap.ic_launcher));
        list.add(new User87("Nguyen Van c",R.mipmap.ic_launcher));
        list.add(new User87("Nguyen Van d",R.mipmap.ic_launcher));
        list.add(new User87("Nguyen Van h",R.mipmap.ic_launcher));
        Lap87Adapter adapter = new Lap87Adapter(list,this);
        recyclerView.setAdapter(adapter);


    }
}