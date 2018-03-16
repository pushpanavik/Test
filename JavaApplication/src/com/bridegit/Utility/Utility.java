package com.bridegit.Utility;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgeit.DataStructurePrograms.CashCounterQueue;
import com.bridgeit.ObjectOrientedPrograms.Doctor;
import com.bridgeit.ObjectOrientedPrograms.Patient;


/*
 * @param to find <<username>> and replace it with the user input name
 * 
 */
public class Utility {
	Scanner scanner=new Scanner(System.in);
	
public String regex(String msg,String regex)
{
	String replace=	msg.replaceAll(msg,regex);
		System.out.println("Hello\t" +replace +" "+",How are you?");
		return replace;
}
/*
 * @param to determine the percentage of heads and tails
 * taking number of flips from the user 
 */
	
//2. Flip Coin and print percentage of Heads and Tails
		public static void flipcoin(int mflipcoin) {
			int lcount1 = 0;		/* to count the number of heads */
			int lcount2 = 0;		/* to count the number of tails */
			if (mflipcoin >= 0) {	/* to check whether the entered flip is greater than or equal to 0 value or not */
				for (int x = 1; x <= mflipcoin; x++) { /* loop until value of x turns less than or equal to flip */

					if (Math.random() < 0.5) { /* Assuming that if  random value is less than 0.5 than it will increment head count else tails count;	*/

						lcount1++;
					} else  {

						lcount2++;
					}

				}
				int heads = (lcount1 * 100) / mflipcoin;	/*calculating the total heads */
				int tails = (lcount2 * 100) / mflipcoin;	/*calculating the total tails */
				System.out.println("heads:" + lcount1);
				System.out.println("tails:" + lcount2);
				System.out.println("Percentage Of Heads: " + heads);	/*calculating the percentage of heads */
				System.out.println("Percentage of Tails:)" + tails);	/*calculating the percentage of tails */
			}
		}
		
//3. Leap Year
		/* 
		 * @param static variable is declared to check for given month is leap year or not */
		public static boolean leap(int year) {
			if (year % 400 == 0 && year % 4 == 0 ) { 		/* to check whether myear mod 400 is zero and myear mod 4 is zero */

				return true;	/* Print the year is a Leap Year */ 
			} else {
				return false;	/* Print the year is a not Leap Year */ 
			}
		
		}
		
//4. Power of 2 
		/*
		 * @param to take user input and  give power of that input */  
		public int power(int n) {
			for (int i = 0; i < n; i++) {	 //repeat until i equals N.
				System.out.println("Math.pow(" + n + "," + i + ")=" + Math.pow(n, i)); //prints a table of the powers of 2 that are less than or equal to 2^N.
			}
			return n;
		}
	
	
//5. Harmonic Number 
		/*
		 * @param to print nth harmonic value of a given number
		 */
	
	public int harmonic(int n) {
		int i = 1;
		float result = 0;
		while (n >= i) { //take Harmonic Value N. Ensure N != 0
			result = result + (float) 1 / n; 	  //type cast the value of 1/m first and then add with result 
			n--;				//decrement the value of mn 
		}
		System.out.println("The Nth harmonic value is:" + result); /* Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N */
		return n;
	}
	
//6. Factors using Brute Force
	/* 
	 * @param To compute the prime factorization using Brute force technique 
	 * */
	public int primefactors(int n) 
	{
		int i = 1;
		for (i = 2; i*i<= n; i++) /*Traverse till i*i <= N instead of i <= N for efficiency.*/
		{
			while (n%i == 0)	//loop until given condition is true
			{
				System.out.println(i + " ");
				n = n / i;				//storing the quotient value in the number
			}
			if (n>i)		/* if number is greater than 1 then print n */
			{
				
				System.out.print(n+ " ");
			}
		}
		return n;
	}
	
//7. Gambler
	/* @param
	 * To simulate the gambler problem program to check for how many times the user wons or lose
	 *  with finite set of trials
	*/
		public int gambler(int stake,int goal,int trials)
		{
			
			int win=0;
			int cash=stake;
			int lose=0;
			
			for(int i=1;i<=trials;i++)//traverse till number of trials
			{
				while(cash>0 && cash<=goal)
				{
					if(Math.random()>0.5)	//Assuming that if random number value is greater than 0.5 then cash amount increases.
					{
						cash++; 
				//wins by $1
					}
					else
					{
					cash--;
					}
				}
				if(cash>=goal)		/* if cash amount is greater than or equal goal declare as win */
				{
					win++;		//keeps a track of number of wins
					
				}
				else
				{
					lose--;		//keeps a track of number of lose
					
				}
				cash=stake;		/* continue with the next trial */
				
			}
				System.out.println("Number of wins:="+win);
				System.out.println("Number of lose:="+lose);
			System.out.println("Percentage of wins:="+(win*100/trials));
			System.out.println("Percentage of lose:="+(100-(win*100)/trials));
			
		
			return 0;
		}	
		
//8. Coupon Numbers
		
