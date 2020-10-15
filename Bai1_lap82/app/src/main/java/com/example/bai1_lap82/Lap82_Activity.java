package com.example.bai1_lap82;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Lap82_Activity extends AppCompatActivity {
RecyclerView recyclerView;
List<User82> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap82_);
        recyclerView = findViewById(R.id.recyclerView_82);
        //lay du lieu
        list.add(new User82("Nguyen Van A",R.mipmap.ic_launcher));
        list.add(new User82("Nguyen Van b",R.mipmap.ic_launcher));
        list.add(new User82("Nguyen Van c",R.mipmap.ic_launcher));
        list.add(new User82("Nguyen Van d",R.mipmap.ic_launcher));
        list.add(new User82("Nguyen Van g",R.mipmap.ic_launcher));

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        Lap82Adapter lap82Adapter = new Lap82Adapter(list,this);
        recyclerView.setAdapter(lap82Adapter);
    }
}