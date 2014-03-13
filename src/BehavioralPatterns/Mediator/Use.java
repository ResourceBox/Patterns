package BehavioralPatterns.Mediator;

public class Use {

	public Use()
	{
		System.out.println("[Mediator]");
		//Интерфейсы компьютера и телефона
		Mediator mediator = new ConcreteMediator();
		Colleague firstConcreteColleague = new FirstConcreteColleague(mediator);
		Colleague secondConcreteColleague = new SecondConcreteColleague(mediator);
		
		//Добавляем коллег к посреднику
		mediator.addColleague(firstConcreteColleague);
		mediator.addColleague(secondConcreteColleague);
		
		//Посылают свои сообщения в общий источник и получают от него ответ
		firstConcreteColleague.send("One");
		firstConcreteColleague.send("Two");
		firstConcreteColleague.send("Three");
		secondConcreteColleague.send("Four");
		secondConcreteColleague.send("Five");
		secondConcreteColleague.send("Six");
		
		//Посредник обрабатывает каждый запрос
		System.out.println("Всего было запросов: " + mediator.getCountRequest());
		System.out.println();
	}
	
}

