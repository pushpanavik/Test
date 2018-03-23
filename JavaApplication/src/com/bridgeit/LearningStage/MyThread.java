package com.bridgeit.LearningStage;

public class MyThread extends Thread {
/*DisplayExample d;
	public MyThread(DisplayExample d) {
		// TODO Auto-generated constructor stub
		this.d=d;
	}*/int total=0;
	public void run()
	{/*
		try {
			d.displayn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i=1;i<=5;i++)
		{
			synchronized(this)
			{
			total=total+i;
			System.out.println("child class starts calculation");
			this.notify();
			System.out.println("child class gies notification");
			}
		}
	}
}
