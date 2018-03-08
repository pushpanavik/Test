package com.bridgeit.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
//import java.util.List;
import java.util.Scanner;

public class UnorderedList {

	public static void main(String[] args) throws IOException,FileNotFoundException {
	FileInputStream file=new FileInputStream("/home/bridgeit/test/JavaApplication/src/com/bridegit/Utility/Files/Integer");
	DataInputStream dataInputStream=new DataInputStream(file);
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(dataInputStream));
	String stringline;
	int word=1;
	
	LinkedList list=new LinkedList();
	Iterator<String> itr=list.iterator();
	Scanner scanner= new Scanner(System.in);
	//boolean found=false;*/
	while((stringline=bufferedReader.readLine())!=null)
	{	
		System.out.println(stringline);
		for( int i=0;i<stringline.length();i++)
		{
			if(stringline.charAt(i)==' ')
			{	
				word++;
			}
		}
		//System.out.println("total words present=" +word);
				String []splitted=stringline.split(" ",word);
				for(String str:splitted) 
				{
					list.add(str);
					while(itr.hasNext()) 
					{
						System.out.print(itr.next());
					}
					System.out.println("\t");
		
				}
				System.out.println("enter the text you want to add :\t");
				String toadd=scanner.next(); 
				
				{
					if(toadd.equals(itr.next()))
					{
						list.remove();
						System.out.println("element removed at index is");
					}
				}
			
				
				
	
	}
	}
	
}
