package com.brunoblanco.lumotienda.Clases;

public class Accesorio extends Producto {
    public String tipo;
    public Accesorio(String nombre, double precio, Integer cantidad, String categoria) {
        super(nombre, precio, cantidad, categoria);
    }

    @Override
    public String getDescripcion() {
        return "Accesorio: " + nombre + ", Precio: $" + precio + " Categoria: " + categoria + " Cantidad: " + cantidad;
    }
}
