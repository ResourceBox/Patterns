package BehavioralPatterns.Iterator;

import java.util.ArrayList;

public class IntegerAgregate implements Agregate {

	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	@Override
	public Iterator createIterator() {
		return new IntegerIterator(this);
	}

	@Override
	public int count() {
		return list.size();
	}

	@Override
	public int get(int i) {
		return list.get(i);
	}

	@Override
	public void add(int number) {
		list.add(number);		
	}

	@Override
	public void remove(int number) {
		list.remove(new Integer(number));
	}

	@Override
	public void removeAt(int index) {
		list.remove(index);
	}
}
