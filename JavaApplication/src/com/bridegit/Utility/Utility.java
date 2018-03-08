package com.bridegit.Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * @param to find <<username>> and replace it with the user input name
 * 
 */
public class Utility {
	
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
	/* To compute the prime factorization using Brute force technique */
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
	/* To simulate the gambler problem program to check for how many times the user wons or lose with finite set of trials*/
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
	
public String getFileText(String fileName) throws FileNotFoundException{
		
		try{
			BufferedReader	br=new BufferedReader(new FileReader(fileName));
			StringBuilder sb=new StringBuilder();
			String line=br.readLine();
			while(line!=null){
			sb.append(line);
			sb.append(System.lineSeparator());
			line=br.readLine();
			}
			return sb.toString();
		}
			catch(Exception e){
			return null;
			}
			
	}
	
/*********************************************************************************************************************/
												//Algorithm Program
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
		public int primenumber()
		{	
			Scanner scanner=new Scanner(System.in);
			int number =scanner.nextInt();
			
			boolean flag=false;
		
			for(int i=2;i<number;i++)
			{
				for(int j=2;j<i;j++)
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
		
		
		public static boolean isPrime()
		{
			Scanner scanner=new Scanner(System.in);
			int number =scanner.nextInt();
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
			System.out.println("Palindrome Prime number:");
			for (int number = 2; number < 1000; number++)
			{
				if (isPrime())
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
		public
		
		
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
//Convert Decimal To Binary
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




//16. Binary.java
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
	public int AnagramCheck(int number,int array[])
	{
		for(int i=0;i<number;i++)
		{
			
		}
	}
	
	
/*****************************************************************************************************************************************/
													//DataStructure Programs

	
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

public static int readFile(String filepath)
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
	return readFile(filepath);
}


/****************************************************************************************************************************************************************/
												//DataStructure Program
	

   
   
}
