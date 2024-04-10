package com.brunoblanco.lumotienda.Clases;

public class Reporte {
    public String fecha;
    public String report;

    public Reporte() {
    }

    public Reporte(String fecha, String report) {
        this.fecha = fecha;
        this.report = report;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String imprimirReporte(){
        StringBuilder infoReporte = new StringBuilder();

        infoReporte.append("Fecha: ").append(fecha).append("\n");
        infoReporte.append("Reporte: ").append(report).append("\n");
        return infoReporte.toString();
    }
}
