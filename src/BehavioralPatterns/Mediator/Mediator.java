package BehavioralPatterns.Mediator;

public interface Mediator {

	public void send(String message, Colleague colleague);
	public int getCountRequest();
	public void addColleague(Colleague colleague);
	public void removeColleague(Colleague colleague);
}