		public static int distinctcoupon(int distinct_number) {
			int a[]=new int[distinct_number];


		for(int i=0;i<a.length;i++)
			{
				a[i]=(int)(Math.random()*distinct_number); //repeatedly choose a random number  .

				for(int j=0;j<i;j++)	//check if condition is true or not
				{
					if(a[i]==a[j])		/* check whether it's a new one or the same */
					{
						i--;			/* if coupon numbers are same then eliminating the duplicates */ 
					}
				}	
			}
			
			for(int i : a) {					/* traverse the array and print it.  */
				
				System.out.print(i+" ");
			}
			return distinct_number;
		}		
//9.  2D Array	
		/*Print function to print 2 Dimensional Array. */
		public  static <T> void printArray(T[][]array,int rows,int columns)
		{
			PrintWriter out=new PrintWriter(System.out);	//using PrintWriter with OutputStreamWriter to print the output to the screen.
			for(int i=0;i<rows;i++)
			{
				for(int j=0;j<columns;j++)
				{	
					out.write(array[i][j]+ "\t");
				}
				out.println();
				out.flush(); // to print the array elements
			}
		}
		
//10. Sum of three Integer adds to ZERO	
		
		public static void findTriplet(int number, int[] array) {
			
			boolean found = false;
			int count=0;
			for (int i = 0; i < number - 2; i++) {		//take the first value from the array
				for (int j = i + 1; j < number - 1; j++) {	// take the second value from the same array
					
					for (int k = j + 1; k < number; k++) {	// takes the third value from the array.
						if (array[i] + array[j] + array[k] == 0) {	//to check whether addition of all three array will be exactly equal to zero or not. 
							count++;								//if triplet are exactly equal to 0 than increment count by one; 
							
							System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]); // print the triplets
							System.out.println("total number of triplets form are: " +count); 
							found = true;
						}
					}
				}
			}
			if (found == false)
				System.out.println("Triplets not Exist...");
		}	
		
//11. Distance.java		
	
	public void distance(int mx, int my) {
		double lm = Math.pow(mx, 2);	/* lm will give the power  of mx^2 */
		double ln = Math.pow(my, 2);	/* ln will give power of my^2 */
		double distance = Math.sqrt(lm+ln);
		System.out.println("\nDistance is:=" + distance); /* calculates the euclidean distance */

	}

	
	
//12.Permutation of String
	/*
	 * @param method to take input from user to print permutation of string
	 */
	public void permute(String str, int l, int r)
    {
        if (l == r)			// l is the index position compared with length of string 
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++) 
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
	 public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
//13. Simulate Stopwatch Program
	public void lapsedTime() throws InterruptedException {

	}
	
//14. Cross Game or Tic-Tac-Toe

	
//15. Quadratic.java 
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

	//16. WindChill.java
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
	

	

	//1. An Anagram Detection Example
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
	
