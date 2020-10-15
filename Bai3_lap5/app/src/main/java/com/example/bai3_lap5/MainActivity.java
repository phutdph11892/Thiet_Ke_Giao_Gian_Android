package com.example.bai3_lap5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
TextView tvResurt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tvResurt=findViewById(R.id.tvResurt);
        final Context context=this;

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                LayoutInflater inflater = getLayoutInflater();
                View view = inflater.inflate(R.layout.layout_login_activity,null);
                builder.setView(view);
                final EditText txtUser = (EditText)view.findViewById(R.id.edt1);
                final EditText txtPss =(EditText)view.findViewById(R.id.edt2);
                builder.setTitle("Login");
                builder.setCancelable(false);
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     tvResurt.setText(txtUser.getText().toString());
                        Toast.makeText(context,txtUser.getText().toString(),Toast.LENGTH_LONG).show();
                        
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });
    }
}