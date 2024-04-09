package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.Apartar;
import com.brunoblanco.lumotienda.Clases.InventarioApartar;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ApartarProductosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnApartar;

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
    private Label TitleLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private TextField nombrepTxt;

    @FXML
    private Pane pane;

    @FXML
    void apartarProducto(MouseEvent event) {
        InventarioApartar inventarioApartar = HelloApplication.getInventarioApartar();
        String nombre = nombreTxt.getText();
        String nombrep = nombrepTxt.getText();
        int cantidad = Integer.parseInt(cantidadTxt.getText());
        Apartar apartar = new Apartar(nombre, nombrep, cantidad);
        boolean agregado = inventarioApartar.apartarProducto(apartar);
        if (agregado){
            System.out.println("Agregado");
            System.out.println(apartar.toString());
        }
    }

    @FXML
    void menuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuProveedot.fxml"));
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
        assert BtnApartar != null : "fx:id=\"BtnApartar\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta2Text != null : "fx:id=\"Etiqueta2Text\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta3 != null : "fx:id=\"Etiqueta3\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta3Text != null : "fx:id=\"Etiqueta3Text\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert cantidadTxt != null : "fx:id=\"cantidadTxt\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert nombreTxt != null : "fx:id=\"nombreTxt\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert nombrepTxt != null : "fx:id=\"nombrepTxt\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'ApartarProductos.fxml'.";

    }

}