package CreationalPatterns.Builder;

public class Use {

	public Use()
	{
		System.out.println("[Builder]");
		
		//Строитель
		Builder builder = new ConcreteBuilder();
		
		//Директор
		Director director = new ConcreteDirector();
		//При замене строителя получаемый объект будет совершено другим
		director.setBuilder(builder);
		director.buildProduct();
		
		//Готовый продукт
		
		Product product = director.getProduct();
		
		System.out.println("Name: " + product.getName());
		System.out.println("Cost: " + product.getCost());
 		System.out.println("Weight: " + product.getWeight());
 		
 		System.out.println();
	}
	
}
