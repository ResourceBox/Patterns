package StructuralPatterns.Adapter;

public class Use {

	public Use()
	{
		System.out.println("[Adapter]");
		
		SourceInterface sourceInterface = new Adapter();
		
		//����� ���������� �������
		sourceInterface.firstMethod();
		sourceInterface.secondMethod();
		sourceInterface.thirdMethod();
		
		System.out.println();
	}
	
}
