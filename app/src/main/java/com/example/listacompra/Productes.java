package com.example.listacompra;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Productes extends MainMenu {
    AdaptadorProductes adapta;
    ArrayList <Producte> Llista = new ArrayList<>();
    ListView lv1;
    public class Producte {
        String Nom;
        int Imatge;

        public Producte(String nom, int imatge) {
            Nom = nom;
            Imatge = imatge;
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        lv1 = findViewById(R.id.lv1);
        carregarLista();
    }

    private void carregarLista() {

        Producte p1 = new Producte("\n\nAigua",R.drawable.aigua);
        Producte p2 = new Producte("\n\nOli",R.drawable.oli);
        Producte p3 = new Producte("\n\nCocaCola",R.drawable.cocacola);
        Llista.add(p1);
        Llista.add(p2);
        Llista.add(p3);
        adapta = new AdaptadorProductes(this,Llista);
        lv1.setAdapter(adapta);
    }
}
