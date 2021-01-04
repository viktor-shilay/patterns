package main.java.abstractFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equals("shape")) {
            return new ShapeFactory();
        } else if (factory.equals("color")) {
            return new ColorFactory();
        } else {
            throw new RuntimeException(factory + " is unknown!");
        }
    }
}
