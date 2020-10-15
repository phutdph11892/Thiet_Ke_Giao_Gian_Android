package com.example.bai2_lap8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.MyViewHoler> {

    Context context;
    String[] titel,subtitel;
    int[] images;


    public AdapterClass(Context context, String[] titel, String[] subtitel, int[] images) {
        this.context=context;
        this.titel=titel;
        this.subtitel=subtitel;
        this.images=images;
    }

    @NonNull
    @Override
    public AdapterClass.MyViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(context);
       View view= layoutInflater.inflate(R.layout.design,parent,false);

        return new MyViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterClass.MyViewHoler holder, int position) {
holder.imageView.setImageResource(images[position]);
holder.titelTV.setText(titel[position]);
holder.suntitelTV.setText(subtitel[position]);
    }

    @Override
    public int getItemCount() {
        return titel.length;
    }

    public class MyViewHoler extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titelTV,suntitelTV;


        public MyViewHoler(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageId);
            titelTV = itemView.findViewById(R.id.tvID);
            suntitelTV=itemView.findViewById(R.id.description);

        }
    }
}