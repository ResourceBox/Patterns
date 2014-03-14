package BehavioralPatterns.Visitor;

public interface Visitor {
	
	public void visitElementA(ElementA elementA);
	public void visitElementB(ElementB elementB);
	public int getCount();
	public int getSumm();
}
