package com.bridgeit.LearningStage;

public class ThreadExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println("child");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
public static void main(String args[]) throws InterruptedException
{
	
	ThreadExample t=new ThreadExample();
	Thread thread=new Thread(t);
	Thread threadcopy=new Thread(thread);
	thread.start();
	//threadcopy.start();
	//thread.setPriority(2);
	for(int i =0;i<9;i++)
	{
		System.out.println("main");
		//thread.yield();
		thread.join(2000);
	}
	
	
}
}