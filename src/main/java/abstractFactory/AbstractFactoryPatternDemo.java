package main.java.abstractFactory;

import main.java.abstractFactory.Color.Color;
import main.java.abstractFactory.Shape.Shape;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        abstractFactory = FactoryProvider.getFactory("color");
        Color color = (Color) abstractFactory.get("blue");
        color.fill();

        abstractFactory = FactoryProvider.getFactory("shape");
        Shape shape = (Shape) abstractFactory.get("circle");
        shape.draw();
    }
}
