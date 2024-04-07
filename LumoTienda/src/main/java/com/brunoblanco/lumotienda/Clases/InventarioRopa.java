package com.brunoblanco.lumotienda.Clases;

import java.util.List;

public class InventarioRopa implements Inventario {
    private List<Producto> inventario;

    public InventarioRopa(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public void agregarProducto(Producto producto){
        inventario.add(producto);
    }

    public void mostrarInventario() {
        for (Producto producto : inventario) {
            System.out.println(producto.getDescripcion());
        }
    }

    public List<Producto> getInventario() {
        return inventario;
    }
}
