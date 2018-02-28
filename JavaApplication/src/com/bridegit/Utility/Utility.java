package com.bridegit.Utility;

import java.io.PrintWriter;
//Username 
import java.util.Arrays;
import java.util.Scanner;

public class Utility {
public String regex(String msg,String regex)
{
	String replace=	msg.replaceAll(msg,regex);
		System.out.println("Hello\t" +replace +" "+",How are you?");
		return replace;
}
	public boolean leap(int year) {
		if (year % 400 == 0 && year % 4 == 0) {

			return true;
		} else {
			return false;
		}
	
	}
	//flipcoin
	public static void flipcoin(int flipcoin) {
		int count1 = 0;
		int count2 = 0;
		if (flipcoin >= 0) {
			for (int x = 1; x <= flipcoin; x++) {

				if (Math.random() < 0.5) {

					count1++;
				} else {

					count2++;
				}

			}
			int heads = (count1 * 100) / flipcoin;
			int tails = (count2 * 100) / flipcoin;
			System.out.println("heads:" + count1);
			System.out.println("tails:" + count2);
			System.out.println("Percentage Of Heads: " + heads);
			System.out.println("Percentage of Tails:)" + tails);
		}
	}
//power
	public int power(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Math.pow(" + n + "," + i + ")=" + Math.pow(n, i));
		}
		return n;
	}

	public int harmonic(int n) {
		int i = 1;
		float result = 0;
		while (n >= i) {
			result = result + (float) 1 / n;
			n--;
		}
		System.out.println("The Nth harmonic value is:" + result);
		return n;
	}
	
//Prime factors using brute force
	public int primefactors(int n) 
	{
		int i = 1;
		for (i = 2; i*i<= n; i++) 
		{
			while (n%i == 0)
			{
				System.out.println(i + " ");
				n = n / i;
			}
			if (n>i)
			{
				
				System.out.print(n+ " ");
			}
		}
		return n;
	}
	
	//Euclidean Distance
	public void distance(int x, int y) {
		double m = Math.pow(x, 2);
		double n = Math.pow(y, 2);
		double distance = Math.sqrt(m + n);
		System.out.println("\nDistance is:=" + distance);

	}

	public void lapsedTime() throws InterruptedException {

	}
// Quadratic Equation
	public void quadratic(double a, double b, double c) {
		double delta, r1x, r2x;
		double square = Math.pow(b, 2);
		System.out.println("square" + square);
		double q = (4 * (a * c));
		System.out.println("fourAC" + q);
		delta = square - q;
		double sqrtdelta = Math.sqrt(delta);
		System.out.println(sqrtdelta);
		double amp = (sqrtdelta / (2 * a));
		System.out.println("amp=" + amp);
		r1x = -b + amp;
		r2x = -b - amp;
		System.out.println("The value of r1x is=" + r1x);
		System.out.println("The value of r2x is=" + r2x);
	}

	//Triplet
	public static void findTriplet(int number, int[] array) {
		// System.out.println("hi..");
		boolean found = false;

		for (int i = 0; i < number - 2; i++) {
			for (int j = i + 1; j < number - 1; j++) {
				for (int k = j + 1; k < number; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]);
						found = true;
					}
				}
			}
		}
		if (found == false)
			System.out.println("Triplets not Exist...");
	}

	//Gambler
	public int gambler(int stake,int goal,int trials)
	{
		
		int win=0;
		int bets=0;
		int cash=stake;
		for(int i=0;i<trials;i++)
		{
			while(cash>0 && cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
					cash++; //wins by $1
				else
				cash--;
			}
			if(cash==goal)
			win++;
		}
		System.out.println("Number of wins:="+trials);
		System.out.println("Percentage of wins:="+(win*100/trials));
		System.out.println("Percentage of lose:="+(100-(win*100)/trials));
		
	
		return 0;
	}

	//WeatherCast
	public int weathercast(double t, double v)
	{
		double q=Math.pow(v, 0.16);
		System.out.println("q " +q);
		double add=0.4275*t;
		System.out.println("add "+ add);
		
		double w=(((35.74+0.6215)*t)+((add-35.75)*q));
		System.out.println(w);
		return 0;
	}
	
	//Anagram
	public static int isAnagram(String firstString,String secondString)
	{
		boolean status=true;
				if(firstString.length()==secondString.length())
				{							
							char[] firstchar=firstString.toLowerCase().toCharArray();
							char[] secondchar=secondString.toLowerCase().toCharArray();
						
							Arrays.sort(firstchar);
							Arrays.sort(secondchar);
							
							status=Arrays.equals(firstchar,secondchar);
						}
						if(status)
						{
							System.out.println(firstString +" "+secondString+" is anagram");
						}
						else
							status=false;
						if(firstString.length()!=secondString.length())
						{
							String copyfirstString=firstString.replaceAll("\\s{2}"," ");
							String copysecondString=secondString.replaceAll("\\s{2}"," ");
							copyfirstString.equalsIgnoreCase(copysecondString);
							
						}
							else {
							
							System.out.println(firstString +" "+secondString+" is  not an anagram");
						}
						return 0;
				}
	//palindrome 
	public int palindrome(String number,String temp)
	{
		StringBuilder string=new StringBuilder(number);
		String rever=string.reverse().toString();
		if(rever.equals(temp))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a plaindrome");
		}
		return 0;	
	}
	//Prime Number Between 0-1000
	public int primenumber(int number)
	{
		boolean flag=false;
	
		for(int i=0;i<number;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
			if(i%j==0)
			{
				flag=true;
				break;
			}
			else 
			{
				flag=false;
			}
		}
		if(flag==false)
		{
			System.out.print( i+" ");
		}
		
		}
		return 0;
	}
	
	//BinarySearch
	public int binarysearch(int searchkey, int found,int a[], int number,int last){
		int first=0;
		
	  int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( a[mid] < searchkey ){  
	        first = mid + 1;     
	      }else if ( a[mid] == searchkey ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }
	return mid;  
	 } 
	
	//Temperature Conversion
