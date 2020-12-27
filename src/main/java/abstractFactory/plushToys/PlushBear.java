package main.java.abstractFactory.plushToys;

import main.java.abstractFactory.plushToys.bearToy.StuffBear;

public class PlushBear {
    public static void main(String[] args) {
        StuffFactory stuffFactory = new StuffBear();
        Designer designer = stuffFactory.getDesigner();
        Seamstress seamstress = stuffFactory.getSeamstress();
        Collector collector = stuffFactory.getCollector();
        System.out.println("**********Create a plush bear**********");
        designer.designToy();
        seamstress.sew();
        collector.collect();
    }
}
