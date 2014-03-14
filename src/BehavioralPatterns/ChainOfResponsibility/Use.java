package BehavioralPatterns.ChainOfResponsibility;

public class Use {

	public Use()
	{
		System.out.println("[ChainOfReponsibility]");
		
		//������� ��� ������� ������������
		//������� ����������
		Handler thirdHandler = new ThirdConcreteHandler();
		//������� ����������
		Handler secondHandler = new SecondConcreteHandler(thirdHandler);
		//������� ����������
		Handler firstHandler = new FirstConcreteHandler(secondHandler);
		
		//�������� �������� ������� ������ �������� �����������
		firstHandler.handleIt(1);
		firstHandler.handleIt(2);
		firstHandler.handleIt(3);
		
		System.out.println();
	}
}
