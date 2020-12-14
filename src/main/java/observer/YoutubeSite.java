package main.java.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeSite implements Subject {

    List<String> notifications = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addNotification (String notification){
        this.notifications.add(notification);
        notifyObservers();
    }

    public void removeNotification(String notification){
        this.notifications.remove(notification);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:subscribers){
            observer.update(notifications);
        }
    }
}
