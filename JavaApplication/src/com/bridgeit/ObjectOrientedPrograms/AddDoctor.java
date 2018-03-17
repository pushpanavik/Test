package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class AddDoctor {

	public static void main(String[] args) {
		 
		JSONArray Doctor=new JSONArray();
		JSONObject Doctorobj=new JSONObject();
		Doctor.add( "Doctor,Doctorobj");
		Doctorobj.put("Doctor ID", "D101");
		Doctorobj.put("Doctor Name", "Pushpa Navik");
		Doctorobj.put("Specialization"," Cardiologist");
		Doctorobj.put("Availability","Monday");
		Doctorobj.put("Timing", "5-8pm");
		
		/*JSONObject Doctorlist=new JSONObject();
		Doctorlist.put("Clinique", "Doctor");*/
		
		try
		{
			FileWriter filewriter=new FileWriter("/home/bridgeit/test/JavaApplication/src/com/bridegit/Utility/Files/addDoctor.json");
			filewriter.write(Doctor.toJSONString());
			filewriter.flush();
			System.out.println("Successfully writen");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
