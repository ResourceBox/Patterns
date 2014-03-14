package BehavioralPatterns.Visitor;

public class ConcreteVisitor implements Visitor {

	private int count = 0;
	private int summ = 0;
	
	@Override
	public void visitElementA(ElementA elementA) {
		count += elementA.get();
	}

	@Override
	public void visitElementB(ElementB elementB) {
		summ++;
	}

	@Override
	public int getCount()
	{
		return count;
	}
	
	@Override
	public int getSumm()
	{
		return summ;
	}
	
}
