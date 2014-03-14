package CreationalPatterns.FactoryMethod;

public class Use {

	public Use()
	{
		System.out.println("[FactoryMethod]");
		
		//���������� ���������
		Creator creator = new ConcreteCreator();
		//�������� ���������� ��������� 
		Product product;
		//������ ������
		product = creator.factoryMethod(1);
		System.out.println(product.model()); 
		//������ ������
		product = creator.factoryMethod(2);
		System.out.println(product.model()); 
		//� �������� �� ����� �������
		
		System.out.println();
	}
}

