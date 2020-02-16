package lab4.task1;

public class WTSlotComponentFactory implements SlotComponentFactory {
    public Cabinet createCabinet() {
        return new largeCabinet();
    }
    public Display createDisplay() {
        return new LCD();
    }
}
