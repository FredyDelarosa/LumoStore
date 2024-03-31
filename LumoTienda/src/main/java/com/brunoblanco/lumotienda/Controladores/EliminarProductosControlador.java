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

public class EliminarProductosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Label Text;

    @FXML
    private Text Text2;

    @FXML
    private ImageView img;

    @FXML
    private Pane pane;

    @FXML
    void EliminarProductoText(MouseEvent event) {

    }

    @FXML
    void MenuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Anchor != null : "fx:id=\"Anchor\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert Text != null : "fx:id=\"Text\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert Text2 != null : "fx:id=\"Text2\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'EliminarProductos.fxml'.";

    }

}
