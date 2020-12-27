package main.java.abstractFactory.plushToys.catToy;

import main.java.abstractFactory.plushToys.Designer;

public class DesignerCats implements Designer {
    @Override
    public void designToy() {
        System.out.println("Design a cat...");
    }
}
