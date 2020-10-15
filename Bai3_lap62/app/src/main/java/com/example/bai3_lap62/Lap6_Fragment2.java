package com.example.bai3_lap62;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Lap6_Fragment2 extends Fragment {
Button btn2;
EditText edt2;


    public Lap6_Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lap6_2, container, false);
        btn2 = view.findViewById(R.id.btn_fragment2);
        edt2 =view.findViewById(R.id.editTextfragment2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String tag="android:switcher:"+R.id.viewPager2+":"+0;//truy xuat fragment1 trong viewPager
       FragmentManager fm = getActivity().getSupportFragmentManager();
       Lap6_Fragment1 fragment1 = (Lap6_Fragment1)fm.findFragmentByTag(tag);
       fragment1.edt1.setText("frg2 truy xuat frg1");
            }
        });
        return view;
    }
}