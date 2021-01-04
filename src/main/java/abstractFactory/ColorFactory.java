package main.java.abstractFactory;

import main.java.abstractFactory.Color.Blue;
import main.java.abstractFactory.Color.Color;
import main.java.abstractFactory.Color.Green;
import main.java.abstractFactory.Color.Red;

public class ColorFactory implements AbstractFactory<Color> {
    public Color get(String colorType) {
        switch (colorType) {
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            case "red":
                return new Red();
            default:
                throw new RuntimeException(colorType + " is unknown!");
        }
    }
}
