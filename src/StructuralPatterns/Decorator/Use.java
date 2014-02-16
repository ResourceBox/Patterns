package StructuralPatterns.Decorator;

public class Use {
	public Use()
	{
		//������� Decorator
		//��� �������� ������ �� ���������� Component
		FirstComponent firstComponent = new FirstComponent();
		SecondComponent secondComponent = new SecondComponent();
		//���������� �����������
		Decorator firstDecorator1 = new FirstDecorator(new SecondDecorator(firstComponent));
		Decorator firstDecorator2 = new FirstDecorator(new SecondDecorator(secondComponent));
		//�������� ��������� ������
		System.out.println(firstDecorator1.method()); 
		System.out.println(firstDecorator2.method()); 
	}
}
