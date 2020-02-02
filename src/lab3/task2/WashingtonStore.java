package lab3.task2;


public class WashingtonStore extends SlotMachineStore {

    protected SlotMachine createSlotMachine(slottype type) {
        SlotMachine tmp = null;
        if (type.equals(slottype.straight)) {
            tmp = new WashingtonStraight();
            tmp.cost=(float) (tmp.cost*1.1);
        } else if (type.equals(slottype.bonus)) {
            tmp = new WashingtonBonus();
            tmp.cost=(float) (tmp.cost*1.1);
        } else if (type.equals(slottype.progressive)) {
            tmp = new WashingtonProgressive();
            tmp.cost=(float) (tmp.cost*1.1);
        }
        return tmp;
    }
}
