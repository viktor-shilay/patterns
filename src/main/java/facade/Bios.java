package main.java.facade;

public class Bios {

    Cpu cpu;
    Motherboard motherboard;
    Ssd ssd;
    Videocard videocard;

    public Bios() {
        cpu = new Cpu();
        motherboard = new Motherboard();
        ssd = new Ssd();
        videocard = new Videocard();
    }

    public void testComponents() {
        cpu.test();
        motherboard.test();
        ssd.test();
        videocard.test();
    }

    public void startOS() {
        System.out.println("Starting OS...");
    }
}
