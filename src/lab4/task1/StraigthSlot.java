package lab4.task1;

public class StraigthSlot extends Slot {

    SlotComponentFactory componentFactory;

    public StraigthSlot(SlotComponentFactory componentFactory) {
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
