package com.brunoblanco.lumotienda;

import com.brunoblanco.lumotienda.Clases.InventarioReporte;
import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import com.brunoblanco.lumotienda.Clases.InventarioVenta;
import com.brunoblanco.lumotienda.Clases.InventarioApartar;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static InventarioRopa inventarioRopa = new InventarioRopa();
    private static InventarioVenta inventarioVenta = new InventarioVenta();
    private static InventarioApartar inventarioApartar = new InventarioApartar();

    private static InventarioReporte inventarioReporte = new InventarioReporte();

    public static InventarioRopa getInventarioRopa() {
        return inventarioRopa;
    }
    public static InventarioVenta getInventarioVenta(){return inventarioVenta;}
    public static InventarioApartar getInventarioApartar(){return inventarioApartar;}
    public static InventarioReporte getInventarioReporte(){return inventarioReporte;}

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Menú.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menú");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}