package BehavioralPatterns.Mediator;

public class Use {

	public Use()
	{
		System.out.println("[Mediator]");
		//���������� ���������� � ��������
		Mediator mediator = new ConcreteMediator();
		Colleague firstConcreteColleague = new FirstConcreteColleague(mediator);
		Colleague secondConcreteColleague = new SecondConcreteColleague(mediator);
		
		//��������� ������ � ����������
		mediator.addColleague(firstConcreteColleague);
		mediator.addColleague(secondConcreteColleague);
		
		//�������� ���� ��������� � ����� �������� � �������� �� ���� �����
		firstConcreteColleague.send("One");
		firstConcreteColleague.send("Two");
		firstConcreteColleague.send("Three");
		secondConcreteColleague.send("Four");
		secondConcreteColleague.send("Five");
		secondConcreteColleague.send("Six");
		
		//��������� ������������ ������ ������
		System.out.println("����� ���� ��������: " + mediator.getCountRequest());
		System.out.println();
	}
	
}

