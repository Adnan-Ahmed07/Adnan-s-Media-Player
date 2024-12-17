module org.example.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens org.example.myapp to javafx.fxml;
    exports org.example.myapp;
}