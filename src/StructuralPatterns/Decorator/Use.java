package StructuralPatterns.Decorator;

public class Use {
	public Use()
	{
		//Паттерн Decorator
		//Два исходных класса от интерфейса Component
		FirstComponent firstComponent = new FirstComponent();
		SecondComponent secondComponent = new SecondComponent();
		//Объявление декораторов
		Decorator firstDecorator1 = new FirstDecorator(new SecondDecorator(firstComponent));
		Decorator firstDecorator2 = new FirstDecorator(new SecondDecorator(secondComponent));
		//Вызываем обернетые методы
		System.out.println(firstDecorator1.method()); 
		System.out.println(firstDecorator2.method()); 
	}
}
