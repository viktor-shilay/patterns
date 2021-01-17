package main.java.strategy;

public class YandexDisk implements Cloud {
    @Override
    public void upload() {
        System.out.println("Upload to YandexDisk...");
    }
}
