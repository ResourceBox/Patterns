package StructuralPatterns.Decorator;

public class SecondDecorator extends Decorator {
	
	private Component component = null;
	
	public SecondDecorator(Component component)
	{
		super(component);
		this.component = component;
	}
	
	@Override
	public String method()
	{
		return "K" + component.method();
	}
	
}
