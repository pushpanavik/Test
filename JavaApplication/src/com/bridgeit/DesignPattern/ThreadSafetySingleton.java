package com.bridgeit.DesignPattern;

/**Purpose: This is implementation of Thread Safety Singleton class.
 * @author Pushpa Navik
 * @since 17/3/2018
 */
public class ThreadSafetySingleton {

	public static void main(String[] args) throws InterruptedException {

		//create a class processingThread
		ProcessingThread processingThread = new ProcessingThread();
		
		//creating a thread
		Thread t1 = new Thread(processingThread, "t1");
		t1.start();
		Thread t2 = new Thread(processingThread, "t2");
		t2.start();
		
		// wait for threads to finish processing
		t1.join();
		t2.join();
		System.out.println("Processing count=" + processingThread.getCount());
	}
}

//This class implements interface,has overridden method 'run'
class ProcessingThread implements Runnable {
	private int count;

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processSomething(i);
			count++;
		}
	}

	public int getCount() {
		return this.count;
	}

	private void processSomething(int i) {
		// processing some job
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}