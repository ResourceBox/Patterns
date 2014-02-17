package StructuralPatterns.Bridge;

public class SecondConcreteClass extends Abstraction{

	public SecondConcreteClass(Implementor implementor)
	{
		this.implementor = implementor;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("SecondConcreteClass");
		System.out.println(implementor.prefix() + implementor.body() + implementor.postfix());
		System.out.println();
	}

}
