package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridegit.Utility.Utility;

public class StockReport {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Utility util=new Utility();
		String Name;
		int  No_share;
		int value_of_each_stock;
		int  total;
		int Share_price;
		JSONObject obj=new JSONObject();
		JSONObject allinone=new JSONObject();
		
		//JSONArray array=new JSONArray();
		System.out.println("Enter number of stock");
		int report=scanner.nextInt();
		String str[]=new String[report];
		for (int i=0;i<report;i++)
		{
			System.out.println("Enter the Stock Name");
			Name=scanner.next();
			allinone.put("Stock Name",Name);
			obj.put("Stock",allinone);
			
			System.out.println("Enter the Number of share");
			No_share=util.inputInteger();
			allinone.put("Share Price", No_share);
			obj.put("Stock",allinone);

			System.out.println("Enter the Share Price");
			Share_price=util.inputInteger();

			allinone.put("Share Price", Share_price);
			obj.put("Stock",allinone);
			
			System.out.println();
			value_of_each_stock=No_share*Share_price;
			obj.put("Stock",allinone);
			
			for(int k=0;i<report;i++)
			{
				
			}
			 
		}

		try {
			FileWriter file=new FileWriter("/home/bridgeit/Desktop/Files Folder/Stock.json");
			{
				file.write(obj.toJSONString());
				file.flush();
				file.close();
			}
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
