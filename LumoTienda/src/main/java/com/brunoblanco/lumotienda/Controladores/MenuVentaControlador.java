package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MenuVentaControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label VentaText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private ImageView img;

    @FXML
    private Pane pane;

    @FXML
    void ActualizarButton(MouseEvent event) {

    }

    @FXML
    void AgregarButton(MouseEvent event) {

    }

    @FXML
    void BuscarButton(MouseEvent event) {

    }

    @FXML
    void EliminarButton(MouseEvent event) {

    }

    @FXML
    void MenuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert VentaText != null : "fx:id=\"VentaText\" was not injected: check your FXML file 'MenuVenta.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'MenuVenta.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'MenuVenta.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'MenuVenta.fxml'.";

    }

}
