package com.example.listacompra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorCarrito extends BaseAdapter {

    Context context;
    ArrayList<Carrito.ProducteCarrito> compra = new ArrayList<>();

    public AdaptadorCarrito(Context context, ArrayList<Carrito.ProducteCarrito> compra) {
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
        convertView = LayoutInflater.from(context).inflate(R.layout.item_carrito, null);
        Carrito.ProducteCarrito item = (Carrito.ProducteCarrito) getItem(position);

        TextView nomProducteCarrito = (TextView) convertView.findViewById(R.id.nomProducteCarrito);
        nomProducteCarrito.setText(item.nom);

        TextView quantitatProducteCarrito = (TextView) convertView.findViewById(R.id.quantitatProducteCarrito);
        quantitatProducteCarrito.setText(item.unitats);

        return convertView;

    }
}
