package com.brunoblanco.lumotienda.Clases;

public class Prenda extends Producto{
    public String talla;
    public String color;

    public Prenda(String nombre, double precio, Integer cantidad, String categoria) {
        super(nombre, precio, cantidad, categoria);
    }

    @Override
    public String getDescripcion() {
        return "Prenda: " + nombre + ", Precio: $" + precio + " Categoria: " + categoria + " Cantidad: " + cantidad;
    }
}
