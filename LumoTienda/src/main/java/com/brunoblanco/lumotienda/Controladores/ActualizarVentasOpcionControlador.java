package com.brunoblanco.lumotienda.Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.brunoblanco.lumotienda.Clases.InventarioVenta;
import com.brunoblanco.lumotienda.Clases.Producto;
import com.brunoblanco.lumotienda.Clases.Venta;
import com.brunoblanco.lumotienda.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ActualizarVentasOpcionControlador {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Pane Etiqueta;

    @FXML
    private Text EtiquetaText;

    @FXML
    private Label SubLabel;

    @FXML
    private Label TituloLabel;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Button cantidadBtn;

    @FXML
    private Button nombreClienteBtn;

    @FXML
    private Button nombreProductoBtn;

    @FXML
    private TextArea nuevoDatoTxt;

    private String nombreCliente;
    private InventarioVenta inventarioVenta;

    public void setInventarioVenta(InventarioVenta inventarioVenta) {
        this.inventarioVenta = inventarioVenta;
    }
    public void setNombreCliente(String nombreCliente){this.nombreCliente = nombreCliente;}

    @FXML
    void CantidadButton(MouseEvent event) {
        inventarioVenta = HelloApplication.getInventarioVenta();
        int nuevoDato = Integer.parseInt(nuevoDatoTxt.getText());
        Venta venta = inventarioVenta.buscarVenta(nombreCliente);
        for (Venta i: inventarioVenta.getVentas()){
            if (nombreCliente.equals(i.getNombrec())){
                i.setCantidad(nuevoDato);
                System.out.println(venta.toString());
            }
        }
    }

    @FXML
    void DatoTextArea(MouseEvent event) {

    }

    @FXML
    void MenuButton(MouseEvent event) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MenuVenta.fxml"));
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
    void NombreButton(MouseEvent event) {
        inventarioVenta = HelloApplication.getInventarioVenta();
        String nuevoDato = nuevoDatoTxt.getText();
        Venta venta = inventarioVenta.buscarVenta(nombreCliente);
        for (Venta i: inventarioVenta.getVentas()){
            if (nombreCliente.equals(i.getNombrec())){
                i.setNombrec(nuevoDato);
                System.out.println(venta.toString());
            }
        }
    }

    @FXML
    void NombreProductoButton(MouseEvent event) {
        inventarioVenta = HelloApplication.getInventarioVenta();
        String nuevoDato = nuevoDatoTxt.getText();
        Venta venta = inventarioVenta.buscarVenta(nombreCliente);
        for (Venta i: inventarioVenta.getVentas()){
            if (nombreCliente.equals(i.getNombrec())){
                i.setNombrep(nuevoDato);
                System.out.println(venta.toString());
            }
        }
    }

    @FXML
    void initialize() {
        assert Etiqueta != null : "fx:id=\"Etiqueta\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert EtiquetaText != null : "fx:id=\"EtiquetaText\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert SubLabel != null : "fx:id=\"SubLabel\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert TituloLabel != null : "fx:id=\"TituloLabel\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert anchor != null : "fx:id=\"anchor\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert cantidadBtn != null : "fx:id=\"cantidadBtn\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert nombreClienteBtn != null : "fx:id=\"nombreClienteBtn\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert nombreProductoBtn != null : "fx:id=\"nombreProductoBtn\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";
        assert nuevoDatoTxt != null : "fx:id=\"nuevoDatoTxt\" was not injected: check your FXML file 'ActualizarVentasOpcion.fxml'.";

    }

}

