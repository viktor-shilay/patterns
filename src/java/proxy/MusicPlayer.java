package java.proxy;

public class MusicPlayer implements Player {

    private String songName;

    public MusicPlayer(String songName) {
        this.songName = songName;
        load();
    }

    public void load(){
        System.out.println("Loading song " + songName + "...");
    }

    @Override
    public void play() {
        System.out.println("Playing song " + songName + "...");
    }
}
