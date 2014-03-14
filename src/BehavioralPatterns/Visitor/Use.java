package BehavioralPatterns.Visitor;

public class Use {
	
	public Use()
	{
		System.out.println("[Visitor]");
		
		//������ ���������
		Element[] list = new Element[3];
		//�������� ������ ������� ����������
		list[0] = new ElementA(11);
		list[1] = new ElementB(22);
		list[2] = new ElementB(33);
		
		//��������� ����������
		Visitor visitor = new ConcreteVisitor();
		
		//�������� ������ ������
		//� ������ �������� ������� ����� ������������ ������� ��������
		for(int i = 0; i < list.length; i++)
		{
			list[i].accept(visitor);
		}
		
		//����� ���������� ������� �������� (� ������ ������ ��� ������� �������� ������������ ������ ������ ������)
		System.out.println("Count: " + visitor.getCount()); //������� 1
		System.out.println("Summa: " + visitor.getSumm());	//�������� 2 � 3
		System.out.println();
	}
}
