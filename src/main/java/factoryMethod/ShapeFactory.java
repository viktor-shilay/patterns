package main.java.factoryMethod;

import main.java.factoryMethod.Shape.Circle;
import main.java.factoryMethod.Shape.Rectangle;
import main.java.factoryMethod.Shape.Shape;
import main.java.factoryMethod.Shape.ShapeType;
import main.java.factoryMethod.Shape.Square;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new RuntimeException(shapeType + " is unknown!");
        }
    }
}