//2.Prime Number Between 0-1000
		/**
		 * @param number to print prime numbers between 0-1000
		 * 
		 */
		
		public int primenumber(int number)
		{	
			ArrayList<Integer>list=new ArrayList<Integer>();
			boolean flag=false;
		
			for(int i=2;i<number;i++)
			{
				for(int j=2;j<=i;j++)
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
		
		
		
/**
 * @param to check whether the number is prime or not
 * @return if it is Prime than return true;
 */
public static  boolean isPrime(int number)
		{
			
			// condition to check if no less than two
			if(number<2)
			{
			return false;
			}
			else 
			{
				// for loop to for checking prime no
				for(int i=2;i<=number;i++)
				{
					// if factor divides evenly into n, n is not prime, so break out of
					// loop
					if(number%i==0)
					{
						return false;
					}
					
				}
			}
			return true;
			
		}
//
/*
 *@param  Take Integer Input
 */
	public int inputInteger() throws IOException{
		try{	
			return scanner.nextInt();
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());	
		}
		return 0;
	}
		
		public static boolean isPalindrome(String str)
		{
			
			char [] array=str.toLowerCase().toCharArray();
			boolean isPalindrome=true;
			int j=array.length-1;
			for(int i=0;i<array.length;i++,j--)
			if(array[i]==array[j])
			{
				isPalindrome= true;
			}
			else
			{
				isPalindrome=false;
			}
			return false;
		}
		public static void printPrimePalindrome()
		{
			System.out.println("Palindrome Prime number:==>>");
			for (int number = 2; number < 1000; number++)
			{
				if (isPrime(number))
				{
					if (isPalindrome(Integer.toString(number))) 
					{
						System.out.println(number);
					}
				}
			}
		}
		public static boolean isAnagramPrime(String str1, String str2) {
			boolean isAnagram = true;
			char arr1[] = str1.toLowerCase().toCharArray();
			char arr2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (arr1.length != arr2.length) {
				return false;
			} else {
				for (int i = 0; i < arr1.length; i++) {
					if (arr1[i] == arr2[i]) {
						isAnagram = true;
					} else {
						isAnagram = false;
						break;
					}

				}
			}
			return isAnagram;
		}
		
		public static int primeAnagram() 
		{
			ArrayList<String> list=new ArrayList<String>();
			System.out.println("Prime numbers that are anagram");
			for (int i = 0; i < 1000; i++) 
			{
				if (isPrime(i)) 
				{
					list.add(String.valueOf(i));
				}
			}
			for (int i = 0; i < list.size(); i++) 
			{
				for (int j = i + 1; j < list.size(); j++) 
				{
					if (isAnagramPrime(list.get(i), list.get(j)))
					{
						System.out.println(list.get(i) + "    " + list.get(j));
					}
				}
			}
			return 0;

		}
		public int normalYear()
		{
			int normalYear[]= new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
			return  0;
		}
		
		
		
//3. Extend Program
//4. To the Utility Class write the following static methods
		//Binary search integer
				public int binarysearch(int inputSearch, int a[],int number){
					
					int first=0;
					int last=number-1;
				  int mid=(first+last)/2;  
				   while( first <= last ){  
					   if ( a[mid] < inputSearch )
					   {
				           first = mid + 1;
					  
					   }
				         else if ( a[mid] == inputSearch)
				         {
				           System.out.println(inputSearch + " found at location " + (mid + 1) + ".");
				           break;
				         }
				         else
				         {
				             last = mid - 1;
				         }
				         mid = (first + last)/2;
				      }
				      if ( first > last )
				          System.out.println(inputSearch + " is not found.\n");
				   
				return -1;
				   }		
				
				//insertion sort integer
				public static int insertion_sort(int number,int a[])
				{	
					for(int j=1;j<a.length;j++)
					{
						int key=a[j];
						int i=j-1;
						while(i>-1 && (a[i]>key))
						{	
								a[i+1]=a[i];
								i--;
						}
						a[i+1]=key;
					}
					System.out.println("the sorted array is:");
					for(int i=0;i<a.length;i++)
					{
						System.out.println(a[i]);
					}
					return 0;
				}	
				//BinarySearch method for String
				
				public static int searchString(String s[],String Search)
				{
					 int first=0;
						int last=s.length;
					   while( first <= last ){ 
						  int  mid=(first+last)/2;
						    if(Search.compareTo(s[mid])>0)
						    {
						    	first=mid+1;
						    }
						    else if(Search.compareTo(s[mid])<0) {
						    	last=mid-1;
						    }
						    else
						    {	 
						 System.out.println(Search + " is found at location" +(mid+1)+ " ");
						 break;
						    }
						    if(first>last)
						    {
						    	System.out.println(Search+ "is not found.\n");
						    }
						   
				   }
					return 0;
				}

		//BubbleSort method for String
		public static int bubbleString(int number,String s[],String temp)
		{
			System.out.println("The Before sorting is:");
		for(int i=0;i<number;i++)
		{
		    System.out.println("\n\t"+ s[i]);
		}
		for(int i=0;i<number;i++)
		{
		    for(int j=i+1;j<number;j++)
		    {
		        if(s[i].compareTo(s[j])<0)
		        {
		            i++;
		        }
		        else
		        {
		            temp=s[i];
		            s[i]=s[j];
		            s[j]=temp;
		            
		        }
		    }
		    
		}
		System.out.println("After sorting is:");
		for(int i=0;i<s.length;i++)
		{
		    System.out.println("\n\t"+ s[i]);
		}
		return -1;
		}
				
//5. Question to find your number	
		 public static int guessNumber(int lower,int upper,int mid,int count,int number)
         {
             Scanner scanner=new Scanner(System.in);
                 String value=null;
                 System.out.println("Enter your guess number between '0' to " +(number-1)+" ");
         int guessno=scanner.nextInt();
         System.out.println("Is your number:"+mid);
		System.out.println();
                System.out.println("Enter if your answerr is yes or low or high ");
                value=scanner.next();
          do{
          if (value.equals("high"))
         {
             lower= mid;
		count++;
         }
         else if (value.equals("yes"))
         {
		System.out.println("The number you thought was: "+mid);
		int no=count+1;
		System.out.println("It takes "+no+" times to find your exact number");
		break;
         }
         else if(value.equals("low"))
         {
		upper=mid;
		count++;
         }
         if(count<number)
         {
				mid=(lower+ upper)/2;
				System.out.println("Is your number "+mid+":");
				value=scanner.next();
			}
		}
		while(lower<=upper);
                  
			if (count>number)
			{
				System.out.println("Number not found");
			}
			else
			{
				System.exit(0);
			}
     return 0;
		
         }          
		
//6. Binary Search the Word from Word List	

//7. InsertionSort method for String
		/*Using Insertion Sort to sort the words in the String array */
		public static int insertionString(int number,String a[],String temp)
		{
		System.out.println("The Before sorting is:");
		for(int i=0;i<number;i++)
		{
		  System.out.println("\n"+ a[i]);
		}
		for(int i=0;i<number;i++)	//to compare two values of an array using outer and inner for loop
		{
		  for(int j=i+1;j<number;j++)	
		  {
		      if(a[i].compareTo(a[j])>0)	//comparing the index 0 value with the second index 1 and if it is greater than 0 return positive
		      {
		          temp=a[i];	// the result is positive so swap the values
		          a[i]=a[j];
		          a[j]=temp;
		          
		      }
		  }
		}
		System.out.println("After sorting is:"); //print the sorted list
		for(int i=0;i<a.length;i++)
		{
		  System.out.println("\n"+ a[i]);
		}
		return 0;
		}
		
//8. //BubbleSort method for integer
/* reading integer value from the given array and performing  bubble sort */
public int BubbleSort(int number,int a[]) 
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("The Before sorting is:");
	for(int i=0;i<number;i++)
	{
	    System.out.println("\n\t"+ a[i]);
	}
		for(int i=0;i<a.length;i++)         //sorting the array
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])		// comparing the adjacent elements from the array and checking for whether the first element is greater than the second element
				{
					int temp=a[i];	 // if the j is greater than swap values of the array
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting is:");
		for(int i=0;i<a.length;i++)
		{
		    System.out.println("\n\t"+ a[i]);
		}
		return 0;
}

