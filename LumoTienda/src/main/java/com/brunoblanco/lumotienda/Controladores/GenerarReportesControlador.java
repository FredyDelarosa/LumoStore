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
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class GenerarReportesControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label TitleLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane;

    @FXML
    private WebView webView;

    

    @FXML
    void menuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuProveedor.fxml"));
        try {
            Pane root = fxmlLoader.load();
            Scene scene= new Scene(root);
            stage.setTitle("Proveedor");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }

    @FXML
    void onClickBtnLoad(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'GenerarReportes.fxml'.";
        assert webView != null : "fx:id=\"webView\" was not injected: check your FXML file 'GenerarReportes.fxml'.";

    }

}

