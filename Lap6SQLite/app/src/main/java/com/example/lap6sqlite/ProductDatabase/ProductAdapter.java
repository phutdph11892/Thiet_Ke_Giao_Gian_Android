package com.example.lap6sqlite.ProductDatabase;

import android.content.Context;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lap6sqlite.R;
import com.example.lap6sqlite.controlor.ProductDAO;
import com.example.lap6sqlite.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    private Context context;//khai bao contact
    private int layout;//khai bao layout
    private List<Product> lsProuduct;//khai bao danh sach contact
    private LayoutInflater inflater;//doi tuong sinh giao dien
    TextView tvMaSP;
    TextView tvTenSP;
    TextView tvSoLuongSP;
   ProductDAO productDAO;
   Button btnSua;
   Button btnXoa;

    //phuong thuc khoi tao
    public ProductAdapter( Context context, int resource,  List<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.lsProuduct = objects;
        //khoi tao dao dien
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        productDAO = new ProductDAO(getContext());
    }
    //xu li ham gesview:tao view va gan ket du lieu

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        //tao view
        if(convertView==null)//convertView == null thi tao view moi
        {
            //gan view trong fide xml voi converView trong java
           convertView = inflater.inflate(R.layout.i,null);
            //gan tung truong du lieu

           tvMaSP=(TextView)convertView.findViewById(R.id.tvmaSP);
            tvTenSP=(TextView)convertView.findViewById(R.id.tvtenSP);
           tvSoLuongSP=(TextView)convertView.findViewById(R.id.tvsoLuongSP);
           btnSua=(Button)convertView.findViewById(R.id.btnSua);
           btnXoa=(Button)convertView.findViewById(R.id.btnXoa);



           btnXoa.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   //thuc hien xoa theo maSP
                   Product product = lsProuduct.get(position);
                   productDAO.deleProduct(lsProuduct.get(position).getMaSP());
                   lsProuduct.remove(product);//thuc hien xoa trong list
                   notifyDataSetChanged();//cap nhat vao listView
               }
           });
        }



        //gan du lieu cho view
        Product product = lsProuduct.get(position);//lay contact tai vi tri position

        tvMaSP.setText(product.getMaSP());
        tvTenSP.setText(product.getTenSP());
       tvSoLuongSP.setText(product.getSoLuongSP());
        return convertView;
    }

}
