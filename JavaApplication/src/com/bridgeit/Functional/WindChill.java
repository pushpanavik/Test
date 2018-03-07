/**
 * Purpose: To generate National Weather Report using given formulae
 * @author Pushpakumari_Navik
 * @version 1.0
 * @since 21-02-2018
 *
 */
package com.bridgeit.Functional;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
public class WindChill {
/*
 * it takes the temperature in fahrenheit and speed in miles from user and and prints the weather report
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Temperatrure(in fahrenheit:=");
		double t=scanner.nextInt();
		System.out.println("Enter the speed(in miles per hour:=");
		double v=scanner.nextInt();
		Utility utility=new Utility();
		int weather=utility.weathercast(t, v);
		
	}

}
