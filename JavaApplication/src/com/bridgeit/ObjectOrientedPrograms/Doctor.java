package com.bridgeit.ObjectOrientedPrograms;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PUSHPA
 */
public class Doctor {
    //declare the Datamembers of doctor
  public String docId,name,specialization,timing;
public String availability;
  Map<Date,Integer> appointmentCount = new HashMap<Date,Integer>();
  ArrayList<String> patientsList = new ArrayList<String>();

  //Constructor to initialize the datamembers
  public Doctor()
  {
  
  }
  Doctor(String id,String dname,String spec, String availa,String timing)
  {
    docId = id;
    name = dname;
    specialization = spec;
    availability = availa;
    timing=timing;
  }

  //toString method to print the details of the object
  @Override
  public String toString()
  {
    return "\nDoctor ID: "+docId+" \nDoctor Name: "+name+" \nSpecialization: " +specialization+
    " \navailability: "+availability+" \nTiming:" +timing+  "\n";
  }
}
