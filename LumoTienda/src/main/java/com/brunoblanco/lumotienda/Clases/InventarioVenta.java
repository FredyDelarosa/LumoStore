package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioVenta {
    private ArrayList<Venta> ventas = new ArrayList<>();
    private ArrayList<InventarioRopa> inventariosDeRopa = new ArrayList<>(); // Lista para gestionar múltiples inventarios de ropa.
    public ArrayList<InventarioRopa> getInventariosDeRopa() {
        return inventariosDeRopa;
    }

    public void setInventariosDeRopa(ArrayList<InventarioRopa> inventariosDeRopa) {
        this.inventariosDeRopa = inventariosDeRopa;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public boolean agregarVenta(Venta venta) {
        return ventas.add(venta);
    }

    public boolean eliminarVenta(String nombrec) {
        boolean eliminado = false;
        for (Venta i : ventas) {
            if (nombrec.equals(i.getNombrec())) {
                ventas.remove(i);
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }

    public Venta buscarVenta(String nombre) {
        for (Venta i : ventas) {
            if (nombre.equals(i.getNombrec())) {
                return i;
            }
        }
        return null;
    }
}
