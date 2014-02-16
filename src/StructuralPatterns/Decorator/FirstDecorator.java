package StructuralPatterns.Decorator;

public class FirstDecorator extends Decorator {
	
	private Component component = null;
	
	public FirstDecorator(Component component)
	{
		super(component);
		this.component = component;
	}
	
	@Override
	public String method()
	{
		return "M" + component.method();
	}
}
