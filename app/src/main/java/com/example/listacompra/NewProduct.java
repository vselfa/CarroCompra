package com.example.listacompra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class NewProduct extends MainMenu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product);
    }

    public void OnClickfoto(View view) {
        //obrir la camera i mostrarla en el image view
    }

    public void OnclickAlta(View view) {
        //donar de alta producte en firebase
    }
}