package BehavioralPatterns.Mediator;

public abstract class Colleague {

	protected Mediator mediator;
	
	//Сохраняем посредника
	public Colleague(Mediator mediator)
	{
		this.mediator = mediator;
	}
	
	public void send(String message)
	{
		mediator.send(message, this);
	}
	
	public abstract void notify(String message);
}
