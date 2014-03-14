package CreationalPatterns.Builder;

public class ConcreteBuilder implements Builder {

	private Product product;
	
	@Override
	public void createNewProduct() {
		product = new Product();
	}

	@Override
	public Product getProduct() {
		return product;
	}

	@Override
	public void buildName() {
		product.setName("ConcreteBuilder's product");
	}

	@Override
	public void buildCost() {
		product.setCost(1000);
		
	}

	@Override
	public void buildWeight() {
		product.setWeight(10);
	}

	
}
