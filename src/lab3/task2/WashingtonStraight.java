package lab3.task2;

public class WashingtonStraight extends SlotMachine {
    public WashingtonStraight() {
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
