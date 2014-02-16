package CreationalPatterns.AbstractFactory;

public class Use {
	//Меняем реализацию
	private final boolean flag = true;
	
	public Use()
	{
		System.out.println("[AbstractFactory]");
		//Интерфейсы компьютера и телефона
		AbstractComputer computer = null;
		AbstractPhone phone = null;
		//Выбор реализации
		if(flag)
		{
			//Первая фабрика
			AbstractFactory firstFactory = new FirstConcreteFactory();
			computer = firstFactory.createComputer();
			phone = firstFactory.createPhone();
		}
		else
		{
			//Вторая фабрика
			AbstractFactory secondFactory = new SecondConcreteFactory();
			computer = secondFactory.createComputer();
			phone = secondFactory.createPhone();
		}
		//Дальше не видно разницы
		//Компьютер
		System.out.println("[Computer]");
		System.out.println("Name: " + computer.getName() + " Model: " + computer.getModel());
		//Телефон
		System.out.println("[Phone]");
		System.out.println("Name: " + phone.getName() + " Price: " + phone.getPrice());
		System.out.println();
	}
	
}
