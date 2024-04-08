package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
    private Button BtnActualizar;

    @FXML
    private Text etiquetaText;

    @FXML
    private ImageView img;

    @FXML
    private Label tituloText;

    @FXML
    void BtnActualizar(MouseEvent event) {
        String nombre = EtiquetaTextArea.getText();
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ActualizarProductoOpcion.fxml"));
        try {
            Pane root = fxmlLoader.load();
            Scene scene= new Scene(root);
            stage.setTitle("Proveedor");
            stage.setScene(scene);

            ActualizarProductoOpcionControlador controlador = fxmlLoader.getController();
            controlador.setNombreProducto(nombre);

            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();
        stage.close();
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
    void initialize() {
        assert Anchor != null : "fx:id=\"Anchor\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert EtiquetaTextArea != null : "fx:id=\"EtiquetaTextArea\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert etiquetaText != null : "fx:id=\"etiquetaText\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";
        assert tituloText != null : "fx:id=\"tituloText\" was not injected: check your FXML file 'ActualizarProductos.fxml'.";

    }

}
