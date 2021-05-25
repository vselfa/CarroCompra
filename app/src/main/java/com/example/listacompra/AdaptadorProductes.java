package com.example.listacompra;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorProductes extends BaseAdapter {
    Context context;
    ArrayList <Producte> compra = new ArrayList<>();

    public AdaptadorProductes(Context context, ArrayList<Producte> compra) {
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
        Producte item = (Producte) getItem(position);

        ImageView imgProduct = (ImageView) convertView.findViewById(R.id.imgProduct);
        Glide.with(context).load(item.getFoto()).into(imgProduct);

        TextView nameProduct = (TextView) convertView.findViewById(R.id.nameProduct);
        nameProduct.setText(item.getNomProducte());

        return convertView;

    }
}
  /*  static class Holder {
        TextView nameProduct;
        TextView quantitat;
        CheckBox checkBox;
        ImageView imgProduct;
        Button bntMes, btnMenys;

        public Button getBntMes() {return bntMes;}
        public void setBntMes(Button bntMes) {this.bntMes = bntMes;}
        public Button getBtnMenys() {return btnMenys;}
        public void setBtnMenys(Button btnMenys) {this.btnMenys = btnMenys;}
        public TextView getQuantitat() {return quantitat;}
        public void setQuantitat(TextView quantitat) {this.quantitat = quantitat;}
        public TextView getNameProduct() {return nameProduct;}
        public void setNameProduct(TextView nameProduct) {this.nameProduct = nameProduct;}
        public CheckBox getCheckBox() {return checkBox;}
        public void setCheckBox(CheckBox checkBox) {this.checkBox = checkBox;}
        public ImageView getImgProduct() {return imgProduct;}
        public void setImgProduct(ImageView imgProduct) {this.imgProduct = imgProduct;}
    }
}*/
