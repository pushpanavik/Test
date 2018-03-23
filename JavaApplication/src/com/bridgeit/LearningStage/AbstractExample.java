package com.bridgeit.LearningStage;

abstract class Flower {
	int length;
	int breadth;
	
public Flower(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

abstract  void run();

}
public class AbstractExample extends Flower
{
public AbstractExample(int length, int breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
void run()
{
	 int calculate=length*breadth;
	 System.out.println("calculate" + calculate);
}
public static void main(String args[])
{
	
	Flower f=new AbstractExample(10,5);
	f.run();
}
}
