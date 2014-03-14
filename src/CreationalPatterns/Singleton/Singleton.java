package CreationalPatterns.Singleton;

public class Singleton {

	private static Singleton singleton = null;
	private String singletonName;
	
	private Singleton()
	{
		
	}
	
	public void setName(String name)
	{
		singletonName = name;
	}
	
	public static Singleton getInstance()
	{
		if(singleton == null)
		{
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void whoami()
	{
		System.out.println(singletonName);
	}
}
