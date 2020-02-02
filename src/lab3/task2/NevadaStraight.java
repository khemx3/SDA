package lab3.task2;

public class NevadaStraight extends SlotMachine {
    public NevadaStraight() {
        name = "Straight Slots";
        software = "Linux";
        components.add("Large");
        components.add("bills");
        components.add("reels");
        components.add("ARM");
    }

    void ship() {
        System.out.println("having uncle vinnie drop it off");
    }
}
