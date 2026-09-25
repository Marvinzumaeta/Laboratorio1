module com.example.uni_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.uni_1 to javafx.fxml;
    exports com.example.uni_1;
}