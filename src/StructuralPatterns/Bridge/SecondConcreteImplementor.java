package StructuralPatterns.Bridge;

public class SecondConcreteImplementor implements Implementor {

	@Override
	public String prefix() {
		// TODO Auto-generated method stub
		return "<";
	}

	@Override
	public String body() {
		// TODO Auto-generated method stub
		return "BoDy";
	}

	@Override
	public String postfix() {
		// TODO Auto-generated method stub
		return ">";
	}
	
}
