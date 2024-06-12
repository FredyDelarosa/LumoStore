module com.brunoblanco.lumotienda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires javafx.web;
    requires java.sql;

    opens com.brunoblanco.lumotienda to javafx.fxml;
    exports com.brunoblanco.lumotienda;
    exports com.brunoblanco.lumotienda.Controladores;
    opens com.brunoblanco.lumotienda.Controladores to javafx.fxml;
}