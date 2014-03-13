package BehavioralPatterns.Iterator;

public class Use {

	public Use()
	{
		System.out.println("[Iterator]");
		//Контейнер
		Agregate agregate = new IntegerAgregate();
		//Добавление элементов в контейнер
		agregate.add(5);
		agregate.add(10);
		agregate.add(15);
		//Возвращаем нужный итератор
		Iterator iterator = agregate.createIterator();
		//Выводим элементы по очереди
		System.out.println("Выводы элементов:");
		for(; iterator.isDone(); iterator.next())
		{
			try{
				System.out.println(iterator.currentItem());
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
}
