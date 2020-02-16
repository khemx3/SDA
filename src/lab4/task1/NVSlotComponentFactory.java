package lab4.task1;

public class NVSlotComponentFactory extends SlotComponentFactory {

	public Cabinet createCabinet() {
		if (type == "Bonus")
			return new SmallCabinet();
		else if (type == "Straight")
			return new LargeCabinet();
		else if (type == "Progressive")
			return new MediumCabinet();
		else
			return null;
	}

	public Payment createPayment() {
		return new Ticketinticketout();
	}


	public Display createDisplay() {
		if (type == "Bonus")
			return new CRT();
		else if (type == "Straight")
			return new Reels();
		else if (type == "Progressive")
			return new LCD();
		else
			return null;
	}

	public GPU createGPU() {
		if (type == "Bonus")
			return new X86();
		else if (type == "Straight")
			return new ARM();
		else if (type == "Progressive")
			return new X77();
		else
			return null;
	}

	public OS createOS() {
		if (type == "Bonus")
			return new Linux();
		else if (type == "Straight")
			return new Linux();
		else if (type == "Progressive")
			return new Android();
		else
			return null;
	}

}

