package main.java.abstractFactory.plushToys.bearToy;

import main.java.abstractFactory.plushToys.Collector;
import main.java.abstractFactory.plushToys.Designer;
import main.java.abstractFactory.plushToys.Seamstress;
import main.java.abstractFactory.plushToys.StuffFactory;

public class StuffBear implements StuffFactory {
    @Override
    public Designer getDesigner() {
        return new DesignerBear();
    }

    @Override
    public Seamstress getSeamstress() {
        return new SeamstressBear();
    }

    @Override
    public Collector getCollector() {
        return new CollectorBear();
    }
}
