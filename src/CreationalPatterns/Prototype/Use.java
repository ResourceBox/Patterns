package CreationalPatterns.Prototype;

public class Use {
	
	public Use()
	{
		System.out.println("[Prototype]");
		
		//������
		Prototype prototype = new Prototype(10, 20, 30);
		
		//��������� ��������
		Prototype firstPrototype = null;
		Prototype secondPrototype = null;
		Prototype thirdPrototype = null;
		
		try{
			firstPrototype = prototype.clone();
			secondPrototype = prototype.clone();
			thirdPrototype = prototype.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		//���������� ��������� ��� ������ ����
		//������
		firstPrototype.setOne(50);
		String first = String.format("[������ ��������] One: %1$d Two: %2$d Three: %3$d", 
				firstPrototype.getOne(), firstPrototype.getTwo(), firstPrototype.getThree());
		System.out.println(first);
		
		//������
		secondPrototype.setTwo(100);
		String second = String.format("[������ ��������] One: %1$d Two: %2$d Three: %3$d", 
				secondPrototype.getOne(), secondPrototype.getTwo(), secondPrototype.getThree());
		System.out.println(second);
		
		//������
		thirdPrototype.setThree(150);
		String third = String.format("[������ ��������] One: %1$d Two: %2$d Three: %3$d", 
				thirdPrototype.getOne(), thirdPrototype.getTwo(), thirdPrototype.getThree());
		System.out.println(third);
		
		System.out.println();
	}
	
}
