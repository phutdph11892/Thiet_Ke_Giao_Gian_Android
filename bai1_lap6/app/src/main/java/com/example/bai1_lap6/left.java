package com.example.bai1_lap6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class left extends Fragment {
    Button btn1,btn2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.left, container, false);
        btn1 = view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                right right = new right();
                right1 right1 = new right1();
                fragmentTransaction.remove(right);
                fragmentTransaction.add(R.id.frame,right1);
                fragmentTransaction.commit();

            }
        });



        btn2 = view.findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                TextView tvso = getActivity().findViewById(R.id.tvso1);

                tvso.setText("2");

            }

        });

        return view;
    }
}
