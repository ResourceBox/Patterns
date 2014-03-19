package CreationalPatterns.Prototype;

public class Prototype implements Cloneable {

	private int one;
	private int two;
	private int three;
	
	public Prototype(int one, int two, int three)
	{
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	public Prototype()
	{
		one = 1;
		two = 2;
		three = 3;
	}
	
	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	@Override
	public Prototype clone() throws CloneNotSupportedException
	{
		Prototype prototype = new Prototype();
		prototype.one = this.one;
		prototype.two = this.two;
		prototype.three = this.three;
		return prototype;
	}
	
}
