package BehavioralPatterns.Mediator;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator {

	private ArrayList<Colleague> colleagueList = new ArrayList<Colleague>();
	private int countRequests = 0;
	
	public ConcreteMediator()
	{
		
	}
	
	//Добавляем и удаляем список коллег
	public void addColleague(Colleague colleague)
	{
		colleagueList.add(colleague);
	}
	
	public void removeColleague(Colleague colleague)
	{
		colleagueList.remove(colleague);
	}
	
	public int getCountRequest()
	{
		return countRequests;
	}
	
	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		for(int i = 0; i < colleagueList.size(); i++)
		{
			if(colleague.equals(colleagueList.get(i)))
			{
				countRequests++;
				colleague.notify(message);
			}
		}
	}

}
