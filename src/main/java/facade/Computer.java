package main.java.facade;

public class Computer {
    public static void main(String[] args) {
        Bios bios = new Bios();
        bios.testComponents();
        bios.startOS();
    }
}
