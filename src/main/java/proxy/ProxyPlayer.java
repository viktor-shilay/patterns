package main.java.proxy;

public class ProxyPlayer implements Player {

    private Player player;

    public ProxyPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.play();
        System.out.println("Playing...");
    }
}
