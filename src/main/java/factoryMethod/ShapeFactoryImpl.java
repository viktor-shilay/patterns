package main.java.factoryMethod;

public class ShapeFactoryImpl implements ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
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
