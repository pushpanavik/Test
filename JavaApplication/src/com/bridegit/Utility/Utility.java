package com.bridegit.Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import com.bridgeit.DesignPattern.SocketAdapter;
import com.bridgeit.DesignPattern.SocketClassAdapterImpl;
import com.bridgeit.DesignPattern.SocketObjectAdapterImpl;
import com.bridgeit.DesignPattern.Socket;
import com.bridgeit.DesignPattern.Volt;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;


/*
 * @param to find <<username>> and replace it with the user input name
 * 
 */
public class Utility {
	
	private static File file;
	private static FileWriter fileWriter;
	private static FileReader fileReader;
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
			if(n<31)
				{
				for (int i = 0; i < n; i++)
				{
					//repeat until i equals N.
				
				System.out.println("Math.pow(" + n + "," + i + ")=" + Math.pow(n, i)); //prints a table of the powers of 2 that are less than or equal to 2^N.
			}
				
				}
			System.out.println("Number should between 0 and 31");
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
					lose++;		//keeps a track of number of lose
					
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
			for (int i = 0; i < number; i++) {		//take the first value from the array
				for (int j = i + 1; j < number ; j++) {	// take the second value from the same array
					
					for (int k = j + 1; k < number; k++) {	// takes the third value from the array.
						if (array[i] + array[j] + array[k] == 0) {	//to check whether addition of all three array will be exactly equal to zero or not. 
							count++;								//if triplet are exactly equal to 0 than increment count by one; 
							
							System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]); // print the triplets
							
							found = true;
							if(array[i]==number)
							{
								array[j]=0;
								array[k]=0;
								if(array[i]+array[j]+array[k]==0)
								{
									count++;
									System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]);
									found=true;
								}
								if(array[i]==number-1)
								{
									array[j]=number;
									array[k]=0;
									if(array[i]+array[j]+array[k]==0)
									{
										count++;
										System.out.println("Triplets are :" + array[i] + " " + array[j] + " " + array[k]); 
										found=true;
									}
								}
							}
						}
					}
				}
			}
			System.out.println("Total triplets formed are:" +count);
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
					System.out.print( i+" ");
				}
				
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
// copy one file into another 
private static void copyFileUsingStream(File source, File dest) throws IOException {
    InputStream is = null;
    OutputStream os = null;
    try {
        is = new FileInputStream(source);
        os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    } finally {
        is.close();
        os.close();
    }
}

