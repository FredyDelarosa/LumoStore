package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MenuReportesControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label TituloText;

    @FXML
    private Pane bordeinicio;

    @FXML
    private ImageView img;

    @FXML
    private AnchorPane pane;

    @FXML
    void buscarReportebutton(MouseEvent event) {

    }

    @FXML
    void generarReportebutton(MouseEvent event) {

    }

    @FXML
    void menubutton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert TituloText != null : "fx:id=\"TituloText\" was not injected: check your FXML file 'MenuReportes.fxml'.";
        assert bordeinicio != null : "fx:id=\"bordeinicio\" was not injected: check your FXML file 'MenuReportes.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'MenuReportes.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'MenuReportes.fxml'.";

    }

}
