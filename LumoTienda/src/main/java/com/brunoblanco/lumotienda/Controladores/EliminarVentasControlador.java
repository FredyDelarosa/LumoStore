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

public class EliminarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label EliminarVentaText;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private ImageView img;

    @FXML
    private Pane pane;

    @FXML
    void IDText(MouseEvent event) {

    }

    @FXML
    void MenuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert EliminarVentaText != null : "fx:id=\"EliminarVentaText\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'EliminarVentas.fxml'.";

    }

}
