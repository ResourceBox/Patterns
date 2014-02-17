package StructuralPatterns.Bridge;

public class Use {
	public Use()
	{
		System.out.println("[Bridge]");
		//Паттерн Bridge
		//Создание двух интерфейсов с разными реализациями
		Abstraction firstAbstraction = new FirstConcreteClass(new FirstConcreteImplementor());
		Abstraction secondAbstraction = new SecondConcreteClass(new SecondConcreteImplementor());
		//Вызов интерфейсных вызовов с разными реализациями
		firstAbstraction.operation();
		secondAbstraction.operation();
		
	}
}
