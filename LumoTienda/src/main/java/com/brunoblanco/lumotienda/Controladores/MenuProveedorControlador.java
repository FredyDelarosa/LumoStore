package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MenuProveedorControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label TitleLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane bordeinicio;

    @FXML
    void apartarProductoButton(MouseEvent event) {

    }

    @FXML
    void comprarProductoButton(MouseEvent event) {

    }

    @FXML
    void menubutton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'MenuProveedor.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'MenuProveedor.fxml'.";
        assert bordeinicio != null : "fx:id=\"bordeinicio\" was not injected: check your FXML file 'MenuProveedor.fxml'.";

    }

}
