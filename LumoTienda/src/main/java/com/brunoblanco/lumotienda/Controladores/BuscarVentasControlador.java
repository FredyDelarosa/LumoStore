package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioVenta;
import com.brunoblanco.lumotienda.Clases.Venta;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BuscarVentasControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnBuscar;

    @FXML
    private Text EtiquetaDato;

    @FXML
    private Label TituloLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField busquedaTxt;

    @FXML
    private ListView<String> lista;

    @FXML
    private Pane pane;

    @FXML
    void MenuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuVenta.fxml"));
        try {
            Pane root = fxmlLoader.load();
            Scene scene= new Scene(root);
            stage.setTitle("Menú Ventas");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }

    @FXML
    void buscarButton(MouseEvent event) {
        InventarioVenta inventarioVenta = HelloApplication.getInventarioVenta();
        String ventaBuscar = busquedaTxt.getText();
        Venta venta = inventarioVenta.buscarVenta(ventaBuscar);
        if (venta != null){
            lista.getItems().add(venta.imprimirVenta());
        }
    }

    @FXML
    void initialize() {
        assert BtnBuscar != null : "fx:id=\"BtnBuscar\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert EtiquetaDato != null : "fx:id=\"EtiquetaDato\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert TituloLabel != null : "fx:id=\"TituloLabel\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert busquedaTxt != null : "fx:id=\"busquedaTxt\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert lista != null : "fx:id=\"lista\" was not injected: check your FXML file 'BuscarVentas.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'BuscarVentas.fxml'.";

    }

}

