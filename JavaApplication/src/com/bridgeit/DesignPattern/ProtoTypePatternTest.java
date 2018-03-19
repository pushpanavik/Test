package com.bridgeit.DesignPattern;

import java.util.List;

public class ProtoTypePatternTest {
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Employee emps=new Employee();
		emps.loadData();
		//Use the clone method to get the Employee object
		Employee emp1= (Employee) emps.clone();
		Employee emp2= (Employee) emps.clone();
		List<String>al=emp1.getEmployeeList();
		al.add("Pushpa");
		List<String>lis=emp2.getEmployeeList();
		al.remove("Ajay");
		System.out.println("Employee List"+emps.getEmployeeList());
		System.out.println("Employee emp1 List"+ al);
		System.out.println("Employee emp1 List"+ lis);
		
		
		
		
	}

}
