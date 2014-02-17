package StructuralPatterns.Bridge;

public class FirstConcreteClass extends Abstraction{

	public FirstConcreteClass(Implementor implementor)
	{
		this.implementor = implementor;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("FirstConcreteClass");
		System.out.println(implementor.prefix() + implementor.body() + implementor.postfix());
		System.out.println();
	}
	
}
