package com.bridgeit.Algorithm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class BinarySearchForWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Utility u=new Utility();
		Scanner scanner=new Scanner(System.in);
		
		
		
		String temp=null;//It is used to store temporary data.
		String file="/home/bridgeit/test/JavaApplication/src/com/bridegit/Utility/FileRead.txt";
		try{
			BufferedReader	br=new BufferedReader(new FileReader(file));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
			sb.append(line);
			sb.append(System.lineSeparator());
			line=br.readLine();
			}
			System.out.println(sb.toString());
		}
			catch(Exception e){
			
			}
		
		System.out.println("Enter the word you want to search");
		String word=scanner.next();
		for(int i=0;i<line.)
       

}
	}
