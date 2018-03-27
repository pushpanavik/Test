package com.bridgeit.LearningStage;

public class StringExample {

	public static void main(String args[])throws Exception
	{
		String s="pushpa";
		s.concat("navik");
		StringBuilder sb=new StringBuilder();
		
		System.out.println("By using normal String class" +s);
		System.out.println("By using StringBuilder " +sb.append("navik"));
		String s1="sarika";
		String s2="sarika";
		System.out.println("" +s1.equals(s2) );
		System.out.println("" +s1==s2);
		StringBuilder str1=new StringBuilder("pushpa");
		StringBuilder str2=new StringBuilder("pushpa");
		System.out.println(str1.equals(str2) );
		System.out.println(str1==str2);
		StringBuffer sbb =new StringBuffer();
		sbb.append("abcdsefdfhgjkshgf");
		sbb.append("q");
		System.out.println(sbb.capacity());
		sbb.ensureCapacity(34);
		System.out.println(sbb.capacity());
		
		
		Boolean b=new Boolean("Mon");
		Boolean b1=new Boolean("ton");
		System.out.println(b.equals(b1));
		}
}
