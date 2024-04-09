package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioApartar {
    private ArrayList <Apartar> apartars = new ArrayList<>();

    public ArrayList<Apartar> getApartar() {
        return apartars;
    }

    public boolean apartarProducto(Apartar apartar){return  apartars.add(apartar);}
}
