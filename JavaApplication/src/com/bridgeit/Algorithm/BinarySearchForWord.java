package com.bridgeit.Algorithm;
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.bridegit.Utility.Utility;

public class BinarySearchForWord {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			Utiltity utility=new Utility();
			String words[]={},search;
			Scanner scanner=new Scanner(System.in);;
			words =u.readFile("/home/bridgeit/test/JavaApplication/src/com/bridegit/Utility/Files/StringFile");
			System.out.println("Enter word to search");
			search=scanner.next();
			Utility.bubblesortString(words);
			int index = Utility.binarysearchstring(search, words, 0, words.length);
			   if(index <0)
			   {
				   System.out.println("Element not found");
			   }
			   else
			   {
				   System.out.println("found at index " + index);
			   }
			   scanner.close();
		}

}
}
	
