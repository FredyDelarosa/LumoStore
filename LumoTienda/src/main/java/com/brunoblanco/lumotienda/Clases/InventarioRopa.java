package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioRopa{
    private ArrayList<Producto> productos = new ArrayList<>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public boolean agregarProducto(Producto producto){
        return productos.add(producto);
    }
    public boolean eliminarProducto(String nombre){
        boolean eliminado = false;
        for (Producto i:productos){
            if (nombre.equals(i.getNombre())){
                productos.remove(i);
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }

    public Producto buscarProductoNombre(String nombre){
        Producto productoBuscado = null;
        for (Producto i:productos){
            if (nombre.equals(i.getNombre())){
                productoBuscado = i;
                break;
            }
        }
        return productoBuscado;
    }

    public Producto buscarProductoCategoria(String categoria){
        Producto productoBuscado = null;
        for (Producto i:productos){
            if (categoria.equals(i.getCategoria())){
                productoBuscado = i;
                break;
            }
        }
        return productoBuscado;
    }
}
