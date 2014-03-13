package BehavioralPatterns.Mediator;

public class SecondConcreteColleague extends Colleague {
	protected Mediator mediator;
	
	public SecondConcreteColleague(Mediator mediator)
	{
		super(mediator);
	}

	@Override
	public void notify(String message) {
		// TODO Auto-generated method stub
		System.out.println("SecondConcreteColleague: " + message);
	}
}
