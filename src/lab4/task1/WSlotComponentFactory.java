package lab4.task1;

public class WSlotComponentFactory extends SlotComponentFactory {
    public Cabinet createCabinet() {
        if (type == "Bonus")
            return new MediumCabinet();
        else if (type == "Straight")
            return new LargeCabinet();
        else if (type == "Progressive")
            return new LargeCabinet();
        else
            return null;
    }

    public Payment createPayment() {
        if (type == "Bonus")
            return new Ticketinticketout();
        else if (type == "Straight")
            return new Bills();
        else if (type == "Progressive")
            return new Coins();
        else
            return null;
    }


    public Display createDisplay() {
        if (type == "Bonus")
            return new VGA();
        else if (type == "Straight")
            return new Reels();
        else if (type == "Progressive")
            return new Reels();
        else
            return null;
    }

    public GPU createGPU() {
        return new ARM();
    }

    public OS createOS() {
        if (type == "Bonus")
            return new Symbian();
        else if (type == "Straight")
            return new Linux();
        else if (type == "Progressive")
            return new Android();
        else
            return null;
    }
}
