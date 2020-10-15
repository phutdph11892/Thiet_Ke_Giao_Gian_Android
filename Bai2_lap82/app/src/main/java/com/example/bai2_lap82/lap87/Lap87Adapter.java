package com.example.bai2_lap82.lap87;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bai2_lap82.R;

import java.util.List;

public class Lap87Adapter extends RecyclerView.Adapter<Lap87Adapter.UserViewuHoder> {
    private List<User87> list;
    private Context context;

    public Lap87Adapter(List<User87> list, Context context) {
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public UserViewuHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_view_87,null);
        return new UserViewuHoder(view);
    }
//thiet lap giu lieu
    @Override
    public void onBindViewHolder(@NonNull UserViewuHoder holder, final int position) {
        holder.textView.setText(list.get(position).getName());
        holder.imageView.setImageResource(list.get(position).getPic());
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,list.get(position).getName(),Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class UserViewuHoder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public UserViewuHoder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView_87);
            textView=itemView.findViewById(R.id.textView_87);
        }
    }
}
