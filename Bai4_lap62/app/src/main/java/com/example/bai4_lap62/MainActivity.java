package com.example.bai4_lap62;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 button = findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               FragmentManager fm = getSupportFragmentManager();
               Fragment fra1 =(Lap65_Fragment1)fm.findFragmentById(R.id.fragment1);
               fm.beginTransaction().hide(fra1).commit();
            }
        });
    }
}