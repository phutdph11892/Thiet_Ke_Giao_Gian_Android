package com.example.bai1_lap7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


import com.google.android.material.snackbar.Snackbar;

public class Bai1Activity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        button = findViewById(R.id.btnsnack);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view,"chac chua",
                Snackbar.LENGTH_LONG)
                        .setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }).show();
            }
        });
    }
}