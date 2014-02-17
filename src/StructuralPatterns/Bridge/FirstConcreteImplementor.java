package StructuralPatterns.Bridge;

public class FirstConcreteImplementor implements Implementor {

	@Override
	public String prefix() {
		// TODO Auto-generated method stub
		return "[";
	}

	@Override
	public String postfix() {
		// TODO Auto-generated method stub
		return "]";
	}

	@Override
	public String body() {
		// TODO Auto-generated method stub
		return "Body";
	}
}
