package com.example.bai4_lap62.lap67interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.bai4_lap62.R;

public class MainActivity extends AppCompatActivity implements ActionIntarface{
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText=findViewById(R.id.editText67_main);
    }

    @Override
    public void action(String s) {
editText.setText(s);
    }
}