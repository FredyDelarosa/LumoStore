package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioVenta;
import com.brunoblanco.lumotienda.Clases.Venta;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AgregarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ApartarText;

    @FXML
    private Button BtnAgregar;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Pane Etiqueta2;

    @FXML
    private Text Etiqueta2Text;

    @FXML
    private Pane Etiqueta3;

    @FXML
    private Text Etiqueta3Text;

    @FXML
    private Text EtiquetaText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private ImageView img;

    @FXML
    private TextField nombreTxt;

    @FXML
    private TextField nombrecTxt;

    @FXML
    private Pane pane;

    @FXML
    void agregarVenta(MouseEvent event) {
        InventarioVenta inventarioVenta = HelloApplication.getInventarioVenta();
        String nombre = nombreTxt.getText();
        String nombrec = nombrecTxt.getText();
        int cantidad = Integer.parseInt(cantidadTxt.getText());
        Venta venta = new Venta(nombre,nombrec,cantidad);
        boolean agregado = inventarioVenta.agregarVenta(venta);
        if (agregado){
            System.out.println("Agregado");
            System.out.println(venta.toString());
        }
    }

    @FXML
    void menuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuVenta.fxml"));
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
        assert ApartarText != null : "fx:id=\"ApartarText\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert BtnAgregar != null : "fx:id=\"BtnAgregar\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta2Text != null : "fx:id=\"Etiqueta2Text\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta3 != null : "fx:id=\"Etiqueta3\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta3Text != null : "fx:id=\"Etiqueta3Text\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert cantidadTxt != null : "fx:id=\"cantidadTxt\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert nombreTxt != null : "fx:id=\"nombreTxt\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert nombrecTxt != null : "fx:id=\"nombrecTxt\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'AgregarVentas.fxml'.";

    }

}

