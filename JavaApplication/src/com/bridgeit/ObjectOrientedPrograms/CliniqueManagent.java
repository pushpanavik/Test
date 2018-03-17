package com.bridgeit.ObjectOrientedPrograms;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridegit.Utility.Utility;

/**
 *
 * @author PUSHPA
 */
public class CliniqueManagent {
   public static void main(String args[]) throws ParseException, org.json.simple.parser.ParseException
  {
	   JSONObject DoctorObject=new JSONObject();
	   JSONArray jsonarray=new JSONArray();
	   JSONObject object2=new JSONObject();
	   JSONParser parser=new JSONParser();
	  Utility util=new Utility();
    //Initializing all the variables
    Scanner scan = new Scanner(System.in);
    Doctor doc=new Doctor();
    Patient pat=new Patient();;
    String name,id="",mobno,spec,availa,dateString,timing;
    int age,choice,searchChoice,flag=0,flag1=0;
    Date date;

    

    //Creating an object of ClinicManagement class
    CliniqueManagent CM = new CliniqueManagent();

    //Creating an object of Appointment class
    Appointment appoint = new Appointment();

    //Creating an arraylist of Doctors and Patients
    ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
    ArrayList<Patient> patientList = new ArrayList<Patient>();

    
    
    do {
      System.out.println("\n--------------------\nEnter your choice\n1:Add Doctor+ \n2:Add Patient"
      +"\n3:Print all Doctor's records \n4:Print all Patient's records \n5:Search Doctor \n6:Search Patient "
      +"\n7:Set Appointment\n8:Print all appointments \n9:Exit");
      choice = scan.nextInt();

      switch(choice)
      {
        case 1:       //Adding a new Doctor to the ArrayList
        	
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
        		
       		try {
      		
         	FileWriter filewriter=new FileWriter("/home/bridgeit/test/JavaApplication/src/com/bridgeit/DataStructurePrograms/doctorrr.json");
            	//FileWriter filewriter1=new FileWriter("/home/bridgeit/Desktop/Files Folder/");
            
        System.out.println("Enter the Doctor ID, Name, Specialization, Availability and Timing");
        id = scan.next();
        jsonarray.add("Doctor ID"+id );
        name = scan.next().toUpperCase();
        jsonarray.add("Doctor Name"+name);
        spec = scan.next();
        jsonarray.add("Specialization"+spec);
        availa = scan.next();
        jsonarray.add("Availability"+availa);
        timing=scan.next();
        jsonarray.add("Timing"+timing);

        doc = new Doctor(id,name,spec,availa,timing); //passing value in the object from constructor
        doctorList.add(doc);
        DoctorObject.put("Doctor", jsonarray);
        arrayobj.
     
        
        filewriter.write(DoctorObject.toJSONString());
        filewriter.flush();
        filewriter.close();

        System.out.println("Successfully Copied JSON Object to File...");
		System.out.println("\nJSON Object: " + DoctorObject);
        	}
        catch (IOException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
        break;

       case 2:      //Adding a new Patient to the ArrayList
        JSONObject Patient=new JSONObject();
        JSONObject patientobject=new JSONObject();
        try {
        	FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/Files Folder/Patient.json");
        System.out.println("Enter the Patient ID, Name, Age and Mobile number");
        id = scan.next();
        patientobject.put("Patient Id"+0, id);
        name = scan.next().toUpperCase();
        patientobject.put("Patient Name"+id, name);
        age = scan.nextInt();
        patientobject.put("Patient age"+id, age);
        mobno = scan.next();
        patientobject.put("Patient Mobile_Number"+id, mobno);

        pat = new Patient(id,name,mobno,age);
        patientList.add(pat);
        Patient.put("Patient", patientobject);

        filewriter.write(Patient.toJSONString());
        filewriter.flush();
        filewriter.close();

       // System.out.println("Successfully Copied JSON Object to File...");
		System.out.println("\nJSON Object: " + Patient);
        	}
        catch(IOException e)
        {
        	e.printStackTrace();
        }
        break;

        case 3:
        	util.printDoctorRecords();    //Prints all the details of Doctor available in
        break;

        case 4:
        	
        util.printPatientRecords();        //Prints all the details of Patient available in
        break;

        case 5:                                     //Searches Doctor by ID, Name, Availability and Specialization
        do {
          System.out.println("\n------------\nSearch Doctor\n1:By Name \n2:By ID \n"
          +"3:By Specialization\n4:By Availability\n5: By Timing\n6. Exit");
          searchChoice = scan.nextInt();
          switch(searchChoice)
          {
            case 1:                               //Searches Doctor by Name
            System.out.println("Enter the Name of the Doctor");
            name = scan.next().toUpperCase();
            util.findDoctorByName(doctorList,name);
            break;

            case 2:                               //Searches Doctor by ID
            System.out.println("Enter the ID of the Doctor");
            id = scan.next();
            util.findDoctorByID(doctorList,id);
            break;

            case 3:                               //Searches Doctor by Specialization
            System.out.println("Enter the Specialization of the Doctor");
            spec = scan.next();
            util.findDoctorBySpec(doctorList,spec);
            break;

            case 4:                               //Searches Doctor by Availability
            System.out.println("Enter the Availability of the Doctor");
            spec = scan.next();
            util.findDoctorByAvaila(doctorList,spec);
            break;
            case 5:
            	System.out.println("Enter the timing of the Doctor");
               timing = scan.next();
            case 6 :
            System.exit(0);
            default:
            System.out.println("Enter a valid choice");
          }
        } while ( searchChoice!=5);
        break;

        case 6:    //Searches Patient by Name, ID, Mobile Number
        do {
          System.out.println("\n------------\nSearch Patient\n1:By Name \n2:By ID \n3:By Mobile"
          +" Number");
          searchChoice = scan.nextInt();
          JSONObject SearchPatient=new JSONObject();
          JSONObject By_Name=new JSONObject();
          JSONObject By_ID=new JSONObject();
          
         
          switch(searchChoice)
          {  
            case 1:       //Searches Patient by Name
            	try {
            		FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/Files Folder/SearchPatient.json");
            System.out.println("Enter the Name of the Patient");
            name = scan.next().toUpperCase();
            By_Name.put("By Name", name);
            util.findPatientByName(patientList,name);
            SearchPatient.put("Patient By Name", By_Name);
            filewriter.write(SearchPatient.toJSONString());
            filewriter.flush();
            filewriter.close();

          //  System.out.println("Successfully Copied JSON Object to File...");
    		System.out.println("\nJSON Object: " + SearchPatient);
            	}
            	catch(IOException e)
            	{
            		e.printStackTrace();
            	}
            break;

            case 2: //Searches Patient by ID
                  	try {
            		FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/Files Folder/SearchPatient.json");
            System.out.println("Enter the ID of the Patient");
            id = scan.next();
            By_ID.put("Patient_ID", id);
            util.findPatientByID(patientList,id);
            SearchPatient.put("Patient By ID", By_ID);
            filewriter.write(SearchPatient.toJSONString());
            filewriter.flush();
            filewriter.close();
            System.out.println("\nJSON Object: " + SearchPatient);
            }
            	catch(IOException e)
            	{
            		e.printStackTrace();
            	}
            break;

            case 3:                             //Searches Patient by Mobile Number
            		JSONObject By_MobileNo=new JSONObject();
            	try {
            		FileWriter filewriter=new FileWriter("/home/bridgeit/Desktop/Files Folder/SearchPatient.json");
            System.out.println("Enter the Mobile Number of the Patient");
            mobno = scan.next();
            By_MobileNo.put("By_MobileNumber", mobno);
            util.findPatientByMobNo(patientList,mobno);
            filewriter.write(SearchPatient.toJSONString());
            filewriter.flush();
            filewriter.close();
            System.out.println("\nJSON Object: " + SearchPatient);
            }
            	catch(IOException e)
            	{
            		e.printStackTrace();
            	}
            break;

            case 4:
            System.exit(0);
            default:
            System.out.println("Enter a valid choice");
          }
        } while ( searchChoice!=4);
        break;

        case 7 : //Sets up appointment for patient by getting Doctor name, patient ID and Date
        
        System.out.println("Enter the Doctor name");
        name = scan.next().toUpperCase();
        
        System.out.println("Enter the Patient ID");
        id = scan.next();
        System.out.println("Enter the date");
        dateString = scan.next();
        DateFormat format = new SimpleDateFormat("dd/MM/yy");
        date = format.parse(dateString); 

        Iterator docIter = doctorList.iterator();
        Iterator patIter = patientList.iterator();
        Doctor d = null;
        while(docIter.hasNext())
        {
          d = (Doctor)docIter.next();
          if(d.name.equalsIgnoreCase(name))
          {
            flag = 1;
            break;
          }
        }
        if(flag ==1)
        {
          while(patIter.hasNext())
          {
            Patient p = (Patient)patIter.next();
            if(p.patId.equalsIgnoreCase(id))
            {
              appoint.setAppointment(date,d,p);         //Set appointment function from Appointment class is called
              flag1=1;
            }
          }
        }
        if(flag == 0)
        {
          System.out.println("\nDoctor not found");
        }
        if(flag1 == 0)
        {
          System.out.println("\nPatient not found");
        }

        break;
        case 8:
        System.out.println("\nAppointments: ");
        appoint.printAllAppointments();
        break;

        case 9:                                 //Exit case
        System.out.println("\nThank You!");
        System.exit(0);

        default:
        System.out.println("Enter a valid choice");
      
   }
    } while (choice != 9);
  
  } 
  
}