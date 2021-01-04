package main.java.factoryMethod;

public class FactoryPattern {
    public static void main(String[] args) {
        Shape shape = new ShapeFactoryImpl().getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}
