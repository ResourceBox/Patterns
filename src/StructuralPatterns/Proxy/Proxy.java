package StructuralPatterns.Proxy;

public class Proxy implements Subject {

	private Subject subject = null;
	
	public Proxy()
	{
		//На момент создания объекта мы не выделяем память зарание
		//Вместо этого, мы создаем объект в момент его реального использования
	}
	
	@Override
	public int firstMethod(int a, int b) {
		if(subject == null)
			subject = new ConcreteSubject();
		return subject.firstMethod(a, b);
	}

	@Override
	public int secondMethod(int a) {
		if(subject == null)
			subject = new ConcreteSubject();
		return subject.secondMethod(a);
	}

	@Override
	public int thirdMethod(int a, int b, int c) {
		if(subject == null)
			subject = new ConcreteSubject();
		return subject.thirdMethod(a, b, c);
	}

}
