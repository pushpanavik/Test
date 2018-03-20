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
			Utility utility=new Utility();
			String words[]={},search;
			Scanner scanner=new Scanner(System.in);
			String filepath="/home/bridgeit/Desktop/Files Folder/StringFile";
			
			 
			FileReader fr=new FileReader("/home/bridgeit/Desktop/Files Folder/StringFile");
			BufferedReader br=new BufferedReader(fr);
			String line=" ";
			while((line=br.readLine())!=null)
			{
				System.out.println(line/*.split(",").toString()*/);
			}
			System.out.println("Enter word to search");
			search=scanner.next();
			words =utility.readFile(filepath);
			
		}

}

	
