package StructuralPatterns.Bridge;

public class Use {
	public Use()
	{
		System.out.println("[Bridge]");
		//������� Bridge
		//�������� ���� ����������� � ������� ������������
		Abstraction firstAbstraction = new FirstConcreteClass(new FirstConcreteImplementor());
		Abstraction secondAbstraction = new SecondConcreteClass(new SecondConcreteImplementor());
		//����� ������������ ������� � ������� ������������
		firstAbstraction.operation();
		secondAbstraction.operation();
		
	}
}
