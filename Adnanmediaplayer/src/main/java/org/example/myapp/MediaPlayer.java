package org.example.myapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MediaPlayer {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}