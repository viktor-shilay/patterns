package main.java.abstractFactory;

public interface AbstractFactory<T> {
    T get(String type);
}
