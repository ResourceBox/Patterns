package StructuralPatterns.Decorator;

//Декоратор
public abstract class Decorator implements Component {

	private Component component = null;
	
	public Decorator(Component component)
	{
		this.component = component;
	}
	
	@Override
	public String method()
	{
		return component.method();
	}
	
}
