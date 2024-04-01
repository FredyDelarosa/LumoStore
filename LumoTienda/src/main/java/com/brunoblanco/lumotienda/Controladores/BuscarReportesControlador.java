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

public class ActualizarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane Etiqueta;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Text etiquetaText;

    @FXML
    private ImageView img;

    @FXML
    private Pane pane;

    @FXML
    private Label titleLabel;

    @FXML
    void FechaTextArea(MouseEvent event) {

    }

    @FXML
    void menuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert etiquetaText != null : "fx:id=\"etiquetaText\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert titleLabel != null : "fx:id=\"titleLabel\" was not injected: check your FXML file 'BuscarReportes.fxml'.";

    }

}
