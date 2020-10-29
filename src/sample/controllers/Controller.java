package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Canvas canvas;

    @FXML
    private Button input_btn;

    @FXML
    private Button decision_btn;

    @FXML
    private Button cycle_btn;

    @FXML
    private Button output_btn;

    @FXML
    void initialize() {
        assert canvas != null : "fx:id=\"canvas\" was not injected: check your FXML file 'sample.fxml'.";
        assert input_btn != null : "fx:id=\"input_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert decision_btn != null : "fx:id=\"decision_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert cycle_btn != null : "fx:id=\"cycle_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert output_btn != null : "fx:id=\"output_btn\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
