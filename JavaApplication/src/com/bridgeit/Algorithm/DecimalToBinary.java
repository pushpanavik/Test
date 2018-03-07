package com.bridgeit.Algorithm;
import com.bridegit.Utility.*;
import java.util.Scanner;

import com.bridegit.Utility.Utility;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number\t ");
		int number=scanner.nextInt();
		Utility utility=new Utility();
		byte[] b = utility.binary(number);
		 utility.printArray(b);
		 
	}
}
