module com.example.javabasicsday2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasicsday2 to javafx.fxml;
    exports com.example.javabasicsday2;
}