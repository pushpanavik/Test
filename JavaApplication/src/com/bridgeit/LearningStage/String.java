package com.bridgeit.LearningStage;

public class String {

	public static void main(String args[])throws Exception
	{
		java.lang.String s="pushpa";
		
		StringBuilder sb=new StringBuilder();
		
		System.out.println("By using normal String class" +s.concat("navik"));
		System.out.println("By using StringBuilder " +sb.append("navik"));
		
		
		}
}
