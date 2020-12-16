package main.java.proxy;

public class MusicPlayer implements Player {

    private String songName;

    public MusicPlayer(String songName) {
        this.songName = songName;
        load();
    }

    public void load() {
        System.out.println("Loading playlists... Loading song " + songName + "...");
    }

    @Override
    public void play() {
        System.out.println("Start playing song " + songName + "...");
    }
}
