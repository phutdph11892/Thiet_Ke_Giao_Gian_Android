package com.example.bai1_lap7.bai_lap76;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;

import com.example.bai1_lap7.R;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity_lap76 extends AppCompatActivity {
Button button;
TextInputLayout textInputLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lap76);
        button=findViewById(R.id.button_706);
        textInputLayout=findViewById(R.id.textinput_layout76);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isValidaEmail(textInputLayout.getEditText().getText())){
                    textInputLayout.setError("Khong dung dinh dang");
                }else{
                    textInputLayout.setError("");
                }
            }
        });
    }
    public boolean isValidaEmail(CharSequence e){
        return !TextUtils.isEmpty(e)&& Patterns.EMAIL_ADDRESS.matcher(e).matches();
    }
}