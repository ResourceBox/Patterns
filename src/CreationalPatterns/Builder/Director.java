package CreationalPatterns.Builder;

public interface Director {

	public void setBuilder(Builder builder);
	public void buildProduct();
	public Product getProduct();
}
