package sample.graphics;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CycleBlock extends Shape {

    private double width;
    private double height;

    public CycleBlock(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String ToString() {
        return "Cycle block color is + " + color;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setStroke(color);
        graphicsContext.strokePolygon(
                new double[]{
                        300 - width / 2,
                        300 - width / 4,
                        300 + width / 4,
                        300 + width / 2,
                        300 + width / 4,
                        300 - width / 4
                },
                new double[]{
                        175,
                        175 - height / 2,
                        175 - height / 2,
                        175,
                        175 + height / 2,
                        175 + height / 2
                },
                6
        );
    }
}
