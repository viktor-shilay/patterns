package main.java.factoryMethod;

import main.java.factoryMethod.Shape.Shape;
import main.java.factoryMethod.Shape.ShapeType;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}
