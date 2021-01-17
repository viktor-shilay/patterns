package main.java.strategy;

public class OneDrive implements Cloud {
    @Override
    public void upload() {
        System.out.println("Upload to OneDrive...");
    }
}
