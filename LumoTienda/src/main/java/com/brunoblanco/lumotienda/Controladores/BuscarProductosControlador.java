package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.DatabaseConnection;
import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import com.brunoblanco.lumotienda.Clases.Producto;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.control.ListView;

public class BuscarProductosControlador {

    //busca un producto
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private ListView <String> lista;
    @FXML
    private TextField busquedaTxt;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private Label TituloText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane;

    @FXML
    void buscarButton() {
        String productoBuscar = busquedaTxt.getText();

        if (productoBuscar.isEmpty()) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("El nombre del producto no puede estar vacío.");
            alertaError.showAndWait();
            return;
        }

        String sql = "SELECT * FROM productos WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, productoBuscar);
            ResultSet rs = pstmt.executeQuery();

            lista.getItems().clear(); // Limpiar la lista antes de añadir nuevos resultados

            if (rs.next()) {
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");
                String categoria = rs.getString("categoria");

                String productoInfo = String.format("Nombre: %s, Precio: %.2f, Cantidad: %d, Categoría: %s",
                        nombre, precio, cantidad, categoria);
                lista.getItems().add(productoInfo);
            } else {
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Búsqueda");
                alerta.setHeaderText(null);
                alerta.setContentText("No se encontró el producto.");
                alerta.showAndWait();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Base de Datos");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Hubo un error al buscar el producto en la base de datos.");
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
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert TituloText != null : "fx:id=\"TituloText\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'BuscarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'BuscarProductos.fxml'.";

    }

}
