package com.bridgeit.LearningStage;

public class MyThread2 extends Thread {
	
		DisplayExample d;
			public MyThread2(DisplayExample d) {
				// TODO Auto-generated constructor stub
				this.d=d;
			}
			public void run()
			{
				try {
					d.displayc();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
