package com.bridgeit.LearningStage;

import java.lang.reflect.Method;

public class Practice {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int count=0;
		Class c=Class.forName("java.lang.Object");
		System.out.println("getting different classes in lang package");
		Class [] m1=c.getClasses();
		Method [] m=c.getDeclaredMethods();
		for(Method val: m)
		{
			count++;
			System.out.println(val.getName());
			
		}
		for(Class value: m1)
		{
			System.out.println(value.getName());
		}
		System.out.println("count\t" +count);
	}	
	}


