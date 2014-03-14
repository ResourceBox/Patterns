package BehavioralPatterns.Visitor;

public interface Element {
	
	public void accept(Visitor visitor);
	public int get();
	public void set(int amount);
}
