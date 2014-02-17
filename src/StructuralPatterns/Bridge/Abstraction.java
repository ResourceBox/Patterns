package StructuralPatterns.Bridge;

public abstract class Abstraction {
	
	protected Implementor implementor;
	
	public abstract void operation();
}
