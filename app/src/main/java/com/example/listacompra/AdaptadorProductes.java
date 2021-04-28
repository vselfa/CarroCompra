package com.example.listacompra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorProductes extends BaseAdapter {
    Context context;
    ArrayList <Productes.Producte> compra = new ArrayList<>();

    public AdaptadorProductes(Context context, ArrayList<Productes.Producte> compra) {
        this.context = context;
        this.compra = compra;
    }

    @Override
    public int getCount() {
        return compra.size();
    }

    @Override
    public Object getItem(int position) {
        return compra.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_product, null);
        Productes.Producte item = (Productes.Producte) getItem(position);

        ImageView imgProduct = (ImageView) convertView.findViewById(R.id.imgProduct);
        imgProduct.setImageResource(item.Imatge);

        TextView nameProduct = (TextView) convertView.findViewById(R.id.nameProduct);
        nameProduct.setText(item.Nom);

        return convertView;

    }
}
