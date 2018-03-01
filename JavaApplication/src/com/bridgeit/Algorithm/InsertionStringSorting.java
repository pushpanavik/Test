package com.bridgeit.Algorithm;
import java.util.Scanner;
import com.bridegit.Utility.Utility;

public class InsertionStringSorting {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Utility utility= new Utility();
		System.out.println("Enter the number of String in the array");
		int number=scanner.nextInt();
		String []str=new String[number];
		System.out.println("Enter unsorted array");
		for(int i=0;i<str.length;i++)
		{
			str[i]=scanner.nextLine();
		}
		utility.insertion_sortString(number, str);
		
	}
}
