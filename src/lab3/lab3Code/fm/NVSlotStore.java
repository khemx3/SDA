package lab3.lab3Code.fm;

public class NVSlotStore extends SlotStore {
	
	protected Slot makeSlot(slottype type) {
		if (type.equals(slottype.progressive)) return new NVSlotProgressive();
		else return null;
	}
}
