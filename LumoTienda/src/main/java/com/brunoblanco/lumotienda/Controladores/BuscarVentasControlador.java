package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class BuscarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text EtiquetaDato;

    @FXML
    private Text EtiquetaProducto;

    @FXML
    private Label TituloLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane;

    @FXML
    void DatoTextArea(MouseEvent event) {

    }

    @FXML
    void MenuButton(MouseEvent event) {

    }

    @FXML
    void ProductoArea(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert EtiquetaDato != null : "fx:id=\"EtiquetaDato\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert EtiquetaProducto != null : "fx:id=\"EtiquetaProducto\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert TituloLabel != null : "fx:id=\"TituloLabel\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'BuscarVentas.fxml'.";

    }

}
