package BehavioralPatterns.Iterator;

public class Use {

	public Use()
	{
		System.out.println("[Iterator]");
		//���������
		Agregate agregate = new IntegerAgregate();
		//���������� ��������� � ���������
		agregate.add(5);
		agregate.add(10);
		agregate.add(15);
		//���������� ������ ��������
		Iterator iterator = agregate.createIterator();
		//������� �������� �� �������
		System.out.println("������ ���������:");
		for(; iterator.isDone(); iterator.next())
		{
			try{
				System.out.println(iterator.currentItem());
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
}
