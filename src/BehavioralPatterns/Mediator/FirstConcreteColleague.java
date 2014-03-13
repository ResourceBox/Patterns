package BehavioralPatterns.Mediator;

public class FirstConcreteColleague extends Colleague{

	protected Mediator mediator;
	
	public FirstConcreteColleague(Mediator mediator)
	{
		super(mediator);
	}

	@Override
	public void notify(String message) {
		// TODO Auto-generated method stub
		System.out.println("FirstConcreteColleague: " + message);
	}
}
