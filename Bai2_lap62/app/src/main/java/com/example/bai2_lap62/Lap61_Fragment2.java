package com.example.bai2_lap62;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


public class Lap61_Fragment2 extends Fragment {
Button btn2;
EditText edt2;


    public Lap61_Fragment2() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_lap61_2, container, false);

        btn2=view.findViewById(R.id.btn_fragment2);
        edt2=view.findViewById(R.id.editT_fragem2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm =getActivity().getSupportFragmentManager();
                //truy xuat fragment1
              //  Lap61_Fragment1 fragment1=(Lap61_Fragment1)fm.findFragmentById(R.id.fragment01);
               // fragment1.edt1.setText("Fragment2 truy xuat Fragment1");
            }
        });
        return view;
    }
}