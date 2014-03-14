package CreationalPatterns.FactoryMethod;

public class Use {

	public Use()
	{
		System.out.println("[FactoryMethod]");
		
		//Конкретный создатель
		Creator creator = new ConcreteCreator();
		//Создание конкретных продуктов 
		Product product;
		//Первый объект
		product = creator.factoryMethod(1);
		System.out.println(product.model()); 
		//Второй объект
		product = creator.factoryMethod(2);
		System.out.println(product.model()); 
		//В синтаксе не видно разницы
		
		System.out.println();
	}
}

