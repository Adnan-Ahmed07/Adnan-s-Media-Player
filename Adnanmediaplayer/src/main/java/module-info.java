module com.Adnansoft.javafxmedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.Adnansoft.javafxmedia to javafx.fxml;
    exports com.Adnansoft.javafxmedia;
}