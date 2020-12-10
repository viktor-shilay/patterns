package java.proxy;

public class MusicPlayerProxy implements Player {

    private String songName;
    private MusicPlayer musicPlayer;

    public MusicPlayerProxy(String songName) {
        this.songName = songName;
    }

    @Override
    public void play() {
        if(musicPlayer==null){
            musicPlayer = new MusicPlayer(songName);
        }
        musicPlayer.play();
    }
}
