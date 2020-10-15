package com.example.bai3_lap62;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Lap6_Fragment1 extends Fragment {
Button btn1;
EditText edt1;

    public Lap6_Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_lap6_1, container, false);
       btn1=view.findViewById(R.id.btn_fragment1);
       edt1 = view.findViewById(R.id.editTextFragment1);
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String tag="android:switcher:"+R.id.viewPager2+":"+1;//truy xuat fragment2
               FragmentManager fm=getActivity().getSupportFragmentManager();
               Lap6_Fragment2 fragment2 = (Lap6_Fragment2)fm.findFragmentByTag(tag);
             fragment2.edt2.setText("dajsbd");
           }
       });
        return view;
    }
}