package com.bridgeit.DesignPattern;
/**
*
* @author PUSHPA
*/
import java.util.ArrayList;
import java.util.List;
public class Employee implements Cloneable{

	private List<String> empList;
	
	public Employee(){
		empList = new ArrayList<String>();
	}
	
	public Employee(List<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Ajay");
		empList.add("Vijay");
		empList.add("Sonia");
		empList.add("Archana");
	}
	
	public List<String> getEmployeeList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
			List<String> temp = new ArrayList<String>();
			for(String s : this.getEmployeeList()){
				temp.add(s);
			}
			return new Employee(temp);
	}
	
}  
