package com.brunoblanco.lumotienda.Clases;

public class Producto {

    public String nombre;
    public double precio;
    public Integer cantidad;
    public String categoria;

    public Producto() {
    }

    public Producto(String nombre, double precio, Integer cantidad, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String imprimirProducto(){
        StringBuilder infoProducto = new StringBuilder();

        infoProducto.append("Nombre: ").append(nombre).append("\n");
        infoProducto.append("Precio: ").append(precio).append("\n");
        infoProducto.append("Cantidad: ").append(cantidad).append("\n");
        infoProducto.append("Categoria: ").append(categoria).append("\n");
        return infoProducto.toString();
    }
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
