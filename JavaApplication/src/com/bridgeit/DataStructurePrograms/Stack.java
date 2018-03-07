package com.bridgeit.DataStructurePrograms;

public class Stack {
	   private int maxSize;
		private int[] stackArray;
	    private int top=0;

	    //for size  
		public Stack(int s)
		{
		maxSize = s;
		stackArray = new int[maxSize];
		top = -1;
		}
	 
	    public void push(int j)
	    {
	        stackArray[++top]=j;
	        
	    }
	    public int pop()
	    {
	       
	           return stackArray[top--];
	          
	           
	       }
	    public boolean isFull()
		{
		return (top == maxSize - 1);
		}
	    public int size()
	    {
	        return top;
	    }
	    public int peek()
	    {
	        return stackArray[top];     
	                    }   

	    boolean isEmpty() {
	       return (top==-1);
	        
	    }
	   
}