package StructuralPatterns.Composite;

public class Use {

	public Use()
	{
		System.out.println("[Composite]");
		
		Leaf firstLeaf = new Leaf();
		Leaf secondLeaf = new Leaf();
		Leaf thirdLeaf = new Leaf();
		
		Composite firstComposite = new Composite();
		Composite secondComposite = new Composite();
		Composite thirdComposite = new Composite();
		
		//Состовляем дерево
		firstComposite.add(firstLeaf);
		firstComposite.add(secondComposite);
		
		secondComposite.add(thirdComposite);
		
		thirdComposite.add(secondLeaf);
		thirdComposite.add(thirdLeaf);
		
		System.out.println("Дерево готово!");
		
		System.out.println();
	}
	
}
