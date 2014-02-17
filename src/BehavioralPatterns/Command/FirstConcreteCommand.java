package BehavioralPatterns.Command;

public class FirstConcreteCommand implements Command {

	private Reciever reciever = null;
	
	public FirstConcreteCommand(Reciever reciever)
	{
		this.reciever = reciever;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		reciever.copy();
	}

}
