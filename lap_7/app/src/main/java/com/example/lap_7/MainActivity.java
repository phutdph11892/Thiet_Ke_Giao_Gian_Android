package com.example.lap_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bai1(View view){
        Intent intent = new Intent(this,Bai1Activity.class);
        startActivity(intent);
    }
    public void bai2(View view){
        Intent intent = new Intent(this,TextInputActivity.class);
        startActivity(intent);
    }
    public void bai4(View view){
        Intent intent = new Intent(this,BottonNavigation.class);
        startActivity(intent);
    }
}
