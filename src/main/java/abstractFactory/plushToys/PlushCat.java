package main.java.abstractFactory.plushToys;

import main.java.abstractFactory.plushToys.catToy.StuffCat;

public class PlushCat {
    public static void main(String[] args) {
        StuffFactory stuffFactory = new StuffCat();
        Designer designer = stuffFactory.getDesigner();
        Seamstress seamstress = stuffFactory.getSeamstress();
        Collector collector = stuffFactory.getCollector();
        System.out.println("**********Create a plush cat**********");
        designer.designToy();
        seamstress.sew();
        collector.collect();
    }
}
