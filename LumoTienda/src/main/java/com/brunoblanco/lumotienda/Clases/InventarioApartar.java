package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioApartar {
    private ArrayList <Apartar> apartars = new ArrayList<>();

    public ArrayList<Apartar> getApartar() {
        return apartars;
    }

    public boolean apartarProducto(Apartar apartar){return  apartars.add(apartar);}

    public boolean comprarProducto(String nombrep, String proveedor, int cantidad){
        for (Apartar apartar : apartars){
            if (apartar.getNombrep().equals(nombrep) && apartar.getProveedor().equals(proveedor)){
                if (apartar.getCantidad() >= cantidad){
                    apartar.setCantidad(apartar.getCantidad() - cantidad);
                    return true;
                }
            }
        }
        return false;
    }


    private InventarioRopa inventarioRopa;

    public InventarioApartar() {
        this.inventarioRopa = inventarioRopa;
    }

}
