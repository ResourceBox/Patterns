package CreationalPatterns.Builder;

public class Use {

	public Use()
	{
		System.out.println("[Builder]");
		
		//���������
		Builder builder = new ConcreteBuilder();
		
		//��������
		Director director = new ConcreteDirector();
		//��� ������ ��������� ���������� ������ ����� ��������� ������
		director.setBuilder(builder);
		director.buildProduct();
		
		//������� �������
		
		Product product = director.getProduct();
		
		System.out.println("Name: " + product.getName());
		System.out.println("Cost: " + product.getCost());
 		System.out.println("Weight: " + product.getWeight());
 		
 		System.out.println();
	}
	
}
