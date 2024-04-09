package com.brunoblanco.lumotienda.Clases;

public class Apartar {
    public String nombrep;
    public String proveedor;
    public Integer cantidad;

    public Apartar() {
    }

    public Apartar(String nombrep, String proveedor, Integer cantidad) {
        this.nombrep = nombrep;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombrep='" + nombrep + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
