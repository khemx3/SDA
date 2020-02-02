package lab3.task2;

public class NevadaStore extends SlotMachineStore {

    protected SlotMachine createSlotMachine(slottype type) {
        SlotMachine tmp = null;
        if (type.equals(slottype.straight)) {
            tmp = new NevadaStraight();
            tmp.cost=(float) (tmp.cost*1.1);
        } else if (type.equals(slottype.bonus)) {
            tmp = new NevadaBonus();
            tmp.cost=(float) (tmp.cost*1.1);
        } else if (type.equals(slottype.progressive)) {
            tmp = new NevadaProgressive();
            tmp.cost=(float) (tmp.cost*1.1);
        }
        return tmp;
    }
}
