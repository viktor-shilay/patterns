package main.java.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Server server = new Server();
        server.setCloud(new GoogleDrive());
        server.executeCloud();

        server.setCloud(new OneDrive());
        server.executeCloud();

        server.setCloud(new YandexDisk());
        server.executeCloud();
    }
}
