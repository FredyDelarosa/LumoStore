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
import javafx.scene.control.TextField;
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

    /*@FXML
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
    }*/


    @FXML
    private void actualizarNombreButton(MouseEvent event) {
        String nuevoDato = nuevoDatoTxt.getText().trim();  // Eliminar espacios en blanco adicionales

        if (nuevoDato.isEmpty()) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("El nuevo nombre del producto no puede estar vacío.");
            alertaError.showAndWait();
            return;
        }

        boolean actualizado = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Obtener la conexión a la base de datos
            conn = DatabaseConnection.getConnection();
            String sql = "UPDATE productos SET nombre = ? WHERE nombre = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nuevoDato);
            pstmt.setString(2, nombreProducto);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Producto actualizado en la base de datos.");
                actualizado = true;
            } else {
                System.out.println("No se encontró el producto con el nombre especificado en la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Ocurrió un error al actualizar el producto en la base de datos.");
            alertaError.showAndWait();
            return;
        } finally {
            // Cerrar recursos
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if (actualizado) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("El nombre del producto ha sido actualizado correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
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
    private void CantidadButton(MouseEvent event) {
        String nuevoDatoStr = nuevoDatoTxt.getText().trim();  // Eliminar espacios en blanco adicionales

        if (nuevoDatoStr.isEmpty()) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("La cantidad del producto no puede estar vacía.");
            alertaError.showAndWait();
            return;
        }

        int nuevoDato;
        try {
            nuevoDato = Integer.parseInt(nuevoDatoStr);
        } catch (NumberFormatException e) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("La cantidad del producto debe ser un número entero válido.");
            alertaError.showAndWait();
            return;
        }

        boolean actualizado = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Obtener la conexión a la base de datos
            conn = DatabaseConnection.getConnection();
            String sql = "UPDATE productos SET cantidad = ? WHERE nombre = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, nuevoDato);
            pstmt.setString(2, nombreProducto);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Producto actualizado en la base de datos.");
                actualizado = true;
            } else {
                System.out.println("No se encontró el producto con el nombre especificado en la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Ocurrió un error al actualizar el producto en la base de datos.");
            alertaError.showAndWait();
            return;
        } finally {
            // Cerrar recursos
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if (actualizado) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("La cantidad del producto ha sido actualizada correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se encontró el producto para actualizar.");
            alertaError.showAndWait();
        }
    }
    @FXML
    private void CategoriaButton(MouseEvent event) {
        String nuevoDato = nuevoDatoTxt.getText().trim();  // Eliminar espacios en blanco adicionales

        if (nuevoDato.isEmpty()) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("La categoría del producto no puede estar vacía.");
            alertaError.showAndWait();
            return;
        }

        boolean actualizado = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Obtener la conexión a la base de datos
            conn = DatabaseConnection.getConnection();
            String sql = "UPDATE productos SET categoria = ? WHERE nombre = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, nuevoDato);
            pstmt.setString(2, nombreProducto);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Producto actualizado en la base de datos.");
                actualizado = true;
            } else {
                System.out.println("No se encontró el producto con el nombre especificado en la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Ocurrió un error al actualizar el producto en la base de datos.");
            alertaError.showAndWait();
            return;
        } finally {
            // Cerrar recursos
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if (actualizado) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("La categoría del producto ha sido actualizada correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("No se encontró el producto para actualizar.");
            alertaError.showAndWait();
        }
    }

    @FXML
    private void PrecioButton(MouseEvent event) {
        String nuevoDatoStr = nuevoDatoTxt.getText().trim();  // Eliminar espacios en blanco adicionales

        if (nuevoDatoStr.isEmpty()) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("El precio del producto no puede estar vacío.");
            alertaError.showAndWait();
            return;
        }

        double nuevoDato;
        try {
            nuevoDato = Double.parseDouble(nuevoDatoStr);
        } catch (NumberFormatException e) {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error de Entrada");
            alertaError.setHeaderText(null);
            alertaError.setContentText("El precio del producto debe ser un número válido.");
            alertaError.showAndWait();
            return;
        }

        boolean actualizado = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // Obtener la conexión a la base de datos
            conn = DatabaseConnection.getConnection();
            String sql = "UPDATE productos SET precio = ? WHERE nombre = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setDouble(1, nuevoDato);
            pstmt.setString(2, nombreProducto);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Producto actualizado en la base de datos.");
                actualizado = true;
            } else {
                System.out.println("No se encontró el producto con el nombre especificado en la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
            alertaError.setTitle("Error en la Actualización");
            alertaError.setHeaderText(null);
            alertaError.setContentText("Ocurrió un error al actualizar el producto en la base de datos.");
            alertaError.showAndWait();
            return;
        } finally {
            // Cerrar recursos
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        if (actualizado) {
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Actualización Exitosa");
            alerta.setHeaderText(null);
            alerta.setContentText("El precio del producto ha sido actualizado correctamente.");
            alerta.showAndWait();
        } else {
            Alert alertaError = new Alert(Alert.AlertType.ERROR);
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
