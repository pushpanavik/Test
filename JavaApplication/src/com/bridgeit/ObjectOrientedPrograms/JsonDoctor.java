package com.bridgeit.ObjectOrientedPrograms;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class JsonDoctor {
	public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
try {
	FileReader reader = new FileReader("/home/bridgeit/test/JavaApplication/src/com/bridegit/Utility/Files/addDoctor.json");
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray Doctorlist = (JSONArray) obj;
           System.out.println(Doctorlist+ " ");
             
            //Iterate over employee array
           int count=Doctorlist.size();
           for(int i=0;i<count;i++)
           {
        	   JSONArray array=Doctorlist.getJ
           }
 
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
