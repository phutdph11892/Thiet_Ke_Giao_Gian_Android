package com.example.lap5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<Cauhoi> listCauhoi;
    TextView textView;

    // String[] hoi = new String[]{"Cai 1","Cau 2","Cau 3","Cau 4"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lvView);
        listCauhoi = new ArrayList<>();
        Cauhoi ch1 = new Cauhoi("Cau 1:Chon vat mau do", "Dap an :");
        Cauhoi ch2 = new Cauhoi("Cau 2:chon vat mau tim", "Dap an :");
        Cauhoi ch3 = new Cauhoi("Cau 3:chon vat mau hong", "Dap an :");
        Cauhoi ch4 = new Cauhoi("Cau 4:chon vat mau nau", "Dap an :");
        Cauhoi ch5 = new Cauhoi("Cau 5:chon vat mau nau", "Dap an :");
        Cauhoi ch6 = new Cauhoi("Cau 6:chon vat mau nau", "Dap an :");
        Cauhoi ch7 = new Cauhoi("Cau 7:chon vat mau nau", "Dap an :");
        Cauhoi ch8 = new Cauhoi("Cau 8:chon vat mau nau", "Dap an :");
        Cauhoi ch9 = new Cauhoi("Cau 9:chon vat mau nau", "Dap an :");
        Cauhoi ch10 = new Cauhoi("Cau 10:chon vat mau nau", "Dap an :");
        Cauhoi ch11 = new Cauhoi("Cau 11:chon vat mau nau", "Dap an :");
        Cauhoi ch12 = new Cauhoi("Cau 12:chon vat mau nau", "Dap an :");
        Cauhoi ch13 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch15 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch16 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch17 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch18 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch19 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch20 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");
        Cauhoi ch21 = new Cauhoi("Cau 13:chon vat mau nau", "Dap an :");

        listCauhoi.add(ch1);
        listCauhoi.add(ch2);
        listCauhoi.add(ch3);
        listCauhoi.add(ch4);
        listCauhoi.add(ch5);
        listCauhoi.add(ch6);
        listCauhoi.add(ch7);
        listCauhoi.add(ch8);
        listCauhoi.add(ch9);
        listCauhoi.add(ch10);
        listCauhoi.add(ch11);
        listCauhoi.add(ch12);
        listCauhoi.add(ch13);
        listCauhoi.add(ch15);
        listCauhoi.add(ch16);
        listCauhoi.add(ch17);
        listCauhoi.add(ch18);
        listCauhoi.add(ch19);
        listCauhoi.add(ch20);
        listCauhoi.add(ch21);
        textView = findViewById(R.id.btnTl);


    }

    public void bai1(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        final String[] dapAn = new String[]{"Dua do", "Dua Hong", "Dua Nau", "Dua Tim"};
        final TextView tv = findViewById(R.id.btnTl);

        builder.setMultiChoiceItems(dapAn, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                tv.setText(dapAn[which]);
            }
        });


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();

    }

    @Override
    protected void onResume() {
        CauhoiAdapter adapter = new CauhoiAdapter(listCauhoi);
        listView.setAdapter(adapter);
        super.onResume();
    }
}
