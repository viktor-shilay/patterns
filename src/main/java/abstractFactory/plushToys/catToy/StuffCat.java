package main.java.abstractFactory.plushToys.catToy;

import main.java.abstractFactory.plushToys.Collector;
import main.java.abstractFactory.plushToys.Designer;
import main.java.abstractFactory.plushToys.Seamstress;
import main.java.abstractFactory.plushToys.StuffFactory;

public class StuffCat implements StuffFactory {
    @Override
    public Designer getDesigner() {
        return new DesignerCats();
    }

    @Override
    public Seamstress getSeamstress() {
        return new SeamstressCats();
    }

    @Override
    public Collector getCollector() {
        return new CollectorCats();
    }
}
