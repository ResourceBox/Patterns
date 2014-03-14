package CreationalPatterns.FactoryMethod;

public class SecondConcreteProduct implements Product {

	private String name;
	
	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String model()
	{
		return "SecondConcreteProduct";
	}
	
}
