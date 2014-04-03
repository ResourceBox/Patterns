package MainPackage;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[Порождающие паттерны]
		
		//Singleton
		CreationalPatterns.Singleton.Use singleton = new CreationalPatterns.Singleton.Use();
		//FactoryMethod
		CreationalPatterns.FactoryMethod.Use factoryMethod = new CreationalPatterns.FactoryMethod.Use();
		//Builder
		CreationalPatterns.Builder.Use builder = new CreationalPatterns.Builder.Use();
		//Prototype
		CreationalPatterns.Prototype.Use prototype = new CreationalPatterns.Prototype.Use();
		//AbstractFactory
		CreationalPatterns.AbstractFactory.Use abstractFactory = new CreationalPatterns.AbstractFactory.Use();
				
		//[Структурные паттерны]
		
		//[Поведенческие паттерны]
		
		//Decorator
		StructuralPatterns.Decorator.Use decorator = new StructuralPatterns.Decorator.Use();
		//Bridge
		StructuralPatterns.Bridge.Use bridge = new StructuralPatterns.Bridge.Use();
		//Command
		BehavioralPatterns.Command.Use command = new BehavioralPatterns.Command.Use();
		//Mediator
		BehavioralPatterns.Mediator.Use mediator = new BehavioralPatterns.Mediator.Use();
		//Iterator
		BehavioralPatterns.Iterator.Use iterator = new BehavioralPatterns.Iterator.Use();
		//Visitor
		BehavioralPatterns.Visitor.Use visitor = new BehavioralPatterns.Visitor.Use();
		//Chain of responsibility
		BehavioralPatterns.ChainOfResponsibility.Use chainOfResponsibility = new BehavioralPatterns.ChainOfResponsibility.Use();
		//Proxy
		StructuralPatterns.Proxy.Use proxy = new StructuralPatterns.Proxy.Use();
		//Composite
		StructuralPatterns.Composite.Use composite = new StructuralPatterns.Composite.Use();
		//Adapter
		StructuralPatterns.Adapter.Use adapter = new StructuralPatterns.Adapter.Use();
		
	}

}
