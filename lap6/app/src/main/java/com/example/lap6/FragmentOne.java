package com.example.lap6;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class FragmentOne extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       final View view= inflater.inflate(R.layout.fragment_one, container, false);

       final Button button = view.findViewById(R.id.btn1);
        final Button button1 = view.findViewById(R.id.btn2);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               TextView tv1 = (TextView) getActivity().findViewById(R.id.tvSo);
               tv1.setText("2");

           }
       });

         FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
           TextView textView1 = (TextView) getActivity().findViewById(R.id.textView2);
               TextView textView2 = (TextView) getActivity().findViewById(R.id.tvSo);
               TextView textView3 = (TextView) getActivity().findViewById(R.id.tv3);
            textView1.setBackgroundColor(Color.GREEN);
               textView2.setBackgroundColor(Color.GREEN);
               textView3.setBackgroundColor(Color.GREEN);
           }
       });
       return view;
    }
}
