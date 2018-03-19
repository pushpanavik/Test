package com.bridgeit.DataStructurePrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class HashTable {
public static void main(String ars []) throws FileNotFoundException
{
	File fileOne = new File("/home/bridgeit/Desktop/Files Folder/Number");
    
    Scanner scan = new Scanner(fileOne);
    Scanner read = new Scanner(System.in);
    scan.useDelimiter(" ");
   int temp;

    HashChaining HC = new HashChaining(11);
    Map <Integer,Integer>map=new HashMap<>();

     try{
     while( read.hasNext() )
     {	
    	
       //temp = scan.nextInt();
       //int index=temp%11;
       map.put(1,2);
     }
     Set set=map.entrySet(); //converting it to set so that we can traverse
     Iterator iter=set.iterator();
     while(iter.hasNext())
     {
    	 Map.Entry entry=(Entry) iter.next();
    	 System.out.println(entry.getKey()+ "" +entry.getValue());
     }
     }
     catch(Exception e)
     {
    	 e.printStackTrace();
     }
}
}