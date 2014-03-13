package BehavioralPatterns.Iterator;

public interface Iterator {
	public void first();
	public void next();
	public boolean isDone();
	public int currentItem() throws Exception;
}
