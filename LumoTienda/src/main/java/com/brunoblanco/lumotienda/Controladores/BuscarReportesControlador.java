package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioReporte;
import com.brunoblanco.lumotienda.Clases.Reporte;
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

public class BuscarReportesControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnBuscar;

    @FXML
    private Pane Etiqueta;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField busquedaTxt;

    @FXML
    private Text etiquetaText;

    @FXML
    private ListView<String> lista;

    @FXML
    private Pane pane;

    @FXML
    private Label titleLabel;

    @FXML
    void buscarButton(MouseEvent event) {
        InventarioReporte inventarioReporte = HelloApplication.getInventarioReporte();
        String reporteBuscar = busquedaTxt.getText();
        Reporte reporte = inventarioReporte.buscarReporte(reporteBuscar);
        if (reporte != null){
            lista.getItems().add(reporte.imprimirReporte());
        }
    }

    @FXML
    void menuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuReportes.fxml"));
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
        assert BtnBuscar != null : "fx:id=\"BtnBuscar\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert busquedaTxt != null : "fx:id=\"busquedaTxt\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert etiquetaText != null : "fx:id=\"etiquetaText\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert lista != null : "fx:id=\"lista\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'BuscarReportes.fxml'.";
        assert titleLabel != null : "fx:id=\"titleLabel\" was not injected: check your FXML file 'BuscarReportes.fxml'.";

    }

}

