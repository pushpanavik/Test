package com.bridgeit.DesignPattern;
/**Purpose: This is implementation of  Static singleton class.
 * @author Pushpa Navik
 * @since 17-03-20188
 *
 **/
public class StaticBlockSingleton {
	public static void main(String[] args)
	{
		System.out.println("Static Block Initialization:");
		System.out.println(instance);
		System.out.println(getInstance());
	}
	
		//create private static object
	    private static StaticBlockSingleton instance;
	    
	    //create static block
	    private StaticBlockSingleton(){}
	    
	    //static block initialization for exception handling
	    static{
	        try{
	            instance = new StaticBlockSingleton();
	        }catch(Exception e){
	            throw new RuntimeException("Exception occured in creating singleton instance");
	        }
	    }
	    
		//public static method returns the instance of class
	    public static StaticBlockSingleton getInstance(){
	        return instance;
	    }
}