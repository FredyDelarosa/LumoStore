package com.brunoblanco.lumotienda.Clases;

public class Venta {
    public String nombrep;
    public String nombrec;
    public Integer cantidad;

    public Venta(){
    }

    public Venta(String nombrep, String nombrec, Integer cantidad) {
        this.nombrep = nombrep;
        this.nombrec = nombrec;
        this.cantidad = cantidad;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "nombrep='" + nombrep + '\'' +
                ", nombrec='" + nombrec + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
