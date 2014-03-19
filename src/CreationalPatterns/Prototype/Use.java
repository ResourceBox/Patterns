package CreationalPatterns.Prototype;

public class Use {
	
	public Use()
	{
		System.out.println("[Prototype]");
		
		//Объект
		Prototype prototype = new Prototype(10, 20, 30);
		
		//Клонируем прототип
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
		
		//Используем прототипы для разных нужд
		//Первый
		firstPrototype.setOne(50);
		String first = String.format("[Первый прототип] One: %1$d Two: %2$d Three: %3$d", 
				firstPrototype.getOne(), firstPrototype.getTwo(), firstPrototype.getThree());
		System.out.println(first);
		
		//Второй
		secondPrototype.setTwo(100);
		String second = String.format("[Второй прототип] One: %1$d Two: %2$d Three: %3$d", 
				secondPrototype.getOne(), secondPrototype.getTwo(), secondPrototype.getThree());
		System.out.println(second);
		
		//Третий
		thirdPrototype.setThree(150);
		String third = String.format("[Третий прототип] One: %1$d Two: %2$d Three: %3$d", 
				thirdPrototype.getOne(), thirdPrototype.getTwo(), thirdPrototype.getThree());
		System.out.println(third);
		
		System.out.println();
	}
	
}
