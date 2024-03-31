module com.brunoblanco.lumotienda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.brunoblanco.lumotienda to javafx.fxml;
    exports com.brunoblanco.lumotienda;
}