package BehavioralPatterns.ChainOfResponsibility;

public class SecondConcreteHandler implements Handler {

	private Handler parentHandler;
	
	public SecondConcreteHandler(Handler parentHandler)
	{
		this.parentHandler = parentHandler;
	}
	
	@Override
	public void handleIt(int number) {
		if(number == 2)
			System.out.println("That request has processed by second handler.");
		else
			sendNext(number);
	}

	private void sendNext(int number) {
		parentHandler.handleIt(number);
	}

}
