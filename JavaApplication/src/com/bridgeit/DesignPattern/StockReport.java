package com.bridgeit.DesignPattern;

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
		int valueforstock;
		int total_stock=0;
		JSONObject obj=new JSONObject();
		JSONObject allinone=new JSONObject();
		JSONObject totalstock=new JSONObject();
		
		//JSONArray array=new JSONArray();
		System.out.println("Enter number of stock");
		int report=scanner.nextInt();
		String str[]=new String[report];
		for (int i=0;i<report;i++)
		{
			System.out.println("Enter the Stock Name");
			Name=scanner.next();
			allinone.put("Stock Name",Name);
			//obj.put("Stock",allinone);
			
			System.out.println("Enter the Number of share");
			No_share=util.inputInteger();
			allinone.put("Share Price", No_share);
			//obj.put("Stock",allinone);

			System.out.println("Enter Price of share");
			Share_price=util.inputInteger();

			allinone.put("Price", Share_price);
			//obj.put("Stock",allinone);
			
			//System.out.println("Value for stock is");
			valueforstock=No_share*Share_price;
			total_stock+=valueforstock;
			
			allinone.put("each_stock_value",valueforstock);
			
			obj.put("Stock"+i,allinone);	
			System.out.println();
		}
			
		try {
			FileWriter file=new FileWriter("/home/bridgeit/Desktop/Files Folder/Stock.json");
			{
				file.write(obj.toJSONString());
				file.flush();
				file.close();
			}
			System.out.print("Total stock price is: "+total_stock+ " ");
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
