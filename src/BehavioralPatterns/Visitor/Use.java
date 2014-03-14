package BehavioralPatterns.Visitor;

public class Use {
	
	public Use()
	{
		System.out.println("[Visitor]");
		
		//Массив элементов
		Element[] list = new Element[3];
		//Забиваем массив разными элементами
		list[0] = new ElementA(11);
		list[1] = new ElementB(22);
		list[2] = new ElementB(33);
		
		//Объявляем посетителя
		Visitor visitor = new ConcreteVisitor();
		
		//Посещаем каждый объект
		//В случае сложного объекта можно использовать паттерн Итератор
		for(int i = 0; i < list.length; i++)
		{
			list[i].accept(visitor);
		}
		
		//После обхождения каждого элемента (в данном случае для каждого элемента используются разные методы обхода)
		System.out.println("Count: " + visitor.getCount()); //Элемент 1
		System.out.println("Summa: " + visitor.getSumm());	//Элементы 2 и 3
		System.out.println();
	}
}
