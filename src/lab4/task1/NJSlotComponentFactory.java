package lab4.task1;

public class NJSlotComponentFactory extends SlotComponentFactory {

    public Cabinet createCabinet() {
        if (type == "Bonus")
            return new LargeCabinet();
        else if (type == "Straight")
            return new SmallCabinet();
        else if (type == "Progressive")
            return new SmallCabinet();
        else
            return null;
    }

    public Payment createPayment() {
        if (type == "Bonus")
            return new Coins();
        else if (type == "Straight")
            return new Coins();
        else if (type == "Progressive")
            return new Bills();
        else
            return null;
    }


    public Display createDisplay() {
        if (type == "Bonus")
            return new Reels();
        else if (type == "Straight")
            return new LCD();
        else if (type == "Progressive")
            return new CRT();
        else
            return null;
    }

    public GPU createGPU() {
        if (type == "Bonus")
            return new ARM();
        else if (type == "Straight")
            return new ARM();
        else if (type == "Progressive")
            return new X86();
        else
            return null;
    }

    public OS createOS() {
        if (type == "Bonus")
            return new WindowsME();
        else if (type == "Straight")
            return new WindowsME();
        else if (type == "Progressive")
            return new WindowaXP();
        else
            return null;
    }

}

