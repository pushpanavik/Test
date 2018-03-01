package com.bridgeit.Algorithm;
public  class InsertionStringSorting implements Comparable <InsertionStringSorting> 
{
	public String name;

	public String getName() 
	{
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}	
	
	public InsertionStringSorting(String str) {
		// TODO Auto-generated constructor stub
	}
	
public int compareTo(InsertionStringSorting obj)
{
int compareInt=	this.name.compareTo(obj.name);
if((compareInt)<0)
	return -1;
if((compareInt)>0)
	return 1;
else
	return 0;
	
}
}
