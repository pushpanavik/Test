package com.bridgeit.LearningStage;
import java.lang.String;

	public class Student{
		
		private String name;
		private int id;
		
		public Student() {
		}
		public Student(String name, int id) {
			super();
			this.name = name;
			this.id = id;
		}
		public boolean equals(Object obj)
		{
			try {
				
			String name=this.name;
			int id=this.id;
			Student object=(Student) obj;
			String name2=this.name;
			
			int id1=this.id;
			if(name.equals(name2) &&id==id1)
			{
				return true;
			}
			else
			{
				return false;
			}
			}
			catch(ClassCastException e)
			{
				return false;
			}
			catch(NullPointerException nu)
			{
				return false;
			}
		}
		public String toString()
		{
			return "Name:="+this.name+ "Id="+this.id+ "";
		}
		
		
	}
		 
	


