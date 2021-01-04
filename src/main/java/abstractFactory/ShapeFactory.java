package main.java.abstractFactory;

import main.java.abstractFactory.Shape.Circle;
import main.java.abstractFactory.Shape.Rectangle;
import main.java.abstractFactory.Shape.Shape;
import main.java.abstractFactory.Shape.Square;

public class ShapeFactory implements AbstractFactory<Shape> {
    public Shape get(String shapeType) {
        switch (shapeType) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                throw new RuntimeException(shapeType + " is unknown!");
        }
    }
}
