package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject();
		JSONObject wheatobj=new JSONObject();
		JSONObject pulsesobj=new JSONObject();
		JSONObject riceobj=new JSONObject();
		JSONArray array=new JSONArray();
		Scanner scanner=new Scanner(System.in);
		int varieties;
		String Name;
		String Weight;
		String price_per_kg;
		System.out.println("Enter the how many varieties you want");
		varieties=scanner.nextInt();
		for(int i=0;i<varieties;i++)
		{
			System.out.println("Enter Wheat Name");
			Name=scanner.next();
			wheatobj.put("Name", Name);
			System.out.println("Enter Weight");
			Weight=scanner.next();
			wheatobj.put("Weight", Weight);
			System.out.println("Enter price per kg");
			price_per_kg=scanner.next();
			wheatobj.put("price_per_kg", price_per_kg);
		
		obj.put("Varieties_of_wheat",wheatobj);
		}
		for(int i=0;i<varieties;i++)
		{
			System.out.println("Enter Pulses Name");
			Name=scanner.next();
			pulsesobj.put("Name", Name);
			System.out.println("Enter Weight");
			Weight=scanner.next();
			pulsesobj.put("Weight", Weight);
			System.out.println("Enter price per kg");
			price_per_kg=scanner.next();
			pulsesobj.put("price_per_kg", price_per_kg);
		
		obj.put("Varieties_of_pulses",pulsesobj);
		}
		for(int i=0;i<varieties;i++)
		{
			System.out.println("Enter Rice Name");
			Name=scanner.next();
			riceobj.put("Name", Name);
			System.out.println("Enter Weight");
			Weight=scanner.next();
			riceobj.put("Weight",Weight);
			System.out.println();
			System.out.println("Enter price per kg");
			price_per_kg=scanner.next();
			riceobj.put("price_per_kg",price_per_kg);
		
		obj.put("Varieties_of_rice",riceobj);
		}
		
		
		try {
			FileWriter file=new FileWriter("/home/bridgeit/Desktop/Files Folder/abc.json");
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
