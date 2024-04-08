package com.brunoblanco.lumotienda;

import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static InventarioRopa inventarioRopa = new InventarioRopa();

    public static InventarioRopa getInventarioRopa() {
        return inventarioRopa;
    }

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