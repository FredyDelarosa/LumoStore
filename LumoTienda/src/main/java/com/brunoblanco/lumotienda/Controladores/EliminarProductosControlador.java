package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.DatabaseConnection;
import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class EliminarProductosControlador {

    //eliminar un producto
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private TextField nombreTxt;

    @FXML
    private AnchorPane Anchor;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Label Text;

    @FXML
    private Text Text2;

    @FXML
    private ImageView img;

    @FXML
    private Pane pane;

    @FXML
    void BtnEliminar(MouseEvent event) {
        String nombreEliminar = nombreTxt.getText();

        if (nombreEliminar.isEmpty()) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("El nombre del producto no puede estar vacío.");
            alertaError.showAndWait();
            return;
        }

        String sql = "DELETE FROM productos WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombreEliminar);

            int filasAfectadas = pstmt.executeUpdate();

            if (filasAfectadas > 0) {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Producto Eliminado");
                alerta.setHeaderText(null);
                alerta.setContentText("El producto ha sido eliminado correctamente.");
                alerta.showAndWait();
            } else {
                Alert alertaError = new Alert(Alert.AlertType.ERROR);
                alertaError.setTitle("Error al Eliminar");
                alertaError.setHeaderText(null);
                alertaError.setContentText("No se pudo encontrar y eliminar el producto.");
                alertaError.showAndWait();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Base de Datos");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Hubo un error al eliminar el producto de la base de datos.");
            alertaError.showAndWait();
        }
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
        assert Anchor != null : "fx:id=\"Anchor\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert Text != null : "fx:id=\"Text\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert Text2 != null : "fx:id=\"Text2\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert img != null : "fx:id=\"img\" was not injected: check your FXML file 'EliminarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'EliminarProductos.fxml'.";

    }

}
