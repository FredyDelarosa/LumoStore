package com.brunoblanco.lumotienda.Clases;

import java.util.List;

public interface Inventario {
    void agregarProducto(Producto producto);
    void mostrarInventario();

    List<Producto> getInventario();
}
