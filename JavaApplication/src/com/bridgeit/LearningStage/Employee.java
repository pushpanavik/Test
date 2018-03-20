package com.bridgeit.LearningStage;
public class Employee extends Person {
	
	
	
	public Employee(long nm, long gen) {
		super(nm, gen);
		
	}

	@Override
	public void work() {
		long area=length*breadth;
			
			System.out.println("Area of rectangle is"+area);
		}
	
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new Employee(10,5);
		Person employee = new Employee(20,5);
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
		//employee.changeName("Pankaj Kumar");
		System.out.println(employee.toString());
		System.out.println(student.toString());
	}

}