package lab3.task2;

public abstract class SlotMachineStore {

    protected abstract SlotMachine createSlotMachine(slottype type);

    public SlotMachine orderSlot(slottype type) {
        SlotMachine slotmachine;
        slotmachine = createSlotMachine(type);
        slotmachine.collectParts();
        slotmachine.assembleParts();
        slotmachine.test("hardware");
        slotmachine.uploadSoftware();
        slotmachine.ship();
        return slotmachine;
    }

}
