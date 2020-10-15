package com.example.lap_7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class TextInputActivity extends AppCompatActivity {
    TextInputLayout textInputLayout,textEmail,textPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        textInputLayout = findViewById ( R.id.tvTen );
        textEmail = findViewById ( R.id.tvEmail );
        textPass = findViewById ( R.id.tvPass );

    }
    public void onclick(View view){
        if(textInputLayout.getEditText ().length ()==0){
            textInputLayout.setError ( "Phai nhap ten khong duoc de trong" );
        } else if (textInputLayout.getEditText ().length ()!=0){
            textInputLayout.setError ( "" );
        }
        if(textEmail.getEditText ().length ()==0){
            textEmail.setError ( "Khong duoc de trong" );
        }else if(textEmail.getEditText ().length ()!=0){
            textEmail.setError ( "" );
        }
        if(textPass.getEditText ().length ()==0){
            textPass.setError ( "Khong duoc de trong" );
        }else if(textPass.getEditText ().length ()<6){
            textPass.setError ( "Mat khau phai dai hon 6 ki tu" );
        }else if(textPass.getEditText ().length ()>6){
            textPass.setError ( "" );
        }
    }
}
