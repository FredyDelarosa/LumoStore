package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioApartar;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ComprarApartadosControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnComprar;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Pane Etiqueta2;

    @FXML
    private Pane Etiqueta3;

    @FXML
    private Text Etiqueta3Text;

    @FXML
    private Text TextPane;

    @FXML
    private Text TextPane2;

    @FXML
    private Label TituloText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane borde;

    @FXML
    private TextField cantidadTxt;

    @FXML
    private ImageView img;

    @FXML
    private ImageView img2;

    @FXML
    private TextField nombreTxt;

    @FXML
    private TextField nombrepTxt;

    @FXML
    void comprarProducto(MouseEvent event) {
        InventarioApartar inventarioApartar = HelloApplication.getInventarioApartar();
        String nombrep = nombrepTxt.getText();
        String proveedor = nombreTxt.getText();
        int cantidad = Integer.parseInt(cantidadTxt.getText());

        boolean comprado = inventarioApartar.comprarProducto(nombrep, proveedor, cantidad);
        if (comprado) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Confirmación de compra");
            alerta.setHeaderText(null);
            alerta.setContentText("Producto comprado exitosamente");
            alerta.showAndWait();
        }else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Compra");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se pudo comprar el producto. Verifique la cantidad disponible.");
            alertaError.showAndWait();
        }
    }

    @FXML
    void menuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuProveedor.fxml"));
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
    void initialize() {
        assert BtnComprar != null : "fx:id=\"BtnComprar\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert Etiqueta2 != null : "fx:id=\"Etiqueta2\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert Etiqueta3 != null : "fx:id=\"Etiqueta3\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert Etiqueta3Text != null : "fx:id=\"Etiqueta3Text\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert TextPane != null : "fx:id=\"TextPane\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert TextPane2 != null : "fx:id=\"TextPane2\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert TituloText != null : "fx:id=\"TituloText\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert borde != null : "fx:id=\"borde\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert cantidadTxt != null : "fx:id=\"cantidadTxt\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert img2 != null : "fx:id=\"img2\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert nombreTxt != null : "fx:id=\"nombreTxt\" was not injected: check your FXML file 'ComprarApartados.fxml'.";
        assert nombrepTxt != null : "fx:id=\"nombrepTxt\" was not injected: check your FXML file 'ComprarApartados.fxml'.";

    }

}

