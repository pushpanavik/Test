/***************************************************************************************
 * Purpose:To prints the Euclidean distance from the point (x, y) to the origin (0, 0). .
 
 *@author  Pushpakumari_Navik
 *@version 1.0
 *@since   21-02-2018
****************************************************************************************/
package com.bridgeit.Functional;
import java.util.Scanner;
import com.bridegit.Utility.Utility;
/*the main function is to calculate the euclidean distance from point (x,y) to origin (0,0).  */
public class Distance {
	public static void main(String args[])
	{
		int mx,my;  /*taking x and y as the first coordinate point and  x1 and y1 as the second coordinate  */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the x coordinate point"); 
		mx=scanner.nextInt();

		System.out.println("Enter the y coordinate point");
		my=scanner.nextInt();


		Utility utility=new Utility();	/* calling utility class */
		utility.distance(mx, my);


	}
}
