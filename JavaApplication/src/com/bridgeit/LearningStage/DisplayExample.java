package com.bridgeit.LearningStage;

public class DisplayExample {
	
	
	public   void displayn() throws InterruptedException
	{
		;;;;;;;;//thouand lines of code
	
		synchronized(DisplayExample.class) {	
		
		for(int i=0;i<5;i++)
		{
			System.out.println("one");
			Thread.sleep(1000);
		}
		}
	}

	public   void displayc() throws InterruptedException
	{
		;;;;;;//lines of code
	
		for(int i=65;i<=70;i++)
		{
			System.out.print((char) i);
			Thread.sleep(2000);
		}
		
	}
}

