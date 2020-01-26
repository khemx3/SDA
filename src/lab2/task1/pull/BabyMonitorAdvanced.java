package lab2.task1.pull;


import java.util.Observable;
import java.util.Observer;

public class BabyMonitorAdvanced implements Observer {
	private Baby mdata, cdata;
	private String babyname;
	private String name;
	private boolean crying;
	private int level;

	private Baby baby ;
	
	public BabyMonitorAdvanced(String name, Baby m, Baby c) {
		this.name=name; this.mdata=m; this.cdata=c;
		mdata.addObserver(this);
		cdata.addObserver(this);
	}
	
	public void display() {
		if (crying) {
			System.out.println("Monitor:"+ name + " baby: " + babyname + " is crying at level: " + level);
		}
	}

	@Override
	public void update(Observable o, Object arg) {
		baby = (Baby) o;
		this.babyname = baby.getBabyname();
		this.crying = baby.getCrying();
		this.level = baby.getLevel();
		display();
	}
}
