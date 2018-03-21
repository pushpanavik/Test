package com.bridgeit.LearningStage;

public class pusdhffd  extends Thread{
	static  Thread am;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child class");
			try {
				am.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//System.out.println("I got interrupted");
			}
		}
	}
	public static void main(String args[]) throws InterruptedException
	{
		pusdhffd.am=Thread.currentThread();
		pusdhffd thread=new pusdhffd();
		
		thread.start();
		for(int i=10;i>0;i--)
		{
			System.out.println("main");
			thread.sleep(1000);
		}
		//thread.currentThread().join();
		
		
	}

}
