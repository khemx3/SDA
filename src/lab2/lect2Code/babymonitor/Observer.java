package lab2.lect2Code.babymonitor;

public interface Observer {
	public void update(String babyname, boolean crying, int level);
}
