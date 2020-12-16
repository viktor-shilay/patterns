package main.java.proxy;

public class VideoPlayer implements Player {

    private String videoName;

    public VideoPlayer(String videoName) {
        this.videoName = videoName;
        load();
    }

    public void load() {
        System.out.println("Loading subtitles... Loading video " + videoName + "...");
    }

    @Override
    public void play() {
        System.out.println("Start playing video " + videoName + "...");
    }
}
