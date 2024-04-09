package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioVenta;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EliminarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnEliminar;

    @FXML
    private Label EliminarVentaText;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private ImageView img;

    @FXML
    private TextField nombrecTxt;

    @FXML
    private Pane pane;

    @FXML
    void BtnEliminar(MouseEvent event) {
        InventarioVenta inventarioVenta = HelloApplication.getInventarioVenta();
        String nombreEliminar = nombrecTxt.getText();
        boolean eliminado = inventarioVenta.eliminarVenta(nombreEliminar);
        if (eliminado){
            System.out.println("Si se elimino");
        }
    }

    @FXML
    void MenuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuVenta.fxml"));
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
    void initialize() {
        assert BtnEliminar != null : "fx:id=\"BtnEliminar\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert EliminarVentaText != null : "fx:id=\"EliminarVentaText\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert nombrecTxt != null : "fx:id=\"nombrecTxt\" was not injected: check your FXML file 'EliminarVentas.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'EliminarVentas.fxml'.";

    }

}

