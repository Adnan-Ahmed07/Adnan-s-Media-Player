module org.example.myapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.myapp to javafx.fxml;
    exports org.example.myapp;
}