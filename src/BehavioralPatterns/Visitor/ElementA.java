package BehavioralPatterns.Visitor;

public class ElementA implements Element {
	
	private int amount;
	
	public ElementA(int amount)
	{
		this.amount = amount;
	}
	
	public int get()
	{
		return amount;
	}
	
	public void set(int amount)
	{
		this.amount = amount;
	}
	
	public void accept(Visitor visitor)
	{
		visitor.visitElementA(this);
	}
}
