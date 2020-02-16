package lab4.task1;

public class ProgressiveSlot extends Slot {
    SlotComponentFactory componentFactory;

    public ProgressiveSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
        this.componentFactory.setType("Progressive");
    }

    void build() {
        cabinet = componentFactory.createCabinet();
        display = componentFactory.createDisplay();
        software = componentFactory.createOS();
        gpu = componentFactory.createGPU();
        payment = componentFactory.createPayment();

    }
}
