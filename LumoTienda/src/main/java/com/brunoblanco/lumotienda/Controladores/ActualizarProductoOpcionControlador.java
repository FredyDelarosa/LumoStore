package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioRopa;
import com.brunoblanco.lumotienda.Clases.Producto;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class ActualizarProductoOpcionControlador {

    //cambiar datos
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private TextField nuevoDatoTxt;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private Label SubtituloText;

    @FXML
    private Label TituloText;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Pane pane;
    private String nombreProducto;
    private InventarioRopa inventarioRopa;

    public void setInventarioRopa(InventarioRopa inventarioRopa) {
        this.inventarioRopa = inventarioRopa;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    @FXML
    void actualizarNombreButton() {
        inventarioRopa = HelloApplication.getInventarioRopa();
        String nuevoDato = nuevoDatoTxt.getText();
        Producto producto = inventarioRopa.buscarProductoNombre(nombreProducto);
        boolean actualizado = false;
        for (Producto i: inventarioRopa.getProductos()){
            if (nombreProducto.equals(i.getNombre())){
                i.setNombre(nuevoDato);
                System.out.println(producto.toString());
                actualizado = true;
                break;
            }
        }

        if (actualizado) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("El nombre del producto ha sido actualizado correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se encontró el producto para actualizar.");
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
            stage.setTitle("Menú productos");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }


    @FXML
    void CantidadButton(MouseEvent event){
        inventarioRopa = HelloApplication.getInventarioRopa();
        int nuevoDato = Integer.parseInt(nuevoDatoTxt.getText());
        Producto producto = inventarioRopa.buscarProductoNombre(nombreProducto);
        boolean actualizado = false;
        for (Producto i: inventarioRopa.getProductos()){
            if (nombreProducto.equals(i.getNombre())){
                i.setCantidad(nuevoDato);
                System.out.println(producto.toString());
                actualizado = true;
                break;
            }
        }
        if (actualizado) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("La cantidad del producto ha sido actualizado correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se encontró el producto para actualizar.");
            alertaError.showAndWait();
        }
    }
    @FXML
    void CategoriaButton(MouseEvent event){
        inventarioRopa = HelloApplication.getInventarioRopa();
        String nuevoDato = nuevoDatoTxt.getText();
        Producto producto = inventarioRopa.buscarProductoNombre(nombreProducto);
        boolean actualizado = false;
        for (Producto i: inventarioRopa.getProductos()){
            if (nombreProducto.equals(i.getNombre())){
                i.setCategoria(nuevoDato);
                System.out.println(producto.toString());
                actualizado = true;
                break;
            }
        }
        if (actualizado) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("La categoria del producto ha sido actualizado correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se encontró el producto para actualizar.");
            alertaError.showAndWait();
        }
    }

    @FXML
    void PrecioButton(MouseEvent event) {
        inventarioRopa = HelloApplication.getInventarioRopa();
        double nuevoDato = Double.parseDouble(nuevoDatoTxt.getText());
        Producto producto = inventarioRopa.buscarProductoNombre(nombreProducto);
        boolean actualizado = false;
        for (Producto i: inventarioRopa.getProductos()){
            if (nombreProducto.equals(i.getNombre())){
                i.setPrecio(nuevoDato);
                System.out.println(producto.toString());
                actualizado = true;
                break;
            }
        }
        if (actualizado) {
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("El precio del producto ha sido actualizado correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se encontró el producto para actualizar.");
            alertaError.showAndWait();
        }
    }

    @FXML
    void initialize() {
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'ActualizarProductoOpcion.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'ActualizarProductoOpcion.fxml'.";
        assert SubtituloText != null : "fx:id=\"SubtituloText\" was not injected: check your FXML file 'ActualizarProductoOpcion.fxml'.";
        assert TituloText != null : "fx:id=\"TituloText\" was not injected: check your FXML file 'ActualizarProductoOpcion.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'ActualizarProductoOpcion.fxml'.";
        assert pane != null : "fx:id=\"pane\" was not injected: check your FXML file 'ActualizarProductoOpcion.fxml'.";

    }

}
