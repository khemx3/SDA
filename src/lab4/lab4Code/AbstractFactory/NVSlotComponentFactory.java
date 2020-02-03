package lab4.lab4Code.AbstractFactory;

public class NVSlotComponentFactory implements SlotComponentFactory {

	public Cabinet createCabinet() {
		return new largeCabinet();
	}
	public Display createDisplay() {
		return new LCD();
	}
}
