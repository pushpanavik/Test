package com.bridgeit.Algorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortString  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
ArrayList <InsertionStringSorting> al=new ArrayList <InsertionStringSorting>();

	for(int i=0;i<3;i++) {
	al.add(new InsertionStringSorting(scanner.nextLine()));

	}
for(int i=0;i<al.size();i++)
{
	System.out.println(al.get(i).getName()+ " ");
}
System.out.println();

	Collections.sort(al);
	
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i).getName()+ " ");
	}
	scanner.close();
	}
}