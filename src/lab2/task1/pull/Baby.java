package lab2.task1.pull;

import java.util.ArrayList;
import java.util.Observable;

public class Baby extends Observable {

	private boolean crying=false;
	private int level=0;
	private String babyname;
	public Baby(String name){
		this.babyname=name;
	}
	
	public void setData(boolean crying, int level) {
		setChanged();
		this.crying=crying;
		this.level=level;
//		System.out.println(hasChanged());
		notifyObservers();
	}

	public boolean getCrying() {
		return crying;
	}

	public int getLevel() {
		return level;
	}

	public String getBabyname() {
		return babyname;
	}

}
