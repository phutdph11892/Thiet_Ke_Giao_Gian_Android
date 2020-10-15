package com.example.bai4_lap62.lap67interface;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.bai4_lap62.R;


public class Lap67_Fragment1 extends Fragment {
Button button1;
EditText editText1;
ActionIntarface actionIntarface;

    public Lap67_Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_lap67_1, container, false);
        button1 = view.findViewById(R.id.button_67_fra1);
        editText1 = view.findViewById(R.id.editText67_fra1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         actionIntarface=(ActionIntarface)getActivity();
         actionIntarface.action(editText1.getText().toString());
            }
        });
        return view;
    }
}