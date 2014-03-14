package CreationalPatterns.Builder;

public class ConcreteDirector implements Director {

	private Builder builder;
	
	public ConcreteDirector()
	{
		
	}
	
	@Override
	public void setBuilder(Builder builder)
	{
		this.builder = builder;
	}
	
	@Override
	public Product getProduct()
	{
		return builder.getProduct();
	}

	@Override
	public void buildProduct() {
		builder.createNewProduct();
		builder.buildName();
		builder.buildCost();
		builder.buildWeight();
	}
	
}
