package com.example.bai1_lap7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class Bai2Activity extends AppCompatActivity {
    Button button;

    TextInputLayout textInputLayout1,textInputLayout2,textInputLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        button = findViewById(R.id.btndangnhap);
        textInputLayout1 = findViewById(R.id.textinput1);
        textInputLayout2 = findViewById(R.id.textinput2);
        textInputLayout3 =findViewById(R.id.textinput3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textInputLayout1.getEditText().length()==0){
                    textInputLayout1.setError("Phai nhap ten");
                }else{
                    textInputLayout1.setError("");
                }
                 if(textInputLayout2.getEditText().length()==0){
                    textInputLayout2.setError("Email khong duoc trong");
                }else if(!isValidateEmail(textInputLayout2.getEditText().getText())){
                     textInputLayout2.setError("Khong dung dinh dang email!!!");
                 }else{
                     textInputLayout2.setError("");
                }
                  if(textInputLayout3.getEditText().length()==0){
                    textInputLayout3.setError("Khong duoc de trong mat khau");
                }else if(textInputLayout3.getEditText().length()<=6){
                    textInputLayout3.setError("Mat khau phai lon hon 6 ki tu");
                }else {
                      textInputLayout3.setError("");
                  }
            }
        });
    }
    public boolean isValidateEmail(CharSequence e){
        return  !TextUtils.isEmpty(e) && Patterns.EMAIL_ADDRESS.matcher(e).matches();
    }
}