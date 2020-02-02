package lab3.task2;

public class WashingtonBonus extends SlotMachine {
    public WashingtonBonus() {
        name = "Bonus Game Slots";
        software = "Symbian";
        components.add("Medium");
        components.add("ticketinticketout");
        components.add("VGA");
        components.add("ARM");
    }

    void ship() {
        System.out.println("having uncle vinnie drop it off");
    }
}
