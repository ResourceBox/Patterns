package CreationalPatterns.Builder;

public class Product {

	private String name;
	private int cost;
	private int weight;
	
	public Product()
	{
		name = "";
		cost = 0;
		weight = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
