package main.java.abstractFactory.plushToys.catToy;

import main.java.abstractFactory.plushToys.Collector;

public class CollectorCats implements Collector {
    @Override
    public void collect() {
        System.out.println("Collect a cat...");
    }
}
