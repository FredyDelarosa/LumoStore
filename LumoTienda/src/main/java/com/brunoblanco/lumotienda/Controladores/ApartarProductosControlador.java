package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ApartarProductosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

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
    private Pane pane;

    @FXML
    void CantidadTextArea(MouseEvent event) {

    }

    @FXML
    void ProductoTextArea(MouseEvent event) {

    }

    @FXML
    void ProveedorTextArea(MouseEvent event) {

    }

    @FXML
    void menuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta2Text != null : "fx:id=\"Etiqueta2Text\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta3 != null : "fx:id=\"Etiqueta3\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert Etiqueta3Text != null : "fx:id=\"Etiqueta3Text\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'ApartarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'ApartarProductos.fxml'.";

    }

}
