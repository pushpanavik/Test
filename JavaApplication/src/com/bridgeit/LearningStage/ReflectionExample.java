package com.bridgeit.LearningStage;
import java.lang.reflect.Modifier;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class c=Class.forName("com.bridgeit.LearningStage.Student");
		System.out.println("Class Name"+c.getName());
		
		int i= c.getModifiers();
		System.out.println("Access Modifier"+Modifier.toString(i));
		System.out.println("Super Class"+c.getSuperclass().getName());
		Class [] cl=c.getInterfaces();
		for(Class cm:cl)
		{
			System.out.println(cm.getName());
		}
		System.out.println();
	}

}