public static void temperatureConversion(double temperature) {
	double  temptofahrenheit=(temperature * 1.8) + 32; 
	System.out.println(" Temperature to fahrenheit conversion\t" +temptofahrenheit+" ");
	
	double fahrenheittotemp  = (temptofahrenheit-32)*5/9 ; 
	System.out.println("  fahrenheit to temperature conversion\t" +fahrenheittotemp+" ");
	
}

//Simple Interest
public static void monthlyPayment(double rateofinterest, double years,double principalamount)
{
	double  r=rateofinterest/(12*100);
	System.out.println("r is:="+r);
	
	double multiplybyyears=12*years;
	System.out.print("multiplybyyears:="+multiplybyyears);
			
	System.out.println();
	//principal amount
	double pr=principalamount*r;
	System.out.println("pr:"+pr);
	// value=1+r^n value calculation
	double value=1+r;
	System.out.print(value);
	double divideby=Math.pow(value,(multiplybyyears));
	double minus=(1-divideby);
	System.out.println("divideby value is:" +minus);
	double payment=pr/minus;
	
	
	System.out.println("payment is:" + payment);

}

//Convert Decimal To Binary
public static void covertDecimalToBinary(int number)
{
	int copynumber=number;
	int result=0;
	while (copynumber>0)
	{
	int remainder=copynumber%2;
	 result=result+remainder;
	}
	int quotient=copynumber/2;
	System.out.println(result);
	
}

//BubbleSort method for integer
public int BubbleSort(int n) {
	Scanner scanner=new Scanner(System.in);
	int a[]=new int[n];
	System.out.println();
		System.out.println("Enter value for "+n+ " numbers:");

		for(int i=0;i<a.length;i++)       
		{
		    a[i]=scanner.nextInt();		//taking input from user
		}

		for(int i=0;i<a.length;i++)         //sorting the array
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("The sorted order is:");

		for(int i=0;i<a.length;i++)      
		{
		     System.out.println(a[i]);		//printing the sorted array
		}
		return 0;
	}

//BubbleSort method for String
public static String bubbllesortString(int n)
{
	Scanner scanner=new Scanner(System.in);
	String a[]=new String[n];
	System.out.println();
	System.out.println("Enter value for "+n+ " numbers:");

	for(int i=0;i<a.length;i++)       
	{
	    a[i]=scanner.nextLine();		//taking input from user
	}

	for(int i=0;i<a.length;i++)         //sorting the array
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i].(a[j])
			{
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println();
	System.out.println("The sorted order is:");

	for(int i=0;i<a.length;i++)      
	{
	     System.out.println(a[i]);		//printing the sorted array
	}
	return 0;
	
}
	//creating a node

public class node{
	public String node;
	public int data;
	public String data1;
	public int next;

	public void setNode(String node) {
		this.node = node;
	}
	public void setData(int data) {
		this.data = data;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public void setNext(int next) {
		this.next = next;
	}
	
}

//Permutation of String
public static String  permutationofstring(String input,String Permutation)
{
	
		for(int i=0;i<input.length();i++)
		{
			System.out.println(Permutation + input.charAt(i) + input.substring(0, i)+ input.substring(i+1,input.length()));
		}
	System.out.println();
	return Permutation;
		
	}

//2D-Array
	public  static <T> void printArray(T[][]array,int rows,int columns)
	{
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{	
				out.write(array[i][j]+ "\t");
			}
			out.println();
			out.flush();
		}
	}

//distinct coupon number
	
public static int distinctcoupon(int distinct_number) {
	int a[]=new int[distinct_number];


for(int i=0;i<a.length;i++)
	{
		a[i]=(int)(Math.random()*distinct_number);

		for(int j=0;j<i;j++)
		{
			if(a[i]==a[j])
			{
				i--;
			}
		}	
	}
	
	for(int i : a) {
		
		System.out.print(i+" ");
	}
	return distinct_number;
}
}
