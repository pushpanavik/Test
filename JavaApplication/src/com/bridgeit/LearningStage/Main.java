package com.bridgeit.LearningStage;

public class Main  {
public static void main(String args[]) throws InterruptedException
{
	DisplayExample d=new DisplayExample();
	
	MyThread t=new MyThread();
	t.start();

	synchronized(t) {
		System.out.println("going in waiting state");
		t.wait();
		System.out.println("got notification from child class");
	System.out.println(t.total);
	
	}	
}
}
