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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GenerarReportesControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnGuardar;

    @FXML
    private Label TitleLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private TextField fechaTxt;

    @FXML
    private Pane pane;

    @FXML
    private TextField reporteTxt;

    @FXML
    void guardarReport(MouseEvent event) {
        InventarioReporte inventarioReporte = HelloApplication.getInventarioReporte();
        String fecha = fechaTxt.getText();
        String report = reporteTxt.getText();
        Reporte reporte = new Reporte(fecha, report);
        boolean agregado = inventarioReporte.agregarReporte(reporte);
        if (agregado){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Confirmación de agregado");
            alerta.setHeaderText(null);
            alerta.setContentText("Reporte guardado correctamente");
            alerta.showAndWait();
        }else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Agregado");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se pudo guardar el reporte.");
            alertaError.showAndWait();
        }
    }

    @FXML
    void menuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuReportes.fxml"));
        try {
            Pane root = fxmlLoader.load();
            Scene scene= new Scene(root);
            stage.setTitle("Reportes");
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
        assert BtnGuardar != null : "fx:id=\"BtnGuardar\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert fechaTxt != null : "fx:id=\"fechaTxt\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert reporteTxt != null : "fx:id=\"reporteTxt\" was not injected: check your FXML file 'GenerarReportes.fxml'.";

    }

}


