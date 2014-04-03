package StructuralPatterns.Composite;

public class Leaf implements Component {

	@Override
	public void operation() {
		System.out.println("I'm leaf.");		
	}
	
}
