package com.example.bai1_lap7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
Button button;
TextInputLayout textInputLayout;
FloatingActionButton floatingActionButton;
BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btn_701);
        textInputLayout=findViewById(R.id.textInput_701);
        floatingActionButton=findViewById(R.id.floatingActionButton701);
        navigationView = findViewById(R.id.Nav701);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId()==R.id.refesh){
                    Toast.makeText(getApplicationContext(),"Refres",Toast.LENGTH_LONG).show();
                }else if(item.getItemId()==R.id.bakup){
                    Toast.makeText(getApplicationContext(),"backup",Toast.LENGTH_LONG).show();
                }else if(item.getItemId()==R.id.child){
                    Toast.makeText(getApplicationContext(),"Child",Toast.LENGTH_LONG).show();
                }
                return false;
            }
        });
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Thong bao",Toast.LENGTH_LONG).show();
            }
        });

    }
    public void display_snackBak(View view){
//        Snackbar.make(findViewById(R.id.btn_701),"Thong Bao",5000)
//                .setActionTextColor(Color.RED)
//                .setAction("ok", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                })
//                .show();

        if(textInputLayout.getEditText().length()==0){
            textInputLayout.setError("Phai nhap ho ten");
        }
        else{
            textInputLayout.setError("");
        }
    }
}