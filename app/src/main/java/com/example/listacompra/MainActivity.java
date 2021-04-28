package com.example.listacompra;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class MainActivity extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void OnclickProductes(View view){
        Intent i = new Intent(this, Productes.class);
        startActivity(i);

    }
    public void OnclickNewProduct(View view){
        Intent i = new Intent(this, NewProduct.class);
        startActivity(i);
    }
    public void OnclickCarrito(View view){
        Intent i = new Intent(this,Carrito.class);
        startActivity(i);
    }
}