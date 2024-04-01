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

public class ComprarApartadosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Pane Etiqueta2;

    @FXML
    private Text TextPane;

    @FXML
    private Text TextPane2;

    @FXML
    private Label TituloText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane borde;

    @FXML
    private ImageView img;

    @FXML
    private ImageView img2;

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
    void initialize() {
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert TextPane != null : "fx:id=\"TextPane\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert TextPane2 != null : "fx:id=\"TextPane2\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert TituloText != null : "fx:id=\"TituloText\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert borde != null : "fx:id=\"borde\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert img2 != null : "fx:id=\"img2\" was not injected: check your FXML file 'ComprarApartados.fxml'.";

    }

}
