package com.example.listacompra;

public class Producte {

    String nom;
    String foto;
    int quantitat;

    private boolean checked;

    public Producte(String nom, String foto, int quantitat) {
        this.nom = nom;
        this.foto = foto;
        this.quantitat = quantitat;
    }

    public String getNomProducte() {
        return nom;
    }

    public String getFoto() {
        return foto;
    }
}

