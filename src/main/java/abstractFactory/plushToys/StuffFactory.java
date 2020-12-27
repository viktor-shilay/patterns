package main.java.abstractFactory.plushToys;

public interface StuffFactory {
    Designer getDesigner();

    Seamstress getSeamstress();

    Collector getCollector();
}
