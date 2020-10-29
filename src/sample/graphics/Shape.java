package sample.graphics;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract class Shape {

    Color color;

    public abstract String ToString();

    public abstract void draw(GraphicsContext graphicsContext);

    Shape(Color color) {
        this.color = color;
    }

}
