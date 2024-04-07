package com.brunoblanco.lumotienda.Clases;

public abstract class Producto {

    public String nombre;
    public double precio;
    public Integer cantidad;
    public String categoria;

    public Producto(String nombre, double precio, Integer cantidad, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public abstract String getDescripcion();
}
