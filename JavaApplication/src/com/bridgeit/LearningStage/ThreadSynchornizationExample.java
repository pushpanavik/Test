package com.bridgeit.LearningStage;

public class ThreadSynchornizationExample extends Thread{
Display d;
String name;

           ThreadSynchornizationExample(Display d, String name) {
	super();
	this.name = name;
	this.d = d;
}
public void run()
{
	try {
	 d.wish(name);
	 d.wish2(name);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public static void main(String args[])
{
	Display d1=new Display();
	Display d2=new Display();
	ThreadSynchornizationExample t1=new ThreadSynchornizationExample(d1,"pushpa");
	ThreadSynchornizationExample t2=new ThreadSynchornizationExample(d2,"nisha");
	t1.start();
	t2.start();
}
}