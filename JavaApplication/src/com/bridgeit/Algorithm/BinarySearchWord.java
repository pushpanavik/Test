package com.bridgeit.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.bridegit.Utility.Utility;
import java.io.*;

public class BinarySearchWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method st
		    StringBuilder sb = new StringBuilder();
	        String strLine = "";
	        List<String> list = new ArrayList<String>();
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("/home/bridgeit/test/JavaApplication/src/com/bridgeit/Algorithm/file.txt"));
	              while (strLine != null)
	               {
	                strLine = br.readLine();
	                sb.append(strLine);
	                sb.append(System.lineSeparator());
	                strLine = br.readLine();
	                if (strLine==null)
	                   break;
	                list.add(strLine);
	            }
	         System.out.println(Arrays.toString(list.toArray()));
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
		 
	}
	

