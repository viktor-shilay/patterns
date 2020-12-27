package main.java.abstractFactory.plushToys.bearToy;

import main.java.abstractFactory.plushToys.Seamstress;

public class SeamstressBear implements Seamstress {
    @Override
    public void sew() {
        System.out.println("Sew a bear...");
    }
}