//9. Merge Sort  

public static void mergeSort(String array[],int beg,int mid,int end)
{
	beg=0;end=array.length-1;
	int i=beg,index=beg,j=mid+1;
	String temp[]=new String[array.length];
	if((i<=mid)&&(j<=end))
	{
		if(array[i].compareTo(array[j])>0)
		{
			temp[index]=array[i];
			array[i]=array[j];
			array[j]=temp[index];
			i++;
		}
		else
		{
			temp[index]=array[j];
		j++;
		}
	}
	else if(i>mid)
		{
			while(j<=end)
			{
				temp[index]=array[j];
				j++;
				index++;
			}
		}
		else 
		{
		
			while(i<=mid)
			{
				temp[index]=array[i];
				i++;
				index++;
			}
		}
	for(int k=0;k<index;k++)
	{
		array[k]=temp[k];
	}
	
}
public void mergeSort(String array[], int beg, int end)
{
  if (beg < end)
  {
      // Same as (l+r)/2, but avoids overflow for
      // large l and h
      int mid = beg+(end-beg)/2;

      // Sort first and second halves
      mergeSort(array, beg, mid);
      mergeSort(array, mid+1,end);

      mergeSort(array, beg, mid, end);
  }
}
	public  static void printMergeArray(String array[], int number)
	{
	    int i;
	    for (i=0;i<number;i++)
	        System.out.println(array[i] +" ");
	}
//10. Find the Fewest Notes to be returned for Vending Machine
	
//11.dayOfWeek 
public static int dayOfWeek(int year,int month,int day)
{
	int y0 = year -(14 -month) / 12;
	int x = y0+y0/4-y0/100 +y0/400;
	int m0 = month+12*((14 - month) / 12) - 2;
	int d0 = (day+x+31*m0/12)%7;
	return d0;
	
}

public static int day(int month, int day, int year) {
    int y = year - (14 - month) / 12;
    int x = y + y/4 - y/100 + y/400;
    int m = month + 12 * ((14 - month) / 12) - 2;
    int d = (day + x + (31*m)/12) % 7;
    return d;
}
	
	
	
	
//12. temperaturConversion

public static void temperatureConversion(double temperature) {
double  temptofahrenheit=(temperature * 1.8) + 32; 
System.out.println(" Temperature to fahrenheit conversion\t" +temptofahrenheit+" ");

double fahrenheittotemp  = (temptofahrenheit-32)*5/9 ; 
System.out.println("  fahrenheit to temperature conversion\t" +fahrenheittotemp+" ");

}

//13. monthlyPayment 

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

//14.  sqrt  
public double sqrtNewton(double t,double c,double epsilon)
{
t=Math.sqrt(c);
while(Math.abs(t-c/t)>epsilon*t) {
	t=(c/t+t);
}
System.out.println(t);
return t;
}

//15.toBinary
/*
 * @param Convert Decimal To Binary
 */
	public static byte[] binary(int number)
	{
		byte[] b=new byte[32];
		int index=0;
		int temp=number;
		while(temp>0)
	{
		b[index++]=(byte)(temp%2);
		temp=temp/2;
	}
		return  b;
	}
/*
 * @param covert  decimal number to binary	
 */
public void printArray(byte[] b)
	{
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+"");
		}
		System.out.println();
	}
public static int swapNibbles(int number)
{
    return ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
}




//16.Binary.java
/*
 * @param to convert decimal number to binary
 */
	public static byte[] decTobinary(int number)
	{
		byte[] b=new byte[8];
		int index=0;
		int temp=number;
		while(temp>0)
	{
		b[index++]=(byte)(temp%2);
		temp=temp/2;
	}
		return  b;
	}
	
