package StructuralPatterns.Adapter;

public class Adapter implements SourceInterface{

	private Adaptee adaptee = new Adaptee();
	
	@Override
	public void firstMethod() {
		System.out.println("FirstMethod: " + adaptee.firstOtherMethod());
	}

	@Override
	public void secondMethod() {
		System.out.println("SecondMethod: " + adaptee.secondOtherMethod());
	}

	@Override
	public void thirdMethod() {
		System.out.println("ThirdMethod: " + adaptee.thirdOtherMethod());
	}
	
}
