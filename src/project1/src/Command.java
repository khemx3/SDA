package project1.src;

import java.io.Serializable;

public abstract class Command implements Serializable {
	
	public abstract void execute(concreteInventory inventory) throws MatchNotFoundException;
	public abstract void rollback(concreteInventory inventory) throws MatchNotFoundException;
}