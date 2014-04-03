package StructuralPatterns.Composite;

import java.util.ArrayList;

public class Composite implements Component {

	ArrayList<Component> componentList = null;
	
	public Composite()
	{
		componentList = new ArrayList<Component>();
	}
	
	@Override
	public void operation() {
		System.out.println("I'm Composite");
	}
	
	public void add(Component component)
	{
		componentList.add(component);
	}
	
	public void remove(Component component)
	{
		componentList.remove(component);
	}
	
	public ArrayList<Component> getChildren()
	{
		return componentList;
	}

}
