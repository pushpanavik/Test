package com.bridegit.Utility;

import java.util.regex.Pattern;
import java.lang.reflect.Array;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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

	public int primefactors(int n) {
		int i = 1;
		for (i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i + "");
				n = n / i;
			}
			if (n < 1)
				System.out.println(n);
		}
		return n;
	}

	public void distance(int x, int y) {
		double m = Math.pow(x, 2);
		double n = Math.pow(y, 2);
		double distance = Math.sqrt(m + n);
		System.out.println("\nDistance is:=" + distance);

	}

	public void lapsedTime() throws InterruptedException {

	}

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

	public int gambler(int stake,int goal,int trials)
	{
		
		int win=0;
		int bets=0;
		int cash=stake;
		while(cash>0 && cash<goal)
		{
			bets++;
			if(Math.random()<0.5)
			cash++; //wins by $1
			else
				cash--;	 //lose by $1
		}
		if(cash==goal)
			win++;
		System.out.println("Number of wins:="+trials);
		System.out.println("Percentage of wins:="+100*win/trials);
		System.out.println("Average of bets:="+1.0*bets/trials);
		return cash;
	}
	
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
	/*public static int getCoupon(int n)
	{
		
		return (int) (Math.random() * n);		
	}
	public static int collect(int n) {
	boolean [] collected=new boolean[n];
	int c=0;
	int distinct=0;
	while(distinct<n)
	{
		int value=getCoupon(n);
		c++;
		if (!collected[value]) {           // discovered a new card type
            distinct++;
            collected[value] = true;
        }
	}
	return 0;
	}*/
	
	public static int isAnagram(String firstString,String secondString)
	{
	String copyfirstString=firstString.replaceAll("\\s","");
	String copysecondString=secondString.replaceAll("\\s","");
	
	
		
		boolean status=true;
				if(copyfirstString.length()!=copysecondString.length())
				{
					 status=false;
				}
						else
						{
							
							char[] firstchar=copyfirstString.toLowerCase().toCharArray();
							char[] secondchar=copysecondString.toLowerCase().toCharArray();
						
							Arrays.sort(firstchar);
							Arrays.sort(secondchar);
							
							status=Arrays.equals(firstchar,secondchar);
						
						}
						
						if(status)
						{
							System.out.println(firstString +" "+secondString+" is anagram");
						}
						else
						{
							System.out.println(firstString +" "+secondString+" is  not an anagram");
						}
						return 0;
				}
	public int primenumber(int lowestlimit,int highestlimit)
	{
		boolean flag=false;
	
		for(int i=lowestlimit;i<highestlimit;i++)
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
public static void temperatureConversion(double temperature) {
	double  temptofahrenheit=(temperature * 1.8) + 32; 
	System.out.println(" Temperature to fahrenheit conversion\t" +temptofahrenheit+" ");
	
	double fahrenheittotemp  = (temptofahrenheit-32)*5/9 ; 
	System.out.println("  fahrenheit to temperature conversion\t" +fahrenheittotemp+" ");
	
}
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
public static void covertDecimalToBinary(int number)
{
    StringBuilder result = new StringBuilder();
    int i =0;
	while(number>0)
	{
		 result.append(number%10);
		i++;
		 number=number/2;
	}
	System.out.println(result.reverse());
	
}

public static void dayOfWeek(String year,String month,String date)
{
	
	String y0 = year-((14−month)/12);
	System.out.println(y0);
	String x = y0+y0/4−y0/100+ y0/400;
	String m0 = (month+ 12)*(14−((month/12)−2));
	String d0 = (date+x+31)*((m0/12)%7);
}

public int BubbleSort(int a[],int n) {
	Scanner scanner =new Scanner(System.in);
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

public int Insertionsort(String str[])
{
	
	for(int i=0;i<str.length;i++)
		{
			Arrays.sort(str);
			System.out.print(i+ " ");
		}
	
	
	return 0;
	
}
}
