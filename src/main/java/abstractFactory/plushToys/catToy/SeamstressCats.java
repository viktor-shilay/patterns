package main.java.abstractFactory.plushToys.catToy;

import main.java.abstractFactory.plushToys.Seamstress;

public class SeamstressCats implements Seamstress {
    @Override
    public void sew() {
        System.out.println("Sew a cat...");
    }
}
