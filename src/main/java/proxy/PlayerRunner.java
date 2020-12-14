package main.java.proxy;

public class PlayerRunner {
    public static void main(String[] args) {
        /*Player player = new MusicPlayer("Never gonna give you up");
        player.play();*/

        Player player = new MusicPlayerProxy("Never gonna give you up");
        player.play();
    }
}
