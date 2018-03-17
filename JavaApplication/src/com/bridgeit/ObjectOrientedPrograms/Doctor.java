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
  

  public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}
public String getTiming() {
	return timing;
}
public void setTiming(String timing) {
	this.timing = timing;
}
public String getAvailability() {
	return availability;
}
public void setAvailability(String availability) {
	this.availability = availability;
}
//toString method to print the details of the object
  @Override
  public String toString()
  {
    return "\nDoctor ID: "+this.getDocId()+" \nDoctor Name: "+this.getName()+" \nSpecialization: " +this.getSpecialization()+
    " \navailability: "+this.getAvailability()+" \nTiming:" +this.getTiming()+  "\n";
  }
}
