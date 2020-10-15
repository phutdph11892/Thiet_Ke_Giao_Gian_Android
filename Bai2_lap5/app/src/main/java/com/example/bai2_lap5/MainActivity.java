package com.example.bai2_lap5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2;
TextView tvResurt;
TimePicker timePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        tvResurt = findViewById(R.id.tvResurt);
    final Context context = this;//tao context
        Calendar calendar = Calendar.getInstance();//lay thoi gian
        final  int year = calendar.get(calendar.YEAR);
        final  int month = calendar.get(calendar.MONTH);
        final  int day = calendar.get(calendar.DAY_OF_MONTH);
         final int hour =calendar.get(calendar.HOUR);
         final int minute = calendar.get(calendar.MINUTE);

         timePicker= findViewById(R.id.tpk);
         timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
             @Override
             public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                 tvResurt.setText(hourOfDay+":"+minute);
             }
         });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
       tvResurt.setText(day+"/"+(month+1)+"/"+dayOfMonth);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TimePickerDialog timePickerDialog = new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
         tvResurt.setText(hourOfDay+":"+minute);
                    }
                },hour,minute, DateFormat.is24HourFormat(context));
                timePickerDialog.show();
            }
        });
    }
}