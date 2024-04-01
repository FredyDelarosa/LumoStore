package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class GenerarReportesControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private Label TitleLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane;

    @FXML
    void ReporteTextArea(MouseEvent event) {

    }

    @FXML
    void menuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'GenerarReportes.fxml'.";

    }

}
