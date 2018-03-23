package com.bridgeit.LearningStage;

public class Display {

	public synchronized void wish(String name)throws InterruptedException
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Good morning");
			Thread.sleep(1000);
			System.out.println(name);
		}
		
	}
	public synchronized void wish2(String name)throws InterruptedException
	{
		for(int i=5;i>0;i--)
	{
			
		System.out.println("second ");
		Thread.sleep(1000);
		System.out.println(i);
	}
		
	}
}
