package BehavioralPatterns.Iterator;

public class IntegerIterator implements Iterator {

	private int position = 0;
	private Agregate agregate;
	
	public IntegerIterator(Agregate agregate)
	{
		this.agregate = agregate;
	}
	
	@Override
	public void first() {
		position = 0;
	}

	@Override
	public void next() {
		
		position++;
	}

	@Override
	public boolean isDone() {
		if(position >= agregate.count())
			return false;
		else
			return true;
	}

	@Override
	public int currentItem() throws Exception {
		// TODO Auto-generated method stub
		if(isDone())
			return agregate.get(position);
		else
			throw new Exception("Нарушен диапазон."); 
	}
}
