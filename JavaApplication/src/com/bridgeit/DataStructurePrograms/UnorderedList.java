package com.bridgeit.DataStructurePrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.List;
import java.util.Scanner;

public class UnorderedList {

	public static void main(String[] args) throws IOException {
	FileInputStream file=new FileInputStream("/home/bridgeit/test/JavaApplication/src/com/bridgeit/DataStructurePrograms/file.txt");
	DataInputStream dataInputStream=new DataInputStream(file);
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(dataInputStream));
	String stringline;
	int word=1;
	
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
		}System.out.println("total words present=" +word);
				String []splitted=stringline.split(" ",word);
				for( String str:splitted) 
		{
			System.out.println(str);
		}
				
	System.out.println("enter the text you want to search:\t");
	String searchString=scanner.next();
	for( String str:splitted) 
	{
		if(searchString==str)
		{
			
		}
	}
		
	}
	}
}
