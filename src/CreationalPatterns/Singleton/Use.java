package CreationalPatterns.Singleton;

public class Use {

	public Use()
	{
		System.out.println("[Singleton]");
		
		//Объект
		Singleton singleton = Singleton.getInstance();
		singleton.setName("I'm a Singleton.");
		singleton.whoami();
		//Тот же самый объект
		Singleton sameSingleton = Singleton.getInstance();
		sameSingleton.whoami();
	}
	
}
