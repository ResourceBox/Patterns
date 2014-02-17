package BehavioralPatterns.Command;

public class Invoker {
	private Command copy;
	private Command paste;
	
	public Invoker(Command copy, Command paste)
	{
		this.copy = copy;
		this.paste = paste;
	}
	
	public void doCopy()
	{
		copy.execute();
	}
	
	public void doPaste()
	{
		paste.execute();
	}
}
