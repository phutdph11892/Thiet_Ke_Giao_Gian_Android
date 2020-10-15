package com.example.bai1_lap7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void Bai1(View view) {
        Intent intent = new Intent(this, Bai1Activity.class);
        startActivity(intent);
    }

    public void Bai2(View view) {
        Intent intent = new Intent(this, Bai2Activity.class);
        startActivity(intent);

    }

    public void Bai3(View view) {
        Intent intent = new Intent(this, Bai3Activity.class);
        startActivity(intent);

    }

    public void Bai4(View view) {
        Intent intent = new Intent(this, Bai4Activity.class);
        startActivity(intent);
    }

    public void Bai5(View view) {
        Intent intent = new Intent(this, Bai5Activity.class);
        startActivity(intent);
    }
}