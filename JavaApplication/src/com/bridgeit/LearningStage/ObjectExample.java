package com.bridgeit.LearningStage;

public class ObjectExample {

	public static void main(String args[])
	{
		Student s1=new Student("pushpa",11);
		Student s2=new Student("komal",12);
		Student s3=new Student("pushpa",11);
	System.out.println(s1.equals(s2));
	
	System.out.println(s1.equals(s3));
	
	System.out.println(s2.equals(s3));
	Student s4=s1;
	System.out.println(s1.equals(s4));
	System.out.println(s1.equals("ajay"));
	System.out.println(s1.equals("null"));
	
	}
}
