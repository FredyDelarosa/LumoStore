package com.brunoblanco.lumotienda.Clases;

import java.util.ArrayList;

public class InventarioReporte {
    private ArrayList <Reporte> reportes = new ArrayList<>();

    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    public boolean agregarReporte(Reporte reporte){
        return reportes.add(reporte);
    }

    public Reporte buscarReporte(String fecha){
        Reporte reporteBuscar = null;
        for (Reporte i: reportes){
            if (fecha.equals(i.getFecha())){
                reporteBuscar = i;
                break;
            }
        }
        return reporteBuscar;
    }
}