/*
 * @param To check whether it is palindrome or not.
 */
	public int palindromeString(String number,String temp)
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
	
	
public static <T extends Comparable<T>> void  input(T[] range)
{
	Scanner scanner	=new Scanner(System.in);;
	try
	{
		scanner.next();
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
}

/*
 * @param to read File 
 */
public static String[] readFile(String filepath)
{
	String word[]= {};
	ArrayList<String> list=new ArrayList<String>();
	String line, temp[]= {};
	BufferedReader br;
	FileReader fr;
	int index=0;
	try
	{
		fr=new FileReader(filepath);
		br=new BufferedReader(fr);
		while((line=br.readLine())!=null)
		{
			temp=line.split(" ");
		}
		for(int i=0;i<temp.length;i++)
		{
			list.add(temp[i]);
		}
	
	word=list.toArray(new String[list.size()]);
	br.close();
	}
	catch(Exception e) {}
	return word;
}



/*//take input word
	public String inputString(){
		BufferedReader br;
		try{
			br=new BufferedReader(System.in);
			return br.readLine();
		}
		catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}
		return "";
	}*/
	
/*
		//Take Double Input
		public double inputDouble(){
			try{
				try{	
					return Double.parseDouble(br.readLine());
				}
				catch(NumberFormatException nfe){
					System.out.println(nfe.getMessage());	
				}
			}catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return 0.0;
		}*/


public static int binarySearch(int []arr,int l, int r, int value)
{

  if(l <= r)
  {
    int mid = l + (r-1)/2;

    if( arr[mid] == value)
    {
      return mid;
    }
    else if( arr[mid] > value)
    {
      return binarySearch(arr,l,mid-1,value);
    }
    else //if( arr[mid] < value)
    {
      return binarySearch(arr,mid+1,r,value);
    }
  }
  return -1;

}





          

public static int[] InsertionSort(int []arr, int lenInt)
{
  int j=0; int key;
      for(int i=1;i<lenInt;i++)
        {
          j=i-1;
          key=arr[i];
          while(j>=0 && arr[j] > key )
          {
            arr[j+1] = arr[j];
            j=j-1;
          }
          arr[j+1] = key;
        }
/*
        System.out.println("");
        for(int i=0;i<n;i++)
          System.out.println(""+arr[i]);
*/
          return arr;
}
public static String[] InsertionSort(String []str, int n)
{
  int j=0;
  String key;
      for(int i=1;i<n;i++)
        {
          j=i-1;
          key=str[i];
          while(j>=0 && str[j].compareTo(key) > 0 )
          {
            str[j+1] = str[j];
            j=j-1;
          }
          str[j+1] = key;
        }

return str;
}

public static int binarySearch(String []str,int l, int r, String value)
{
  //System.out.println(l+""+r);
  if(l <= r)
  {
    int mid = l + (r-1)/2;

    if( str[mid].equalsIgnoreCase(value) )
    {
      return mid;
    }
    else if( str[mid].compareTo(value) > 0)
    {
      return binarySearch(str,l,mid-1,value);
    }
    else //if( arr[mid] < value)
    {
      return binarySearch(str,mid+1,r,value);
    }
  }
  return -1;

}
public static int[] bubbleSort(int []arr, int n)
{

      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<(n-1);j++)
          {
            if(arr[j]>arr[j+1])
            {
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          }
        }


        return arr;

}

public static String[] bubbleSortString(String []arr, int lenInt)
{

      for(int i=0;i<lenInt-1;i++)
        {
          for(int j=0;j<(lenInt-1);j++)
          {
            if(arr[j].compareTo(arr[j+1])>0)
            {
              String temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }
          }
        }


        return arr;

}
public static void insertionSortforInt(int arr[]){
	int leng = arr.length;
	for (int i=1; i<leng; ++i)
	{
		int key = arr[i];
		int j = i-1;

		while (j>=0 && arr[j] > key)
		{
			arr[j+1] = arr[j];
			j = j-1;
		}
		arr[j+1] = key;
	}
}
public int updateDeposit(int deposit_amount,int initialbal)
{
	CashCounterQueue cash=new CashCounterQueue();
	int update_deposit=initialbal+deposit_amount;
	return update_deposit;
	
	
}

