package com.example.bai2_lap8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
String[] titel,subtitel;

int[] imgame={R.drawable.anh_du_lich1,R.drawable.anh_du_lich2,R.drawable.anh_du_lich3,R.drawable.anh_du_lich4,R.drawable.anh_du_lich5};

    AdapterClass adapterClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
titel=getResources().getStringArray(R.array.titel);
subtitel=getResources().getStringArray(R.array.sub_titel);



       adapterClass = new AdapterClass(getApplicationContext(),titel,subtitel,imgame);


 recyclerView.setAdapter(adapterClass);

 recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}