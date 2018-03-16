package com.bridgeit.ObjectOrientedPrograms;
/**
*
* @author PUSHPA
*/
public class Patient {
   //declare the Datamembers of doctor
 public String patId;
public String patName;
 public String mobileNo;
 public String appointmentWith;
 public int age;

 //Constructor to initialize the datamembers
 public Patient()
 {
	 
 }
 Patient(String pid,String pname,String mobno, int ag)
 {
   patId = pid;
   patName = pname;
   mobileNo = mobno;
   age = ag;
 }

 //toString method to print the details of the object
 public String toString()
 {
   return "\nPatient ID: "+patId+" \nPatient Name: "
   +patName+" \nMobile Number: "+mobileNo+" \nAge: "+age+"\n";
 }
}