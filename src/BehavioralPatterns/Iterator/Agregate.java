package BehavioralPatterns.Iterator;

public interface Agregate {
	public Iterator createIterator();
	public int count();
	public int get(int i);
	public void add(int number);
	public void remove(int number);
	public void removeAt(int index);
}
