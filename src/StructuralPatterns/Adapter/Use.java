package StructuralPatterns.Adapter;

public class Use {

	public Use()
	{
		System.out.println("[Adapter]");
		
		SourceInterface sourceInterface = new Adapter();
		
		//ֲûחמג אהאןעטגםûץ לועמהמג
		sourceInterface.firstMethod();
		sourceInterface.secondMethod();
		sourceInterface.thirdMethod();
		
		System.out.println();
	}
	
}
