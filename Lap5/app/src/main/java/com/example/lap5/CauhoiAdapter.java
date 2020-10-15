package com.example.lap5;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.List;

public class CauhoiAdapter extends BaseAdapter {
    List<Cauhoi> cauhoiList;
    String da = "";

    public CauhoiAdapter(List<Cauhoi> cauhoiList) {
        this.cauhoiList = cauhoiList;
    }

    @Override
    public int getCount() {
        return cauhoiList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        TextView tvcauhoi = convertView.findViewById(R.id.tvCtl);
        final TextView btntl = convertView.findViewById(R.id.btnTl);
        Button button = convertView.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(parent.getContext());
                final String[] dapAn = new String[]{"Dua do","Dua Hong","Dua Nau","Dua Tim"};

                builder.setTitle(cauhoiList.get(position).tenCH);
                builder.setMultiChoiceItems(dapAn, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        da = dapAn[which];
                    }
                });



                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        cauhoiList.get(position).setDapAN(da);
                        btntl.setText(cauhoiList.get(position).dapAN);
                    }
                });

                builder.show();
            }
        });
        Cauhoi cauhoi = cauhoiList.get(position);
        tvcauhoi.setText(cauhoi.getTenCH());
        btntl.setText(cauhoi.getDapAN());
        return convertView;
    }
}
