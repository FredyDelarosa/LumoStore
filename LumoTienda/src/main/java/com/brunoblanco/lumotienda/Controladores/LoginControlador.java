package com.brunoblanco.lumotienda.Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class LoginControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonIngresar;

    @FXML
    private PasswordField ContraseñaField;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Pane Etiqueta2;

    @FXML
    private Text Etiqueta2Text;

    @FXML
    private Text EtiquetaText;

    @FXML
    private Label TituloLabel;

    @FXML
    private TextArea UsuarioTextArea;

    @FXML
    private AnchorPane anchor;

    @FXML
    private ImageView img;

    @FXML
    void BtnIngresar(MouseEvent event) {

    }

    @FXML
    void contraseñaText(MouseEvent event) {

    }

    @FXML
    void usuarioText(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert ButtonIngresar != null : "fx:id=\"ButtonIngresar\" was not injected: check your FXML file 'Login.fxml'.";
        assert ContraseñaField != null : "fx:id=\"ContraseñaField\" was not injected: check your FXML file 'Login.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'Login.fxml'.";
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'Login.fxml'.";
        assert Etiqueta2Text != null : "fx:id=\"Etiqueta2Text\" was not injected: check your FXML file 'Login.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'Login.fxml'.";
        assert TituloLabel != null : "fx:id=\"TituloLabel\" was not injected: check your FXML file 'Login.fxml'.";
        assert UsuarioTextArea != null : "fx:id=\"UsuarioTextArea\" was not injected: check your FXML file 'Login.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'Login.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'Login.fxml'.";

    }

}

