package StructuralPatterns.Proxy;

public class Use {

	public Use()
	{
		System.out.println("[Proxy]");
		
		//Объект ConcreteSubject еще не создан
		Subject proxy = new Proxy();
		
		//В этой точке создает объект ConcreteSubject
		System.out.println("FirstMethod: " + proxy.firstMethod(5, 10));
		System.out.println("SecondMethod: " + proxy.secondMethod(70));
		System.out.println("ThirdMethod: " + proxy.thirdMethod(1, 2, 3));
		
		System.out.println();
	}
	
}
