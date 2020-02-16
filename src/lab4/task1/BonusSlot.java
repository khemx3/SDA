package lab4.task1;

public class BonusSlot extends Slot {
    SlotComponentFactory componentFactory;

    public BonusSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
        this.componentFactory.setType("Bonus");
    }

    void build() {
        System.out.println("Building " + name);
        cabinet = componentFactory.createCabinet();
        display = componentFactory.createDisplay();
        software = componentFactory.createOS();
        gpu = componentFactory.createGPU();
        payment = componentFactory.createPayment();

    }
}
