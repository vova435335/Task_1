package sample.graphics;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DecisionBlock extends Shape {

    private double width;
    private double height;

    public DecisionBlock(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String ToString() {
        return "Decision block color is + " + color;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(color);
        graphicsContext.strokeRect(
                300 - width / 2,
                175 - height / 2,
                width,
                height
        );
    }
}
