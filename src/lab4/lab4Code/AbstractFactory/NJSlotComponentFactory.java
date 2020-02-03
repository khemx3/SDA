package lab4.lab4Code.AbstractFactory;

public class NJSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new smallCabinet();
	}
	public Display createDisplay() {
		return new Reels();
	}
}
