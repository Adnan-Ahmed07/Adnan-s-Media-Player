module org.example.adnanmediaplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.adnanmediaplayer to javafx.fxml;
    exports org.example.adnanmediaplayer;
}