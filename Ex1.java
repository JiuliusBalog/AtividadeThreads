package controller;

public class Ex1 extends Thread
{
	public Ex1()
	{
		super();
	}
	public void run()
	{
		int tid = (int) getId();
		System.out.println(tid);
	}
}