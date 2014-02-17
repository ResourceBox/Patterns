package BehavioralPatterns.Command;

public class SecondConcreteCommand implements Command {

	private Reciever reciever = null;
	
	public SecondConcreteCommand(Reciever reciever)
	{
		this.reciever = reciever;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		reciever.paste();
	}

}
