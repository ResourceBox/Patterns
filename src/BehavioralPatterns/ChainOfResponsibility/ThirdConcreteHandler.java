package BehavioralPatterns.ChainOfResponsibility;

public class ThirdConcreteHandler implements Handler {

	public ThirdConcreteHandler()
	{

	}
	
	@Override
	public void handleIt(int number) {
		System.out.println("That request has processed by third handler.");
	}	
}
