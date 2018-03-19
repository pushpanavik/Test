package com.bridgeit.DesignPattern;
/**Purpose: This is implementation of Thread Safety Singleton class.
 * @author Pushpa Navik
 * @since 17/3/2018
 */
public class EagerInitializedSingleton {
	
	//Only one object of the class is created
	//it always gets created whether you need or not
	public static void main(String[] args){
		System.out.println("EagerInitializedSingleton"+"\n"+getInstance());
		System.out.println(instance);
		System.out.println(getInstance());
	}

	// creating private static variable of same class
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private EagerInitializedSingleton() {
	}

	//public static method returns the instance of class
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
}