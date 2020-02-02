package lab3.task2;

public class NewJerseyProgressive extends SlotMachine {

    public NewJerseyProgressive() {
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
