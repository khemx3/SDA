package lab4.task1;

public class SlotMachineApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlotFactory njFactory = new NJSlotFactory();
		SlotFactory nvFactory = new NVSlotFactory();
		SlotFactory WFactory = new WSlotFactory();
		Slot slot = njFactory.orderSlot("bonus");	
		System.out.println("Taj Mahal ordered a " + slot + "\n");
		Slot slot2 = nvFactory.orderSlot("progressive");	
		System.out.println("Peppermill ordered a " + slot2 + "\n");
		Slot slot3 = WFactory.orderSlot("straight");
		System.out.println("Coco ordered a " + slot3 + "\n");
	}
}
