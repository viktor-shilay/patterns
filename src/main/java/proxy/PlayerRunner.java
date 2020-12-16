package main.java.proxy;

public class PlayerRunner {
    public static void main(String[] args) {
        Player musicPlayer = new ProxyPlayer(new MusicPlayer("Never gonna give you up"));
        musicPlayer.play();
        System.out.println("************************");
        Player videoPlayer = new ProxyPlayer(new VideoPlayer("Zoom conference"));
        videoPlayer.play();
    }
}
