package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import sample.graphics.CycleBlock;
import sample.graphics.DecisionBlock;
import sample.graphics.InputOutputBlock;

public class Controller {

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
        input_btn.setOnAction(event -> {
            canvas.getGraphicsContext2D().clearRect(0, 0, 600, 400);
            new InputOutputBlock(Color.BLUE, 300, 120).draw(canvas.getGraphicsContext2D());
        });

        decision_btn.setOnAction(event -> {
            canvas.getGraphicsContext2D().clearRect(0, 0, 600, 400);
            new DecisionBlock(Color.BLACK, 300, 200).draw(canvas.getGraphicsContext2D());
        });

        cycle_btn.setOnAction(event -> {
            canvas.getGraphicsContext2D().clearRect(0, 0, 600, 400);
            new CycleBlock(Color.GREEN, 300, 120).draw(canvas.getGraphicsContext2D());
        });

        output_btn.setOnAction(event -> {
            canvas.getGraphicsContext2D().clearRect(0, 0, 600, 400);
            new InputOutputBlock(Color.DARKRED, 300, 120).draw(canvas.getGraphicsContext2D());
        });
    }
}
