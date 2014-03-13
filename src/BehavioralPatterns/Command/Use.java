package BehavioralPatterns.Command;

public class Use {
	public Use()
	{
		System.out.println("[Command]");
		//����������������
		Reciever reciever = new Reciever();
		//�������
		Command copy = new FirstConcreteCommand(reciever);
		Command paste = new SecondConcreteCommand(reciever);
		//�����, ������������ ��������
		Invoker invoker = new Invoker(copy, paste);
		//���������� ��������
		invoker.doCopy();
		invoker.doPaste();
	}
}
