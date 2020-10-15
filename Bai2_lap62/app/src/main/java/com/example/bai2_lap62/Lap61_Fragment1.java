package com.example.bai2_lap62;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class Lap61_Fragment1 extends Fragment {
Button btn1;
EditText edt1;
    public Lap61_Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_lap61_1, container, false);

       btn1 = view.findViewById(R.id.btn1);
       edt1 = view.findViewById(R.id.edt1);

       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              // ((MainActivity)getActivity()).editText.setText("Truy xuat activity");
           }
       });
        return view;
    }
}