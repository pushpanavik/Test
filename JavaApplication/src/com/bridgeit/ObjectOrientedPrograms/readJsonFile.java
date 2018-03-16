package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readJsonFile {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		JSONParser parser=new JSONParser();
		try
		{
			 Object obj = parser.parse(new FileReader(
	                   "/home/bridgeit/test/JavaApplication/src/com/bridgeit/DataStructurePrograms/doctorrr.json"));
	 
	            JSONObject jsonObject = (JSONObject) obj;
			JSONArray  arrayobj=(JSONArray) jsonObject.get("Doctor");
			Iterator<String> iter=arrayobj.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
			
			System.out.println("file successfully read");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
