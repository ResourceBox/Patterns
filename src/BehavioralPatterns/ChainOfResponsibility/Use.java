package BehavioralPatterns.ChainOfResponsibility;

public class Use {

	public Use()
	{
		System.out.println("[ChainOfReponsibility]");
		
		//Создаем всю цепочку обработчиков
		//Главный обработчик
		Handler thirdHandler = new ThirdConcreteHandler();
		//Средний обработчик
		Handler secondHandler = new SecondConcreteHandler(thirdHandler);
		//Младший обработчик
		Handler firstHandler = new FirstConcreteHandler(secondHandler);
		
		//Начинаем высылать запросы самому младшему обработчику
		firstHandler.handleIt(1);
		firstHandler.handleIt(2);
		firstHandler.handleIt(3);
		
		System.out.println();
	}
}
