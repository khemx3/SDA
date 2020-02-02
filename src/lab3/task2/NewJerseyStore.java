package lab3.task2;

public class NewJerseyStore extends SlotMachineStore {

    protected SlotMachine createSlotMachine(slottype type) {
        SlotMachine tmp = null;
        if (type.equals(slottype.straight)) {
            tmp = new  NewJerseyStraight();
            tmp.cost=(float) (tmp.cost*1.1);
        } else if (type.equals(slottype.bonus)) {
            tmp = new  NewJerseyBonus();
            tmp.cost=(float) (tmp.cost*1.1);
        } else if (type.equals(slottype.progressive)) {
            tmp = new  NewJerseyProgressive();
            tmp.cost=(float) (tmp.cost*1.1);
        }
        return tmp;
    }
}
