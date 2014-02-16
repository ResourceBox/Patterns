package CreationalPatterns.AbstractFactory;

public class Use {
	//������ ����������
	private final boolean flag = true;
	
	public Use()
	{
		System.out.println("[AbstractFactory]");
		//���������� ���������� � ��������
		AbstractComputer computer = null;
		AbstractPhone phone = null;
		//����� ����������
		if(flag)
		{
			//������ �������
			AbstractFactory firstFactory = new FirstConcreteFactory();
			computer = firstFactory.createComputer();
			phone = firstFactory.createPhone();
		}
		else
		{
			//������ �������
			AbstractFactory secondFactory = new SecondConcreteFactory();
			computer = secondFactory.createComputer();
			phone = secondFactory.createPhone();
		}
		//������ �� ����� �������
		//���������
		System.out.println("[Computer]");
		System.out.println("Name: " + computer.getName() + " Model: " + computer.getModel());
		//�������
		System.out.println("[Phone]");
		System.out.println("Name: " + phone.getName() + " Price: " + phone.getPrice());
		System.out.println();
	}
	
}
