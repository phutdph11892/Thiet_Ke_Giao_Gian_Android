package com.example.bai1_lap82;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Lap82Adapter extends  RecyclerView.Adapter<Lap82Adapter.ViewHoder>{
private List<User82> list;
private Context context;
//khoi tao
    public Lap82Adapter(List<User82> list, Context context) {
        this.list=list;
        this.context=context;
    }

    //tao view
    @NonNull
    @Override
    public ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.item_view82,null);

        return new ViewHoder(view);
    }

    //gan du lieu chi view
    @Override
    public void onBindViewHolder(@NonNull ViewHoder holder, final int position) {
 holder.imageView82.setImageResource(list.get(position).getImage());
 holder.tv_82.setText(list.get(position).getName());
 holder.itemView.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         AlertDialog.Builder builder = new AlertDialog.Builder(context);
         builder.setTitle("Datails");
                 String msg = list.get(position).getName();
                 builder.setMessage(msg);

                 AlertDialog alertDialog = builder.create();
                 alertDialog.show();
     }
 });
    }
//so luong item co
    @Override
    public int getItemCount() {
        return list.size();
    }

    //lop lien ket voi itemview
    public static class ViewHoder extends RecyclerView.ViewHolder{
        ImageView imageView82;
        TextView tv_82;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            imageView82=itemView.findViewById(R.id.imageView_82);
            tv_82=itemView.findViewById(R.id.textView_82);
        }
    }
}
