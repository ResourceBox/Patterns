package CreationalPatterns.FactoryMethod;

public class ConcreteCreator implements Creator {

	public Product factoryMethod(int productId)
	{
		if(productId == 1)
			return new FirstConcreteProduct();
		else if(productId == 2)
			return new SecondConcreteProduct();
		return null;
	}	
}
