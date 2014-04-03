package StructuralPatterns.Proxy;

public class ConcreteSubject implements Subject {

	@Override
	public int firstMethod(int a, int b) {
		return a + b;
	}

	@Override
	public int secondMethod(int a) {
		return a * 2;
	}

	@Override
	public int thirdMethod(int a, int b, int c) {
		return (a + b + c) / 3;
	}
	
}
