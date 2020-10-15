package com.example.bai1_lap5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6;
TextView tv1,tv2;
Calendar c;
TimePicker timePicker;
String[] mau ;
String [] color;

    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        final Context context=this;//khai bao context
        mau = getResources().getStringArray(R.array.mau);//doc mang
        color = getResources().getStringArray(R.array.color);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              AlertDialog.Builder builder = new AlertDialog.Builder(context);
              builder.setTitle("Aler listView");
              builder.setItems(R.array.mau, new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      Toast.makeText(getApplicationContext(),"Ban chon mau"+mau[which],Toast.LENGTH_SHORT).show();
                  }
              });
              AlertDialog alertDialog = builder.create();
              alertDialog.show();


            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder  builder = new AlertDialog.Builder(context);
      builder.setTitle("Aler listView");
       builder.setMultiChoiceItems(mau, null, new DialogInterface.OnMultiChoiceClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which, boolean isChecked) {
               switch (which){
                   case 0:
                       Toast.makeText(getApplicationContext(),mau[which],Toast.LENGTH_SHORT).show();
                       break;
                   case 1:
                       Toast.makeText(getApplicationContext(),mau[which],Toast.LENGTH_SHORT).show();
                       break;
                   case 2:
                       Toast.makeText(getApplicationContext(),mau[which],Toast.LENGTH_SHORT).show();
                       break;
               }
           }
       });
      AlertDialog alertDialog = builder.create();
      alertDialog.show();
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //dinh nghi buider
               AlertDialog.Builder builder =new AlertDialog.Builder(context);
               builder.setTitle("Alert Radio");
               builder.setSingleChoiceItems(color, -1, new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                     Toast.makeText(getApplicationContext(),color[which],Toast.LENGTH_LONG).show();
                   }
               });
               //tao alert
                AlertDialog alertDialog = builder.create();
                alertDialog.show();//hien thi alert
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ding nghia buder
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle("Alert Ok");
                builder.setMessage("Xin Thong Bao .......");
             builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                         Toast.makeText(getApplicationContext(),"OK",Toast.LENGTH_LONG).show();
                 }
             });
             builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                       Toast.makeText(getApplicationContext(),"cancel",Toast.LENGTH_LONG).show();
                 }
             });

                //tao alert
              AlertDialog alertDialog = builder.create();
              alertDialog.show();//hien thi alert
            }

        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = ProgressDialog.show(context,"Downloading...","Please wait... ",true);
                progressDialog.setCancelable(true);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog = new ProgressDialog(context);
                progressDialog.setTitle("DoawLing....");
                progressDialog.setMessage("pleattea....");
                progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
                progressDialog.setMax(10);
                progressDialog.show();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressDialog.getProgress()<=progressDialog.getMax()){
                            try {
                                Thread.sleep(1000);


                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {
                                        progressDialog.incrementProgressBy(2);
                                    }
                                });
                                            if(progressDialog.getProgress()==progressDialog.getMax()){
                                                progressDialog.dismiss();
                                            }
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }).start();
            }
        });

    }
}