package com.example.bai1_lap2_dd;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView tvPoly;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvPoly = findViewById(R.id.tvpoLy);
        Typeface from = Typeface.createFromAsset(getAssets(),"blazed.ttf");
        tvPoly.setTypeface(from);
    }
}
