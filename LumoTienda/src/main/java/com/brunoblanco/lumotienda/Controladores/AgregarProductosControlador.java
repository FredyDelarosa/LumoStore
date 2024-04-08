package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import com.brunoblanco.lumotienda.Clases.Producto;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//para agregar productos
public class AgregarProductosControlador {
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField precioTxt;
    @FXML
    private TextField categoriaTxt;
    @FXML
    private TextField cantidadTxt;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnAgregar;

    @FXML
    private Pane pane;

    @FXML
    void agregarProduct(MouseEvent event) {
        InventarioRopa inventarioRopa = HelloApplication.getInventarioRopa();
        String nombre = nombreTxt.getText();
        double precio = Double.parseDouble(precioTxt.getText());
        int cantidad = Integer.parseInt(cantidadTxt.getText());
        String categoria = categoriaTxt.getText();
        Producto producto = new Producto(nombre,precio,cantidad,categoria);
        boolean agregado = inventarioRopa.agregarProducto(producto);
        if (agregado){
            System.out.println("Agregado");
            System.out.println(producto.toString());
        }
    }

    @FXML
    void MenuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenúProductos.fxml"));
        try {
            Pane root = fxmlLoader.load();
            Scene scene= new Scene(root);
            stage.setTitle("Proveedor");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }

    @FXML
    void initialize() {
        assert BtnAgregar != null : "fx:id=\"BtnAgregar\" was not injected: check your FXML file 'AgregarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'AgregarProductos.fxml'.";

    }

}


