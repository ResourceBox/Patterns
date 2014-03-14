package BehavioralPatterns.ChainOfResponsibility;

public class FirstConcreteHandler implements Handler {

	private Handler parentHandler;
	
	public FirstConcreteHandler(Handler parentHandler)
	{
		this.parentHandler = parentHandler;
	}
	
	@Override
	public void handleIt(int number) {
		if(number == 3)
			System.out.println("That request has processed by first handler.");
		else
			sendNext(number);
	}

	private void sendNext(int number) {
		parentHandler.handleIt(number);
	}
}
