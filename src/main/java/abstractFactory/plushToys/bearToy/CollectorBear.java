package main.java.abstractFactory.plushToys.bearToy;

import main.java.abstractFactory.plushToys.Collector;

public class CollectorBear implements Collector {
    @Override
    public void collect() {
        System.out.println("Collect a bear...");
    }
}
