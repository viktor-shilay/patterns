package main.java.strategy;

public class Server {

    private Cloud cloud;

    public void setCloud(Cloud cloud) {
        this.cloud = cloud;
    }

    public void executeCloud() {
        cloud.upload();
    }
}
