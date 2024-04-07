package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BuscarProductosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private Label SubtituloText;

    @FXML
    private Label TituloText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane;

    @FXML
    void BtnBuscar(MouseEvent event) {

    }

    @FXML
    void CategoriaButton(MouseEvent event) {

    }

    @FXML
    void EtiquetaTextArea(MouseEvent event) {

    }

    @FXML
    void MenuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenúProductos.fxml"));
        try {
            Pane root = fxmlLoader.load();
            Scene scene= new Scene(root);
            stage.setTitle("Menú Productos");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }

    @FXML
    void NombreButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert SubtituloText != null : "fx:id=\"SubtituloText\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert TituloText != null : "fx:id=\"TituloText\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'BuscarProductos.fxml'.";

    }

}
