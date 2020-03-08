package project1.src;

import java.io.Serializable;

public abstract class Command implements Serializable {
	
	public abstract void execute(concreteInventory inventory);
	
}