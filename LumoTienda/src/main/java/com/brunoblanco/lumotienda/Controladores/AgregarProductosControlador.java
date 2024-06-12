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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;

//para agregar productos
public class AgregarProductosControlador {
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField precioTxt;
    @FXML
    private TextField categoriaTxt;
    @FXML
    private TextField cantidadTxt;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button BtnAgregar;

    @FXML
    private Pane pane;

   /* @FXML
    void agregarProduct(MouseEvent event) {
        InventarioRopa inventarioRopa = HelloApplication.getInventarioRopa();
        String nombre = nombreTxt.getText();
        double precio = Double.parseDouble(precioTxt.getText());
        int cantidad = Integer.parseInt(cantidadTxt.getText());
        String categoria = categoriaTxt.getText();
        Producto producto = new Producto(nombre,precio,cantidad,categoria);
        boolean agregado = inventarioRopa.agregarProducto(producto);
        if (agregado){
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Confirmación de agregado");
            alerta.setHeaderText(null);
            alerta.setContentText("Producto agregado correctamente");
            alerta.showAndWait();
        }else{
            Alert alertaError = new Alert(AlertType.ERROR);
            alertaError.setTitle("Error de Agregado");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se pudo agregar el producto.");
            alertaError.showAndWait();
        }
    }*/

    public void agregarProduct(MouseEvent event) {
        /*obtenemos los valores desde su campo*/
        String nombre = nombreTxt.getText();
        double precio = Double.parseDouble(precioTxt.getText());
        int cantidad = Integer.parseInt(cantidadTxt.getText());
        String categoria = categoriaTxt.getText();

        /*usamos este comando para enviar los datos a la bd*/
        String sql = "INSERT INTO productos (nombre, precio, cantidad, categoria) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre);
            pstmt.setDouble(2, precio);
            pstmt.setInt(3, cantidad);
            pstmt.setString(4, categoria);

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                Alert alerta = new Alert(AlertType.INFORMATION);
                alerta.setTitle("Confirmación de agregado");
                alerta.setHeaderText(null);
                alerta.setContentText("Producto agregado correctamente");
                alerta.showAndWait();
            } else {
                Alert alertaError = new Alert(AlertType.ERROR);
                alertaError.setTitle("Error de Agregado");
                alertaError.setHeaderText(null);
                alertaError.setContentText("No se pudo agregar el producto.");
                alertaError.showAndWait();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(AlertType.ERROR);
            alertaError.setTitle("Error de Agregado");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Hubo un error al agregar el producto a la base de datos.");
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
    void initialize() {
        assert BtnAgregar != null : "fx:id=\"BtnAgregar\" was not injected: check your FXML file 'AgregarProductos.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'AgregarProductos.fxml'.";

    }

}


