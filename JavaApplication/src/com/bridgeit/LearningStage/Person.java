package com.bridgeit.LearningStage;
public abstract class Person {
	
	protected long length;
	protected long breadth;
	
	public Person(Long nm, Long gen){
		this.length=nm;
		this.breadth=gen;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Length="+this.length+"::Breadth="+this.breadth;
	}

	/*public void changeName(String newName) {
		this.name = newName;
	}*/	
}
