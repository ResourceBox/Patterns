package CreationalPatterns.AbstractFactory;

public class SecondConcreteFactory implements AbstractFactory{

	@Override
	public AbstractComputer createComputer() {
		// TODO Auto-generated method stub
		return new SecondComputer();
	}

	@Override
	public AbstractPhone createPhone() {
		// TODO Auto-generated method stub
		return new SecondPhone();
	}

}
