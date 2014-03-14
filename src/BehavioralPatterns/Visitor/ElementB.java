package BehavioralPatterns.Visitor;

public class ElementB implements Element{

	private int amount;
	
	public ElementB(int amount)
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
		visitor.visitElementB(this);
	}
}
