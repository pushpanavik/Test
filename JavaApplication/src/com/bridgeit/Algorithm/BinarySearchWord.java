package com.bridgeit.Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
import java.io.*;

public class BinarySearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String strLine;
          boolean found=false;
           String inputSearch; 
           int pos=0;
		    Scanner scanner =new Scanner(System.in);
		    
		    FileInputStream fstream = new FileInputStream("/home/bridgeit/test/JavaApplication/src/com/bridgeit/Algorithm/file.txt");
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
           
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
            	
            	System.out.println(strLine);	
            }
            in.close();
	         
	          
	         
		        System.out.println("Enter the word to search");
		    inputSearch = scanner.nextLine();
		  
		 
	}
	}
}