//to copy one file into another file using Java NIO channel
private static void copyFileUsingChannel(File source, File dest) throws IOException {
    FileChannel sourceChannel = null;
    FileChannel destChannel = null;
    try {
        sourceChannel = new FileInputStream(source).getChannel();
        destChannel = new FileOutputStream(dest).getChannel();
        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
       }finally{
           sourceChannel.close();
           destChannel.close();
   }
}
//to append file with some contents
private static void appendUsingFileWriter(String filepath,String appendText) throws IOException
{
	
	File f=new File(filepath);
	FileWriter fw=null;
	BufferedWriter bw=null;
	PrintWriter pw=null;
	try {
		f=new File(filepath);
		fw=new FileWriter(f,true);
		bw=new BufferedWriter(fw);
		pw=new PrintWriter(bw);
		pw.println(appendText);
	}finally {
		try {
			pw.flush();
			pw.close();
			bw.close();
			fw.close();
		}
		catch(IOException io)
		{
			io.printStackTrace();
			
		}

}	
}
public static void printStringToArray(Object[] string ,ArrayList al)
{
	string=al.toArray(new String[al.size()]);
	System.out.println(Arrays.toString(string));
}
private static String convertStringArrayToString(String[] strArr, String delimiter) {
	StringBuilder sb = new StringBuilder();
	for (String str : strArr)
		sb.append(str).append(delimiter);
	return sb.substring(0, sb.length() - 1);
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
	public static int dayOfWeek(int month, int date, int year) {
		// System.out.println("Entered date is : " + month + "/" + date + "/" +
		// year);
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + 31 * m0 / 12) % 7;
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
public double sqrtNewton(double c,double epsilon)
{
double t=Math.sqrt(c);
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
public void unorderedList()
{
	try {
		File file = new File("/home/bridgeit/test/JavaApplication/src/com/bridgeit/DataStructurePrograms/StringFile");

		boolean flag = false;
		BufferedReader buffer = new BufferedReader(new FileReader(file));

		Scanner scanner = new Scanner(System.in);
		String words = buffer.readLine();

		FileWriter fileWriter = new FileWriter("/home/bridgeit/test/JavaApplication/src/com/bridgeit/DataStructurePrograms/StringFile");
		String[] str1 = words.trim().split(" ");

		LinkedList<String> linkedList = new LinkedList<String>();

		for (int i = 0; i < str1.length; i++)
		{
			linkedList.add(str1[i]);
		}


		System.out.println(linkedList.toString());

		System.out.println("Enter the String to search...");
		String search = scanner.next();

		for (int i = 0; i < linkedList.size(); i++) 
		{
			if (linkedList.get(i).equalsIgnoreCase(search)) 
			{
				linkedList.remove(i);
				flag = true;
			}
		}
		//System.out.println(linkedList.toString());

		if (flag == false){
			
			linkedList.add(search);
		}
			

		if (flag == true) 
		{
			for (int i = 0; i < linkedList.size(); i++) {
				String str2 = (String) (linkedList.get(i)) + " ";
				fileWriter.write(str2);
				fileWriter.flush();
			}

		} else {
			for (int i = 0; i < linkedList.size(); i++) 
			{
				String str11 = (String) linkedList.get(i) + " ";
				fileWriter.write(str11);
				fileWriter.flush();
			}
		}
		System.out.println(linkedList.toString());
		buffer.close();
		scanner.close();
		fileWriter.close();
	} catch (Exception e) {
		e.printStackTrace();
	}	
}
public static Volt getVolt(SocketAdapter sockAdapter, int i) {
	switch (i)
	{
	case 3: return sockAdapter.get3Volt();
	case 12: return sockAdapter.get12Volt();
	case 120: return sockAdapter.get120Volt();
	default: return sockAdapter.get120Volt();
	}
}
public static void testObjectAdapter() {
	SocketAdapter sockAdapter = new SocketObjectAdapterImpl();
	Volt v3 = getVolt(sockAdapter,3);
	Volt v12 = getVolt(sockAdapter,12);
	Volt v120 = getVolt(sockAdapter,120);
	System.out.println("v3 volts using Object Adapter="+v3.getVolts());
	System.out.println("v12 volts using Object Adapter="+v12.getVolts());
	System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	
}

public static void testClassAdapter() {
	SocketAdapter sockAdapter = new SocketClassAdapterImpl();
	Volt v3 = getVolt(sockAdapter,3);
	Volt v12 = getVolt(sockAdapter,12);
	Volt v120 = getVolt(sockAdapter,120);
	System.out.println("v3 volts using Class Adapter="+v3.getVolts());
	System.out.println("v12 volts using Class Adapter="+v12.getVolts());
	System.out.println("v120 volts using Class Adapter="+v120.getVolts());
}


    public void addDoctor() throws ParseException, org.json.simple.parser.ParseException 
	{
    	Utility Utility=new Utility();
		
		FileReader reader;
		try {
			reader = new FileReader("C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\Doctor.json");
			JSONParser jsonParser = new JSONParser();
			Object obj1 = jsonParser.parse(reader);
			JSONArray jsonArray = (JSONArray) obj1;
		
		
		System.out.println("Enter number of doctors :");
		int num0fDoctor = Utility.inputInteger();
		for (int i = 0; i < num0fDoctor; i++)
		{
			JSONObject jsonObject = new JSONObject();
			System.out.println("Enter name of doctor");
			String doctorName = Utility.inputString();
			jsonObject.put("Doctor_Name", doctorName);

			System.out.println("Enter I.D doctor");
			int doctorId = Utility.inputInteger();
			jsonObject.put("Doctor_ID", doctorId);

			System.out.println("Enter Specialization of doctor");
			String doctorSpecialization = Utility.inputString();
			jsonObject.put("Doctor_Specialization", doctorSpecialization);

			System.out.println("Enter Availablity of doctor");
			String available = Utility.inputString();
			jsonObject.put("Doctor_Availiablity", available);

			jsonArray.add(jsonObject);
		}
		
			System.out.println("*************** Doctor Details ************");
			System.out.println();
		//	FileWriter jsonFileWriter = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addDoctor.json");
			PrintWriter printWriter = new PrintWriter("C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\Doctor.json");
			printWriter.print(jsonArray.toJSONString());
			printWriter.flush();
			printWriter.close();
			//jsonFileWriter.print(((JSONAware) jsonArray).toJSONString());
//			jsonFileWriter.flush();
//			jsonFileWriter.close();
			System.out.println("Doctor Added:" + jsonArray);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	/**
	 *  This method is used to add patient in JSON file.
	 * @throws ParseException 
	 */
	@SuppressWarnings("unchecked")
	public void addPatient() throws ParseException, org.json.simple.parser.ParseException {
		
		Utility Utility=new Utility();
		FileReader reader;
		try {
			
			reader = new FileReader("C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\addPatient.json");
			JSONParser jsonParser = new JSONParser();
			Object obj1 = jsonParser.parse(reader);
			JSONArray jsonArray = (JSONArray) obj1;
		
			System.out.println("Enter number of Patient");
			int numberOfPatient = Utility.inputInteger();
			
			for (int i = 0; i < numberOfPatient; i++)
			{
				JSONObject jsonObject = new JSONObject();
				System.out.println("Enter patient name :");
				String patientName = Utility.inputString();
				jsonObject.put("Patient_Name",patientName);
				System.out.println("Enter patient ID. :");
				int patientId = Utility.inputInteger();
				jsonObject.put("Patient_ID", patientId);
				System.out.println("Enter patient mobile number :");
				String patientMobNumber = Utility.inputString();
				jsonObject.put("Patient_MobileNumber", patientMobNumber);
				System.out.println("Enter patient age");
				int patientAge = Utility.inputInteger();
				jsonObject.put("Patient_Age", patientAge);
				jsonArray.add(jsonObject);
			}
		
				System.out.println("*************** Patient Details ************");
				System.out.println();
				FileWriter jsonFileWriter = new FileWriter(
						"C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\addPatient.json");
				jsonFileWriter.write(jsonArray.toString());
				jsonFileWriter.flush();
				jsonFileWriter.close();
				System.out.println("Pateint Added: " + jsonArray);
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	


	/**
	 *  This method is used to search doctors from JSON file.
	 */
	public void searchDoctor() {
		Utility Utility=new Utility();
		try {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\Doctor.json"));
			System.out.println("Search Doctor_Name :");
			String searchDoctor = Utility.inputString();
			Iterator<?> itr = jsonArray.iterator();

			while (itr.hasNext())
			{
				JSONObject object = (JSONObject) itr.next();
				String string = (String) object.get("Doctor_Name");
                                
				if (searchDoctor.equals(string))
				{
					System.out.println("Doctor_found" + object);
                                        break;
				} else
				{
					System.out.println("Not Found !");
                                        break;
				}
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	/**
	 * This method is used to search patient from JSON file.
	 */
	public void searchPatient() {

		Utility Utility=new Utility();
		System.out.println("Enter Name Of Patient");
		String searchPatient = Utility.inputString();
		try {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\addPatient.json"));
			Iterator<?> itr = jsonArray.iterator();

			while(itr.hasNext())
			{
				JSONObject jsonobject = (JSONObject) itr.next();
				String string = (String) jsonobject.get("Patient_Name");

				if (searchPatient.equals(string))
				{
					System.out.println("Patient_found " + jsonobject);
				} else 
				{
					System.out.println("Not found !");
				}
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public void Expression()
	{
		boolean flag=false;
	System.out.println("Enter expression: ");
	String exp = scanner.next();        
	int len = exp.length();
	/* Creating Stack */
	Stack stack = new Stack();
	
	System.out.println("Matches and Mismatches: ");

	for (int i = 0; i < len; i++)
	{    
	char ch = exp.charAt(i);

		if (ch == '(')
		{
		stack.push(i);
		}
			else if (ch == ')')
			{
				try
				{
				int p = (int) (stack.pop());
				System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
				flag=true;
				  
				}
				catch(Exception e)
				{
				System.out.println("')' at index "+(i+1)+" is unmatched");
				 
				}
			}  
		
		}
	if(!stack.isEmpty())
	{
			flag=false;
			if(flag==false)
			{
				System.out.println("')'  is unmatched");
			System.out.println("false");
			}
	} 
	else
	{
		System.out.println("true");
	
	}
          
}


	/**
	 * This method is used to take appointment.
	 */
	@SuppressWarnings("unchecked")

	public static void fixAppointment() 
	{
		try 
		{
			File file1 = new File(
					"C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\Doctor.json");
			File file2 = new File(
					"C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\addPatient.json");

			File file3 = new File("C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\appointment.json");

			// check for existence of all files
			if (file1.exists() && file2.exists() && file3.exists() && file1.canRead() && file2.canRead() && file3.canRead()  && file3.canWrite()) 
			{

				Utility Utility=new Utility();
				JSONParser parser = new JSONParser();
				fileReader = new FileReader(file1);
				JSONArray doctorsarray = (JSONArray) parser.parse(fileReader);
				// System.out.println(""+doctorsarray.size());
				
				JSONParser parser1=new JSONParser();
				fileReader=new FileReader(file2);
				JSONArray patientArray=(JSONArray) parser1.parse(fileReader);

				Iterator<?> iterator = doctorsarray.iterator();

				System.out.println("****Doctor's Details****");
				while (iterator.hasNext()) {
					JSONObject object = (JSONObject) iterator.next();
					// System.out.println(""+object.size());
					System.out.println("Doctor's Name : " + object.get("Doctor_Name"));
					System.out.println("Doctor's Id   : " + object.get("Doctor_ID"));
					System.out.println("Speciality    : " + object.get("Doctor_Specialization"));
					System.out.println("Availability  : " + object.get("Doctor_Availability"));
					System.out.println("\n");
				}
				System.out.println("Enter Doctor ID to assign to a patient:");
				String doctorId=Utility.inputString();
				//System.out.println("Entered ID: "+doctorId);
				
				Iterator<?> iterator1=doctorsarray.iterator();
				
				while(iterator1.hasNext())
				{
					JSONObject object1=(JSONObject) iterator1.next();
					//System.out.println("Drs. Id"+object1.get("Doctor'sId"));
					JSONArray jsonArray = (JSONArray) object1.get("patient");
					if(doctorId.equals(object1.get("doctorId")))
					{
						if(jsonArray.size()<=2){
							
							System.out.println("Enter Patient ID to take an appointment:");
							String patientId=Utility.inputString();
							
							Iterator<?> iterator2=patientArray.iterator();
							while(iterator2.hasNext())
							{
								JSONObject object2=(JSONObject) iterator2.next();
								if(patientId.equals(object2.get("PatientId"))){
									
									jsonArray.add(object2);
									break;
								}
							}
							
						}
                                                else
                                                {
                                                    System.out.println("Appointment is full");
                                                }
					}
									
				}
				System.out.println(doctorsarray);
				/*fileWriter = new FileWriter(file1);
				fileWriter.write(JSONArray.toJSONString(doctorsarray));
				fileWriter.flush();
				fileWriter.close();*/
			} else {
				System.out.println("File not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

        
        public static void displayCliniqueDetails() {
		
			try
			{
 			File file = new File("C:\\Users\\PUSHPA\\Documents\\NetBeansProjects\\Office Work\\src\\com\\bridgeit\\DesignPattern\\Doctor.json");
			if(file.exists())
			{
			if(file.canRead() && file.canWrite())
			{
			FileReader fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray array = (JSONArray) parser.parse(fr);
			Iterator <?>itr = array.iterator();
			
			
			System.out.println("****Doctor's Details****"+ "\n");

			while (itr.hasNext())
			{
			JSONObject obj = (JSONObject) itr.next();
			System.out.println("Name : "+obj.get("Doctor_Name")+ "\n"+ "Doctor'sId : "+obj.get("Doctor_ID")+"\n"+"Specialization : "+obj.get("Doctor_Specialization")+"\n"+"Availability : "+obj.get("Doctor_Availability"));
			System.out.println("\n");
			}
			}
			else
			{
			System.out.println("File can't have read permissions.");
			}
			}
			else
			{
			System.out.println("File does not exits on disk.");
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			
			}

        public static void addNewPerson() {
        	Utility Utility=new Utility();
    		try {
    			file = new File("/home/bridgeit/Desktop/Files Folder/addressBook.json");
    			if (file.exists()) {

    				if (file.canRead() && file.canWrite()) {
    					fileReader = new FileReader(file);
    					JSONParser parser = new JSONParser();
    					JSONArray array = (JSONArray) parser.parse(fileReader);

    					JSONObject json = new JSONObject();

    					System.out.println("Enter First Name:");
    					String firstname = Utility.inputString();
    					// System.out.println("firstname"+firstname);

    					System.out.println("Enter Last Name:");
    					String lastname = Utility.inputString();
    					// System.out.println("lastname"+lastname);

    					System.out.println("Enter Address:");
    					String address = Utility.inputString();
    					// System.out.println("address"+address);

    					System.out.println("Enter City:");
    					String city = Utility.inputString();
    					// System.out.println("city"+city);

    					System.out.println("Enter State:");
    					String state = Utility.inputString();
    					// System.out.println("state"+state);

    					System.out.println("Enter ZIP Code:");
    					String zip = Utility.inputString();
    					// System.out.println("zip"+zip);

    					System.out.println("Enter Mobile Number:");
    					String mobile = Utility.inputString();
    					// System.out.println("mobile"+mobile);

    					Map<String, String> map = new HashMap<>();

    					json.put("Firstname", firstname);
    					json.put("Lastname", lastname);
    					json.put("Address", address);
    					json.put("City", city);
    					json.put("State", state);
    					json.put("Zip", zip);
    					json.put("Mobile", mobile);

    					array.add(json);

    					System.out.println("Your details added Successfully." + "\n");
    					fileWriter = new FileWriter(file);
    					fileWriter.write(JSONArray.toJSONString(array));
    					fileWriter.flush();
    					fileWriter.close();
    				}

    				else {
    					System.out.println("Cannot read and write to file");
    				}
    			} else {
    				System.out.println("File not exits..");
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}

    	/**
    	 * This method is to edit details of person in Address Book
    	 */
    	public static void editInformation() {
    		
    			Utility Utility=new Utility();
    			try {
    				file = new File("/home/bridgeit/Desktop/Files Folder/addressBook.json");
    				if (file.exists()) {
    					if (file.canRead() && file.canWrite()) {
    						fileReader = new FileReader(file);
    						JSONParser parser = new JSONParser();
    						JSONArray array = (JSONArray) parser.parse(fileReader);

    						Iterator<?> iterator = array.iterator();
    						System.out.println("Enter the Name of person you want to edit details:");
    						String name = Utility.inputString();
    						boolean check = false;
    						while (iterator.hasNext()) {
    							JSONObject object = (JSONObject) iterator.next();
    							if (object.get("Firstname").equals(name)) {
    								System.out.println("What you want to edit in Address Book?" + "\n" + "Lastname" + "\n"
    										+ "Address" + "\n"+ "Firstname"+ "\n"+ "City" + "\n" + "State" + "\n" + "Zip" + "\n"+"Mobile Number"+"\n");
    								String edit = Utility.inputString();
    								System.out.println("Enter the new " + edit + " to update.");

    								String update = Utility.inputString();
    								object.remove(edit);
    								object.put(edit, update);
    								System.out.println("Edited Information Successfully.");
    								check = true;
    								break;
    							}
    						}
    						if (check == false) {
    							System.out.println("Person not found in Address Book" + "\n");
    						}
    						fileWriter = new FileWriter(file);
    						fileWriter.write(JSONArray.toJSONString(array));
    						fileWriter.flush();
    						fileWriter.close();
    					} else {
    						System.out.println("Cannot edit a File");
    					}
    				} else {
    					System.out.println("File not exist..");
    				}

    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    	

    	/**
    	 * This method is to Delete person from addressBook
    	 */
    	public static void deletePerson() 
    		{
    			Utility Utility=new Utility();
    			try {
    				file = new File("/home/bridgeit/Desktop/Files Folder/addressBook.json");
    				if (file.exists()) {
    					if (file.canRead()) {
    						fileReader = new FileReader(file);
    						JSONParser parser = new JSONParser();
    						JSONArray array = (JSONArray) parser.parse(fileReader);

    						System.out.println("Enter the user");
    						String name = Utility.inputString();

    						Iterator<?> iterator = array.iterator();
    						boolean check = false;
    						while (iterator.hasNext()) {
    							JSONObject jsonObject = (JSONObject) iterator.next();

    							if (jsonObject.get("Firstname").equals(name)) {
    								array.remove(jsonObject);
    								System.out.println("Deleted Successfully." + "\n");
    								check = true;
    								break;
    							}
    						}
    						if (check == false) {
    							System.out.println("Person do not exist in Address Book." + "\n");
    						}
    						if (file.canWrite()) {
    							fileWriter = new FileWriter(file);
    							fileWriter.write(JSONArray.toJSONString(array));
    							fileWriter.flush();
    							fileWriter.close();
    						} else {
    							System.out.println("Do not read/write permission");
    						}
    					}
    				} else {
    					System.out.println("File not exits..");
    				}
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}
    

    	/**
    	 * This method is to print the Address Book
    	 */
    	public static void printAddressBook() {
    		
    			try {
    				file = new File("/home/bridgeit/Desktop/Files Folder/addressBook.json");
    				if (file.exists()) {
    					if (file.canRead() && file.canWrite()) {
    						fileReader = new FileReader(file);
    						JSONParser parser = new JSONParser();
    						JSONArray array = (JSONArray) parser.parse(fileReader);
    						Iterator iterator = array.iterator();
    						System.out.println("\n" + "****Address Book****");

    						while (iterator.hasNext()) {
    							JSONObject obj = (JSONObject) iterator.next();
    							System.out.println("\n" + "***Person Details***");
    							System.out.println("First Name : " + obj.get("Firstname"));
    							System.out.println("Last Name  : " + obj.get("Lastname"));
    							System.out.println("Address    : " + obj.get("Address"));
    							System.out.println("City       : " + obj.get("City"));
    							System.out.println("State      : " + obj.get("State"));
    							System.out.println("Zip        : " + obj.get("Zip"));
    							System.out.println("Mobile     : " + obj.get("Mobile"));
    						}
    					} else {
    						System.out.println("Cannot have read permission" + "\n");
    					}
    				} else {
    					System.out.println("Filenot exist.." + "\n");
    				}
    			} catch (Exception e) {
    				e.printStackTrace();
    			}
    		}

    	
    	public void deposit(int cash) throws IOException {
    		Utility Utility=new Utility();

    		// Utility.getDetails();
    		System.out.println("Available balance:" + cash);
    		System.out.println("Enter amount to deposit");
    		int amount = Utility.inputInteger();
    		cash = cash + amount;
    		System.out.println("Transaction sucessfull!!!");
    		System.out.println("Available balance: " + cash);
    	}

    	/**
    	 * This method is to withdraw amount from account
    	 * 
    	 * @param cash
    	 * @throws IOException 
    	 */
    public  void withdraw(int cash) throws IOException {
    	Utility Utility=new Utility();
    		// Utility.getDetails();
    		System.out.println("Available balance:" + cash);
    		System.out.println("Enter amount to withdraw");
    		int amount = Utility.inputInteger();
    		if (amount <= cash) {
    			cash = cash - amount;
    			System.out.println("Transaction sucessfull!!!");
    		} else
    			System.out.println("Balance is less !!! \n Cannot do transaction");
    		System.out.println("Available balance: " + cash);
    	}
    
    public static void companyShares() throws IOException, org.json.simple.parser.ParseException {
    	Utility Utility=new Utility();
		// TODO Auto-generated method stub
		file = new File("/home/bridgeit/Desktop/Files Folder/companyShares.json");
		fileReader = new FileReader(file);

		// initialize JSon parser
		JSONParser parser = new JSONParser();

		// create a JSon array parse the file
		JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
		// System.out.println(jsonArray.size());

		// create a JSon object
		JSONObject jsonObject = new JSONObject();

		System.out.println("Enter Your Share symbol ex:'@','#','$':");
		String ShareSymbol = Utility.inputString();
		jsonObject.put("ShareSymbol", ShareSymbol);

		System.out.println("Enter price of share:");
		int price = Utility.inputInteger();
		jsonObject.put("SharePrice", price);

		System.out.println("Enter number of Shares you want to purchase:");
		int shareCount = Utility.inputInteger();
		jsonObject.put("ShareCount", shareCount);

		jsonArray.add(jsonObject);

		fileWriter = new FileWriter(file);
		// writing back JSon file to JSonArray
		fileWriter.write(JSONValue.toJSONString(jsonArray));
		fileWriter.flush();
		fileWriter.close();
	}

	/**
	 * This method is to create a user.
	 * 
	 * @throws IOException
	 * @throws ParseException
	 * @throws org.json.simple.parser.ParseException
	 * @throws org.json.simple.parser.ParseException
	 * @throws Throwable
	 */

	public static void create() throws IOException, ParseException,org.json.simple.parser.ParseException {
		
		Utility Utility=new Utility();
		boolean checkUser = true;

		file = new File("/home/bridgeit/Desktop/Files Folder/userDetails.json");
		
		fileReader = new FileReader(file);

		// initialize JSon parser
		JSONParser parser = new JSONParser();

		// create a JSon array parse the file
		JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
		// System.out.println(jsonArray.size());

		// create a JSon object
		JSONObject jsonObject = new JSONObject();

		// input values from user add to JSOn object
		System.out.println("Enter First Name");
		String name = Utility.inputString();
		jsonObject.put("userName", name);

		System.out.println("Enter Number of Shares");
		String numberOfShare = Utility.inputString();
		jsonObject.put("numberOfShare", numberOfShare);

		System.out.println("Enter your balance");
		String balance = Utility.inputString();
		jsonObject.put("balance", balance);

		// all values of object adding to JSOn array
		jsonArray.add(jsonObject);

		if (checkUser) {
			fileWriter = new FileWriter(file);
			// writing back JSon file to JSonArray
			fileWriter.write(jsonArray.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		}
	}

	/**
	 * This method is to buy share
	 * 
	 * @throws IOException
	 * @throws org.json.simple.parser.ParseException
	 */
	public static void buyShare() throws IOException,org.json.simple.parser.ParseException {
		Utility Utility=new Utility();
		// TODO Auto-generated method stub
		File file1 = new File(
				"/home/bridgeit/Desktop/Files Folder/userDetails.json");

		File file2 = new File("/home/bridgeit/Desktop/Files Folder/companyShares.json");

		// check for the existence of the file
		if (file1.exists() && file2.exists()) {

			// Reading userDetails file
			fileReader = new FileReader(file1);
			JSONParser parser = new JSONParser();
                       
			JSONArray userDetails = (JSONArray) parser.parse(fileReader);
			// System.out.println(""+userDetails);

			// Reading shares file
			fileReader = new FileReader(file2);
			JSONParser parser1 = new JSONParser();
			JSONArray shares = (JSONArray) parser1.parse(fileReader);
			// System.out.println("" +shares);

			// for userDeatils.json
			Iterator<?> iterator = userDetails.iterator();

			// for companyShares.json
			Iterator<?> iterator1 = shares.iterator();

			System.out.println("Enter your name Existing User:");
			String name = Utility.inputString();

			// check in user details for next
			while (iterator.hasNext()) {

				// JSON object for userDeatils
				JSONObject object = (JSONObject) iterator.next();

				if (object.get("userName").equals(name)) {
					// System.out.println(""+object.get("userName"));

					System.out.println("Enter your share symbol you want to buy:[@,#,$,!]");
					String symbol = Utility.inputString();
					object.put("ShareSymbol", symbol);

					Stack stack = new Stack();
					stack.push(symbol);
					// System.out.println("Stack symbol" +stack);

					// Check in company Shares share symbol
					while (iterator1.hasNext()) {

						// created object1 for Company Shares
						JSONObject object1 = (JSONObject) iterator1.next();

						if (object1.get("ShareSymbol").equals(symbol)) {
							// System.out.println(""+object.get("ShareSymbol"));

							System.out.println("Enter number of shares you want to buy:");
							int buy = Utility.inputInteger();

							// get balance from user
							int balance = Integer.parseInt(object.get("balance").toString());
							// System.out.println("userbalance"+" "+balance);

							// get price from company share
							int price = Integer.parseInt(object1.get("price").toString());
							// System.out.println("company shareprice"+"
							// "+price);

							// get number of share user have
							int numberOfShare = Integer.parseInt(object.get("numberOfShare").toString());
							// System.out.println("number of share user have"+"
							// "+numberOfShare);

							// get share count company have
							int shareCount = Integer.parseInt(object1.get("shareCount").toString());
							// System.out.println("shareCountcompany"+"
							// "+shareCount+"\n");

							int newBalance = balance - (price * buy);
							// System.out.println("newBalance"+" "+newBalance);

							int updateNumberOfShare = numberOfShare + buy;
							// System.out.println("updateNumberOfShare"+"
							// "+updateNumberOfShare);

							int shareCountCompany = shareCount - buy;
							// System.out.println("shareCountCompany"+"
							// "+shareCountCompany);

							object.remove("balance");
							object.remove("numberOfShare");
							object.remove("shareCount");

							object.put("balance", newBalance);
							object.put("numberOfShare", updateNumberOfShare);
							object1.put("shareCount", shareCountCompany);

							LinkedList<String> queue = new LinkedList<String>();
							Date date = new Date();
							String currentDateTime = new SimpleDateFormat("E dd/MM/yyyy. 'at' hh:mm:ss a").format(date);
							queue.add(currentDateTime);
							System.out.println("Date and Time of Share Purchase:" + " " + currentDateTime + "\n");

						}

						fileWriter = new FileWriter(file1);
						// writing back JSon file to JSonArray
						fileWriter.write(JSONValue.toJSONString(userDetails));
						fileWriter.flush();
						fileWriter.close();
					}
					fileWriter = new FileWriter(file2);
					// writing back JSon file to JSonArray
					fileWriter.write(JSONValue.toJSONString(shares));
					fileWriter.flush();
					fileWriter.close();
				}
			}
		}
	}

	/**
	 * This method is to sell a share
	 * 
	 * @throws Throwable
	 */
	public static void sellShare() throws Throwable {
		Utility Utility=new Utility();
		File file1 = new File("/home/bridgeit/Desktop/Files Folder/userDetails.json");

		File file2 = new File("/home/bridgeit/Desktop/Files Folder/companyShares.json"
);

		// check for the existence of the file
		if (file1.exists() && file2.exists()) {

			// Reading userDetails file
			fileReader = new FileReader(file1);
			JSONParser parser = new JSONParser();
			JSONArray userDetails = (JSONArray) parser.parse(fileReader);
			// System.out.println(""+userDetails);

			// Reading shares file
			fileReader = new FileReader(file2);
			JSONParser parser1 = new JSONParser();
			JSONArray shares = (JSONArray) parser1.parse(fileReader);
			// System.out.println("" +shares);

			// for userDeatils.json
			Iterator<?> iterator = userDetails.iterator();

			// for companyShares.json
			Iterator<?> iterator1 = shares.iterator();

			System.out.println("Enter your name Existing User:");
			String name = Utility.inputString();

			// check in user details for next
			while (iterator.hasNext()) {

				// JSON object for userDeatils
				JSONObject object = (JSONObject) iterator.next();

				if (object.get("userName").equals(name)) {
					// System.out.println(""+object.get("userName"));

					System.out.println("Enter your share symbol you want to sell:[@,#,$,!]");
					String symbol = Utility.inputString();
					object.put("ShareSymbol", symbol);

					Stack stack = new Stack();
					stack.push(symbol);

					// Check in company Shares share symbol
					while (iterator1.hasNext()) {

						// created object1 for Company Shares
						JSONObject object1 = (JSONObject) iterator1.next();

						if (object.get("ShareSymbol").equals(symbol)) {
							// System.out.println(""+object.get("ShareSymbol"));
							
							System.out.println("Enter number of shares you want to sell:");
							int sell = Utility.inputInteger();

							// get balance from user
							int balance = Integer.parseInt(object.get("balance").toString());
							// System.out.println("Balance of User"+"
							// "+balance);

							// get number of share user have
							int numberOfShare = Integer.parseInt(object.get("numberOfShare").toString());
							// System.out.println("Number of share user have"+"
							// "+numberOfShare);

							// get price of share
							int price = Integer.parseInt(object1.get("price").toString());
							// System.out.println("Price per Share"+" "+price);

							// get share count company have
							int shareCount = Integer.parseInt(object1.get("shareCount").toString());
							// System.out.println("ShareCount of the company"+"
							// "+shareCount+"\n");

							int newBalance = balance + (price * sell);
							// System.out.println("NewBalance of user"+"
							// "+newBalance);

							int updateNumberOfShare = numberOfShare - sell;
							// System.out.println("updateNumberOfShare"+"
							// "+updateNumberOfShare);

							int shareCountCompany = shareCount + sell;
							// System.out.println("shareCountCompany"+"
							// "+shareCountCompany);

							object.remove("balance");
							object.remove("numberOfShare");
							object1.remove("shareCount");

							object.put("balance", newBalance);
							object.put("numberOfShare", updateNumberOfShare);
							object1.put("shareCount", shareCountCompany);

							LinkedList<String> queue = new LinkedList<String>();
							Date date = new Date();
							String currentDateTime = new SimpleDateFormat("E dd/MM/yyyy. 'at' hh:mm:ss a").format(date);
							queue.add(currentDateTime);
							System.out.println("Date and Time of Share sold:" + " " + currentDateTime + "\n");
							System.exit(sell);
							System.out.println("New Balance of"+name+ "is" +newBalance );
						}

						fileWriter = new FileWriter(file1);
						// writing back JSon file to JSonArray
						fileWriter.write(JSONValue.toJSONString(userDetails));
						fileWriter.flush();
						fileWriter.close();
					}
					fileWriter = new FileWriter(file2);
					// writing back JSon file to JSonArray
					fileWriter.write(JSONValue.toJSONString(shares));
					fileWriter.flush();
					fileWriter.close();
				}
			}
		}
	}

	/**
	 * This method is to display stock report
	 * 
	 * @throws IOException
	 * @throws org.json.simple.parser.ParseException
	 */
	public static <T> void displayReport() throws IOException, org.json.simple.parser.ParseException {
		File file1 = new File("/home/bridgeit/Desktop/Files Folder/userDetails.json");

		fileReader = new FileReader(file1);
		JSONParser parser = new JSONParser();
		JSONArray userDetails = (JSONArray) parser.parse(fileReader);
		
		Iterator<T> iterator = userDetails.iterator();
		System.out.println("\n" + "All user Detail Report:");
		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();
			System.out.println(object);
		}
	}
}


   
   

