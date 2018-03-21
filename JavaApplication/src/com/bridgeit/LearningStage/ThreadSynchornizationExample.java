package com.bridgeit.LearningStage;

public class ThreadSynchornizationExample  extends Thread{

	public  void wish(String name)
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good morning");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	public static void main(String args[]) throws InterruptedException
	{
		ThreadSynchornizationExample t=new ThreadSynchornizationExample();
		t.wish("pushpa");
		
	}
}