public int integerInput() 
{
	try 
	{
		return scanner.nextInt();
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	return 0;
}

public long longInput() 
{
	try 
	{
		return scanner.nextLong();
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	return 0;
}

public double doubleInput() 
{
	try 
	{
		return scanner.nextDouble();
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	return 0.0;
}

public float floatInput() 
{
	try 
	{
		return scanner.nextFloat();
	}
	catch(Exception e)
	{
		System.out.println(e.toString());
	}
	return 0.0f;
}

 public String inputStringLine() 
 {
	 try 
	 {
		 return scanner.nextLine();
	 }
	 catch(Exception e) 
	 {
		 System.out.println(e.toString());
	 }
	 return null;
 }
 
 public String inputString() 
 {
	 try 
	 {
		 return scanner.next();
	 }
	 catch(Exception e) 
	 {
		 System.out.println(e.toString());
	 }
	 return null;
 }
/*public void continueToProcess()
{
	MethodUtil util=new MethodUtil();
	int choice;
	do {
		int deposit_amount;
		int withdraw_amount;
		int update_Balance=0;
		System.out.println("Enter your choice");
		System.out.println("1.  Deposit");
		System.out.println("2. Withdraw ");
		System.out.println("3. Check Balance");
		System.out.println("4.Number of people in queue");
		choice=util.integerInput();
		switch(choice)
		{
		case 1:
				System.out.println("enter deposit");
				deposit_amount=util.integerInput();
				
		case 2:
			System.out.println("enter the amount to withdraw");
			withdraw_amount=util.integerInput();
				
		}
	}while(choice<5);
	
}*/
public void DeckOfCards(String [] Rank,String [] suits)
{
	String [] array=new String [52];
	for(int i=0;i<array.length;i++)
	{
		String quo=suits[i/13];
		
		String rem=Rank[i%13];
	 array[i] = quo+rem;
	//	System.out.print(array[i]+" ");
	}	
	System.out.println();
	Random r=new Random();
	
	int length=array.length;
	//System.out.print(length + " length of ARRAY");
	for(int i=0;i<array.length;i++)
	{
		int index=r.nextInt(52);
		//System.out.print(index+ " ");
		
		String temp=array[i];
		array[i]=array[index];
		array[index]=temp;
	}
	for(String u : array)
	{
		System.out.println(u);
		//System.out.println("\n");
	}
	System.out.println();


	String [] []str=new String [suits.length][9];
	for (int i = 0; i < 4; i++) 
	{
		System.out.print("Player"+(i+1)+ "\t");
		//System.out.println();
		
		for (int j = 0; j <9 ; j++) 
		{
			
			str[i][j]=array[i+j*4];
			System.out.print("       " +str[i][j]+ "        ");
			
		}
		
		System.out.println();
	}
}
public <T> void DeckOfCardsInQueue(String [] Rank,String [] suits)
{
	Queue<T> deckofcard=new Queue<>();
	String [] array=new String [52];
	for(int i=0;i<array.length;i++)
	{
		String quo=suits[i/13];
		
		String rem=Rank[i%13];
	 array[i] = quo+rem;
	//	System.out.print(array[i]+" ");
	}	
	System.out.println();
	Random r=new Random();
	
	int length=array.length;
	//System.out.print(length + " length of ARRAY");
	for(int i=0;i<array.length;i++)
	{
		int index=r.nextInt(52);
		//System.out.print(index+ " ");
		
		String temp=array[i];
		array[i]=array[index];
		array[index]=temp;
	}
	for(String u : array)
	{
		System.out.println(u);
		//System.out.println("\n");
	}
	System.out.println();


	String [] []str=new String [suits.length][9];
	for (int i = 0; i < 4; i++) 
	{
		System.out.print("Player"+(i+1)+ "\t");
		//System.out.println();
		
		for (int j = 0; j <9 ; j++) 
		{
			
			str[i][j]=array[i+j*4];
			deckofcard.insert((T) str[i][j]);
			//System.out.print("       " +str[i][j]+ "        ");
			
		}
		
		System.out.println();
	}
}
class Node<T>{
	public T data;
	public Node  next;
	public Node(T val)
	{
		data=val;
	}
}
class Queue <T>{
	public Node First;
	public Node Last;
	public int currentsize=0;
	public Queue()
	{
		First=null;
		Last=null;
	}
	public void insert(T val)
	{
		Node<T> newnode=new Node<T>(val);
		newnode.data=val;
		newnode.next=null;
		if(isEmpty())
		{
			First=newnode;
			currentsize++;
			System.out.println(val);
		}
		else
			Last.next=newnode;
			newnode.next=(Node) Last;
			currentsize++;
			System.out.println(val);
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(First==null && Last==null)
		{
		return true;
		}
		return false;
	}
	public void display()
	{
	
		 Node temp=First;
		while(temp!=null)
		{
			temp=temp.next;
		
			
		}
	}
}
/**
	 * the function return the number of binary search trees that can be constructed 
	 * based on the number of nodes 
	 * @param nodes used to construct the binary search trees
	 * @return the count of binary search trees
	 */
   public static double binarySearchTrees(double nodes) 
	{
		double firstTerm = (2*nodes);
		double secondTerm = (nodes+1);
		double thirdTerm = nodes;
		
		double numberofBinarySearchTress = factorial(firstTerm)/(factorial(secondTerm)*factorial(thirdTerm));
				
		return numberofBinarySearchTress;
	}
   
   
   
   /*public void findDoctorByName(ArrayList<Doctor> doctorList, String dname)
   {
     int flag =0;
     Iterator iter = doctorList.iterator();

     while(iter.hasNext())
     {
       Doctor d = (Doctor)iter.next();
       if(dname.equals(d.name))
       {
         flag =1;
         System.out.println("flag!!!");
         System.out.println("\nDoctor Found!");
         System.out.println("Doctor ID: "+d.docId);
         System.out.println("Doctor Name: "+d.name);
         System.out.println("Specialization: "+d.specialization);
         System.out.println("Availability: "+d.availability);

       }

     }
     if(flag == 0)
     {
       System.out.println("Doctor Not Found");
     }
   }	*/	   
   
   //searches Doctor by Name and prints the details if found.
   public void findDoctorByName(ArrayList<Doctor> doctorList, String dname)
   {
     int flag =0;
     Iterator iter = doctorList.iterator();

     while(iter.hasNext())
     {
       Doctor d = (Doctor)iter.next();
       if(dname.equalsIgnoreCase(d.name))
       {
         flag =1;
         System.out.println("flag!!!");
         System.out.println("\nDoctor Found!");
         System.out.println("Doctor ID: "+d.docId);
         System.out.println("Doctor Name: "+d.name);
         System.out.println("Specialization: "+d.specialization);
         System.out.println("Availability: "+d.availability);

       }

     }
     if(flag == 0)
     {
       System.out.println("Doctor Not Found");
     }
   }
   
 //Searches Doctor ArrayList using Specialization and prints the details if found
   public void findDoctorBySpec(ArrayList<Doctor> doctorList, String spec)
   {
     int flag =0;
     Iterator iter = doctorList.iterator();

     while(iter.hasNext())
     {
       Doctor d = (Doctor)iter.next();
       if(spec.equalsIgnoreCase(d.specialization))
       {
         flag =1;
         System.out.println("\nDoctor Found!");
         System.out.println("Doctor ID: "+d.docId);
         System.out.println("Doctor Name: "+d.name);
         System.out.println("Specialization: "+d.specialization);
         System.out.println("Availability: "+d.availability);
       }
     }
     if(flag == 0)
     {
       System.out.println("Doctor Not Found");
     }
   }
	
 //Searches Doctor ArrayList using Availability and prints the details if found
     
   public void findDoctorByAvaila(ArrayList<Doctor> doctorList, String availa)
   {
     int flag =0;
     Iterator iter = doctorList.iterator();

     while(iter.hasNext())
     {
       Doctor d = (Doctor)iter.next();
       if(availa.equalsIgnoreCase(d.availability))
       {
         flag =1;
         System.out.println("\nDoctor Found!");
         System.out.println("Doctor ID: "+d.docId);
         System.out.println("Doctor Name: "+d.name);
         System.out.println("Specialization: "+d.specialization);
         System.out.println("Availability: "+d.availability);
       }
     }
     if(flag == 0)
     {
       System.out.println("Doctor Not Found");
     }
   }

   //Searches Patient ArrayList using Patient ID and prints the details if found
   public void findPatientByID(ArrayList<Patient> patientList, String pid)
   {
     int flag =0;
     Iterator iter = patientList.iterator();
     while(iter.hasNext())
     {
       Patient p = (Patient)iter.next();
       if(pid.equalsIgnoreCase(p.patId))
       {
         flag =1;
         System.out.println("\nPatient Found!");
         System.out.println("Patient ID: "+p.patId);
         System.out.println("Patient Name: "+p.patName);
         System.out.println("Age: "+p.age);
         System.out.println("Mobile Number: "+p.mobileNo);
       }
     }
     if (flag ==0)
     {
       System.out.println("Patient Not Found");
     }
   }
   
 //Searches the Patient ArrayList using Name and prints the details if found
   public void findPatientByName(ArrayList<Patient> patientList, String pname)
   {
     int flag =0;
     Iterator iter = patientList.iterator();
     while(iter.hasNext())
     {
       Patient p = (Patient)iter.next();
       if(pname.equalsIgnoreCase(p.patName))
       {
         flag =1;
         System.out.println("\nPatient Found!");
         System.out.println("Patient ID: "+p.patId);
         System.out.println("Patient Name: "+p.patName);
         System.out.println("Age: "+p.age);
         System.out.println("Mobile Number: "+p.mobileNo);
       }
     }
     if (flag ==0)
     {
       System.out.println("Patient Not Found");
     }
   }
   

   //Searches Patient ArrayList using Mobile number and prints the details if found
   public void findPatientByMobNo(ArrayList<Patient> patientList, String mobno)
   {
     int flag =0;
     Iterator iter = patientList.iterator();
     while(iter.hasNext())
     {
       Patient p = (Patient)iter.next();
       if(mobno.equalsIgnoreCase(p.mobileNo))
       {
         flag =1;
         System.out.println("\nPatient Found!");
         System.out.println("Patient ID: "+p.patId);
         System.out.println("Patient Name: "+p.patName);
         System.out.println("Age: "+p.age);
         System.out.println("Mobile Number: "+p.mobileNo);
       }
     }
     if (flag ==0)
     {
       System.out.println("Patient Not Found");
     }
   }
 //Prints all the available details in the Doctor ArrayList
  public  void printDoctorRecords(ArrayList<Doctor> doctorList)
   {
	 /* DoctorObject.put("Doctor", jsonarray);*/
     Iterator iter = doctorList.iterator();

     while(iter.hasNext())
     {
       Doctor d = (Doctor)iter.next();

       System.out.println("\nDoctor ID: "+d.docId);
       System.out.println("Doctor Name: "+d.name);
       System.out.println("Specialization: "+d.specialization);
       System.out.println("Availability: "+d.availability);
       System.out.println("");

     } 
   }
  
//Prints all the available details in the Patient ArrayList
   public void printPatientRecords( ArrayList<Patient> p) 
   {
 	 
     Iterator iter = p.iterator();
     while(iter.hasNext())
     {
       Patient pat = (Patient)iter.next();
       System.out.println("\nPatient ID: "+pat.patId);
       System.out.println("Patient Name: "+pat.patName);
       System.out.println("Age: "+pat.age);
       System.out.println("Mobile Number: "+pat.mobileNo);
       System.out.println("");
     }

   }
   
   //Searches Doctor ArrayList using Doctor ID and prints the details if found
   public void findDoctorByID(ArrayList<Doctor> doctorList, String did)
   {
     int flag =0;
     Iterator iter = doctorList.iterator();
     while(iter.hasNext())
     {
       Doctor d = (Doctor)iter.next();
       if(did.equals(d.docId))
       {
         flag =1;
         System.out.println("\nDoctor Found!");
         System.out.println("Doctor ID: "+d.docId);
         System.out.println("Doctor Name: "+d.name);
         System.out.println("Specialization: "+d.specialization);
         System.out.println("Availability: "+d.availability);
       }
     }
     if (flag ==0)
     {
       System.out.println("Doctor Not Found");
     }
   }

 	
public void inventorymanage(int varieties)
{
	Utility u=new Utility();

JSONObject obj=new JSONObject();
JSONObject wheatobj=new JSONObject();
JSONObject pulsesobj=new JSONObject();
JSONObject riceobj=new JSONObject();
JSONArray array=new JSONArray();
String Name;
long Weight;
long overall_cost=0;
long inventory_cost;
long total_cost_Of_product1=0;
long total_cost_Of_product2=0;
long price_per_kg;
long total_cost_Of_product=0L;
long cost_of_item;
for(int i=0;i<varieties;i++)
{
	System.out.println("Enter Wheat Name");
	Name=u.inputString();
	wheatobj.put("Name"+Name, Name);
	System.out.println("Enter Weight");
	Weight=u.longInput();
	wheatobj.put("Weight"+Name, Weight);
	System.out.println("Enter price per kg");
	price_per_kg=u.longInput();
	wheatobj.put("price_per_kg"+Name, price_per_kg);
	cost_of_item= Weight*price_per_kg;
	
	wheatobj.put(" cost of   "+Name+   "variety", cost_of_item );
	total_cost_Of_product+=cost_of_item;
	/*inventory_cost+=total_cost_Of_product;*/
	//wheatobj.put("total_cost_Of_product",total_cost_Of_product );
	obj.put("Varieties_of_wheat",wheatobj);
}


for(int i=0;i<varieties;i++)
{
	System.out.println("Enter Pulses Name");
	Name=u.inputString();
	pulsesobj.put("Name"+Name, Name);
	System.out.println("Enter Weight");
	Weight=u.longInput();
	pulsesobj.put("Weight"+Name, Weight);
	System.out.println("Enter price per kg");
	price_per_kg=u.longInput();
	pulsesobj.put("price_per_kg"+Name, price_per_kg);
	cost_of_item= Weight*price_per_kg;
	pulsesobj.put(" cost of "+Name+ "variety",cost_of_item);
	total_cost_Of_product1+=cost_of_item;
	/*inventory_cost=total_cost_Of_product;*/
//	pulsesobj.put("total_cost_Of_product",total_cost_Of_product );
	obj.put("Varieties_of_pulses",pulsesobj);
	
}


for(int i=0;i<varieties;i++)
{
	System.out.println("Enter Rice Name");
	Name=u.inputString();
	riceobj.put("Name"+i, Name);
	System.out.println("Enter Weight");
	Weight=u.longInput();
	riceobj.put("Weight"+i,Weight);
	System.out.println();
	System.out.println("Enter price per kg");
	price_per_kg=u.longInput();
	riceobj.put("price_per_kg"+i,price_per_kg);
	cost_of_item= Weight*price_per_kg;
	riceobj.put(" cost of "+Name+ "variety", cost_of_item);
	total_cost_Of_product2+=cost_of_item;
	/*inventory_cost=total_cost_Of_product;*/
	//riceobj.put("total_cost_Of_product" ,total_cost_Of_product );
	obj.put("Varieties_of_rices",riceobj);
	overall_cost =total_cost_Of_product+total_cost_Of_product1 +total_cost_Of_product2;
}
System.out.println("Inventory cost is\t" +overall_cost);

try {
	FileWriter file=new FileWriter("/home/bridgeit/Desktop/Files Folder/abc.json");
	{
		file.write(obj.toJSONString());
		file.flush();
		file.close();
	}
	System.out.println("Successfully Copied JSON Object to File...");
	System.out.println("\nJSON Object: " + obj);
}
	catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
}
/**
	 * the function finds the factorial of a number
	 * 
	 * @param number to find the factorial
	 * @return the value of factorial in double
	 */
   public static double factorial(double number)
	{
		double fact = 1;
		while(number>0)
		{
			fact=fact*number;
			number--;
		}
		return fact;
	}
public String readJSonFile()
{
	try
	{
		String file="";
		JSONParser parser=new JSONParser();
		Object obj=parser.parse(new FileReader(file));
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return null;
}
}


   
   

