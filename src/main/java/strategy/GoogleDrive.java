package main.java.strategy;

public class GoogleDrive implements Cloud {
    @Override
    public void upload() {
        System.out.println("Upload to GoogleDrive...");
    }
}
