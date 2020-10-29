package sample.graphics;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class InputOutputBlock extends Shape {

    private double width;
    private double height;

    public InputOutputBlock(Color color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String ToString() {
        return "Input block color is " + color;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(color);
        graphicsContext.strokePolygon(
                new double[]{
                        300 - width / 3,
                        300 + width * 2 / 3,
                        300 + width / 3,
                        300 - width * 2 / 3
                },
                new double[]{
                        175 - height / 2,
                        175 - height / 2,
                        175 + height / 2,
                        175 + height / 2
                },
                4);
    }
}
