package com.bridgeit.LearningStage;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ScheduledThreadPool {

	public static void main(String[] args) throws InterruptedException {
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		
		
		//schedule to run after sometime
		System.out.println("Current Time = "+new Date());
		for (int i = 0; i < 3; i++) {
			Thread.sleep(1000);
			Student worker = new Student("do heavy processing");
			scheduledThreadPool.scheduleWithFixedDelay(worker, 0, 1,
			TimeUnit.SECONDS);
		}
		
		//add some delay to let some threads spawn by scheduler
		Thread.sleep(3000);
		
		scheduledThreadPool.shutdown();
		while(!scheduledThreadPool.isTerminated()){
			//wait for all tasks to finish
		}
		System.out.println("Finished all threads");
	}

	public static void scheduleAtFixedRate(Student worker, int i, int j, TimeUnit seconds) {
		// TODO Auto-generated method stub
		
	}

}