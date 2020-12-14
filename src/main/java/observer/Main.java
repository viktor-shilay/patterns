package main.java.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeSite youtube = new YoutubeSite();
        youtube.addNotification("New video on the channel"); //no subscribers
        youtube.addNotification("New post on the channel");  //no subscribers

        Observer firstSubscriber = new Subscriber("Viktor Shilay");
        Observer secondSubscriber = new Subscriber("Dmitry Kosinsky");

        youtube.addObserver(firstSubscriber);
        youtube.addObserver(secondSubscriber);

        youtube.addNotification("1M subscribers on the channel!!!");      //notify all subscribers

        youtube.removeNotification("1M subscribers on the channel!!!");   //notify all subscribers
    }
}
