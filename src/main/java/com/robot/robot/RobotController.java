package com.robot.robot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RobotController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}