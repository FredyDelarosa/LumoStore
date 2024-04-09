package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioVenta {
    private ArrayList <Venta> ventas = new ArrayList<>();

    public ArrayList<Venta> getVentas(){
        return ventas;
    }

    public boolean agregarVenta(Venta venta){
        return ventas.add(venta);
    }

    public boolean eliminarVenta(String nombre){
        boolean eliminado = false;
        for (Venta i:ventas){
            if (nombre.equals(i.getNombrec())){
                ventas.remove(i);
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }

    public Venta buscarVenta(String nombre){
        Venta ventaBuscada = null;
        for (Venta i:ventas){
            if (nombre.equals(i.getNombrec())){
                ventaBuscada = i;
                break;
            }
        }
        return ventaBuscada;
    }
}
