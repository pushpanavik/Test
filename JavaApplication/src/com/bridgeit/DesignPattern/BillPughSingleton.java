package com.bridgeit.DesignPattern;

/**Purpose: This is implementation of Bill Pugh singleton class.
 * @author Pushpa Navik
 * @since 17/03/2018
 */
public class BillPughSingleton {

	public static void main(String[] args) {
		System.out.println(getInstance());
		System.out.println(getInstance());

		//System.out.println(INSTANCE);
	}

	// constructor
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	//public static class
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}