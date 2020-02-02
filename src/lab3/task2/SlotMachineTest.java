package lab3.task2;

public class SlotMachineTest {
    public static void main(String[] args) {
        SlotMachineStore nevada = new NevadaStore();
        SlotMachineStore newJersey = new NewJerseyStore();
        SlotMachineStore washington = new WashingtonStore();

        System.out.println("===== Nevada Store =====");

        SlotMachine slotmachine = nevada.orderSlot(slottype.straight);
        System.out.println("Pissa ordered a "+ slotmachine.getName() +"\n");

        slotmachine = nevada.orderSlot(slottype.bonus);
        System.out.println("Pissa ordered a "+ slotmachine.getName() +"\n");

        slotmachine = nevada.orderSlot(slottype.progressive);
        System.out.println("Pissa ordered a "+ slotmachine.getName() +"\n");

        System.out.println("===== NewJersey Store =====");

        slotmachine = newJersey.orderSlot(slottype.straight);
        System.out.println("Leeroy ordered a "+ slotmachine.getName() +"\n");

        slotmachine = newJersey.orderSlot(slottype.bonus);
        System.out.println("Leeroy ordered a "+ slotmachine.getName() +"\n");

        slotmachine = newJersey.orderSlot(slottype.progressive);
        System.out.println("Leeroy ordered a "+ slotmachine.getName() +"\n");

        System.out.println("===== Nevada Store =====");

        slotmachine = washington.orderSlot(slottype.straight);
        System.out.println("Taj Mahal ordered a "+ slotmachine.getName() +"\n");

        slotmachine = washington.orderSlot(slottype.bonus);
        System.out.println("Taj Mahal ordered a "+ slotmachine.getName() +"\n");

        slotmachine = washington.orderSlot(slottype.progressive);
        System.out.println("Taj Mahal ordered a "+ slotmachine.getName() +"\n");

    }
}
