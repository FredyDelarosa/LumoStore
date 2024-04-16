package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioRopa {
    private ArrayList<Producto> productos = new ArrayList<>();

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public boolean agregarProducto(Producto producto) {
        return productos.add(producto);
    }

    public boolean eliminarProducto(String nombre) {
        boolean eliminado = false;
        for (Producto i : productos) {
            if (nombre.equals(i.getNombre())) {
                productos.remove(i);
                eliminado = true;
                break;
            }
        }
        return eliminado;
    }

    public Producto buscarProductoNombre(String nombre) {
        for (Producto i : productos) {
            if (nombre.equals(i.getNombre())) {
                return i;
            }
        }
        return null;
    }

    public Producto buscarProductoCategoria(String categoria) {
        for (Producto i : productos) {
            if (categoria.equals(i.getCategoria())) {
                return i;
            }
        }
        return null;
    }

    public boolean ajustarCantidadProducto(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                int nuevaCantidad = producto.getCantidad() - cantidad;
                if (nuevaCantidad >= 0) {
                    producto.setCantidad(nuevaCantidad);
                    return true;
                }
                break;
            }
        }
        return false;
    }


}