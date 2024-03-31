package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ActualizarProductosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Pane Etiqueta;

    @FXML
    private TextArea EtiquetaTextArea;

    @FXML
    private Text etiquetaText;

    @FXML
    private ImageView img;

    @FXML
    private Label tituloText;

    @FXML
    void MenuButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Anchor != null : "fx:id=\"Anchor\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert EtiquetaTextArea != null : "fx:id=\"EtiquetaTextArea\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert etiquetaText != null : "fx:id=\"etiquetaText\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert tituloText != null : "fx:id=\"tituloText\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";

    }

}
