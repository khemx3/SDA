package lab10.step7observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
