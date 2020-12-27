package main.java.abstractFactory.plushToys.bearToy;

import main.java.abstractFactory.plushToys.Designer;

public class DesignerBear implements Designer {
    @Override
    public void designToy() {
        System.out.println("Design a bear...");
    }
}
