package com.example.bai1_lap82.lap84_activity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bai1_lap82.R;


public class Lap84_Fragment1 extends Fragment {

TextView textView;

    public Lap84_Fragment1() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_lap84_1, container, false);
        textView=view.findViewById(R.id.textView_frag1_84);
        return view;
    }
}