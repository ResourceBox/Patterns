package CreationalPatterns.Builder;

public interface Builder {

	public void createNewProduct();
	public Product getProduct();
	public void buildName();
	public void buildCost();
	public void buildWeight();
	
}
