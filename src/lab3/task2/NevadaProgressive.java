package lab3.task2;

public class NevadaProgressive extends SlotMachine {

    public NevadaProgressive() {
        name = "Progressive Slots";
        software = "Android";
        components.add("Large");
        components.add("coins");
        components.add("reels");
        components.add("ARM");
    }

    void ship() {
        System.out.println("having uncle vinnie drop it off");
    }
}
