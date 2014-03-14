package CreationalPatterns.Singleton;

public class Use {

	public Use()
	{
		System.out.println("[Singleton]");
		
		//������
		Singleton singleton = Singleton.getInstance();
		singleton.setName("I'm a Singleton.");
		singleton.whoami();
		//��� �� ����� ������
		Singleton sameSingleton = Singleton.getInstance();
		sameSingleton.whoami();
		
		System.out.println();
	}
	
}
