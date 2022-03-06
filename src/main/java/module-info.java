module com.mpm.tareaiiparcial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mpm.tareaiiparcial to javafx.fxml;
    exports com.mpm.tareaiiparcial;
}
