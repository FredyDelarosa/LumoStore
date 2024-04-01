package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class AgregarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label ApartarText;

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
    private ImageView img;

    @FXML
    private Pane pane;

    @FXML
    void cantidadText(MouseEvent event) {

    }

    @FXML
    void menuButton(MouseEvent event) {

    }

    @FXML
    void nombreText(MouseEvent event) {

    }

    @FXML
    void proveedorText(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert ApartarText != null : "fx:id=\"ApartarText\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta2Text != null : "fx:id=\"Etiqueta2Text\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta3 != null : "fx:id=\"Etiqueta3\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert Etiqueta3Text != null : "fx:id=\"Etiqueta3Text\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'AgregarVentas.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'AgregarVentas.fxml'.";

    }

}
