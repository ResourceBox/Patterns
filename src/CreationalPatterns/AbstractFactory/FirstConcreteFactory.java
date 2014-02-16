package CreationalPatterns.AbstractFactory;

public class FirstConcreteFactory implements AbstractFactory{

	public AbstractComputer createComputer()
	{
		return new FirstComputer();
	}
	
	public AbstractPhone createPhone()
	{
		return new FirstPhone();
	}
}
