package BehavioralPatterns.Command;

public class Use {
	public Use()
	{
		System.out.println("[Command]");
		//Функциональность
		Reciever reciever = new Reciever();
		//Команды
		Command copy = new FirstConcreteCommand(reciever);
		Command paste = new SecondConcreteCommand(reciever);
		//Класс, использующий комманды
		Invoker invoker = new Invoker(copy, paste);
		//Производим действия
		invoker.doCopy();
		invoker.doPaste();
	}
}
