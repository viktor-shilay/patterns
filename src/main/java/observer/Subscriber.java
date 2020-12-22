package main.java.observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(List<String> notifications) {
        System.out.println("Dear " + name + "!. There is a notification(s) for you!\n" + notifications +
                "\n*************************************");
    }
}
