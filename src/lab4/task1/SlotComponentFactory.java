package lab4.task1;

public abstract class SlotComponentFactory {
    String type;
    public void setType(String t){ type = t;}
    public abstract Cabinet createCabinet();
    public abstract Display createDisplay();
    public abstract GPU createGPU();
    public abstract Payment createPayment();
    public abstract OS createOS();
//	public CPU createCPU();
}
