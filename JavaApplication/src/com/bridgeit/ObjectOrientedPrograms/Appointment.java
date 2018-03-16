package com.bridgeit.ObjectOrientedPrograms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author PUSHPA
 */
class Appointment
{
  int noOfAppointment=0;
  Doctor doctor;
  Patient patient;
  String strDate;
  DateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
  Map<Date,Doctor> appointment = new HashMap<Date,Doctor>();
  Map<Map,String> patientAppointmentMap = new HashMap<Map,String>();

  //To set appointment with a particular doctor on a particular date
  void setAppointment(Date date, Doctor d, Patient p) throws ParseException {    
    doctor = d;
    patient = p;

    // To check if the doctor has other appointment on that day
    if(doctor.appointmentCount.containsKey(date))   
    {
      noOfAppointment = doctor.appointmentCount.get(date);
      if( noOfAppointment >= 2){      // To check if the doctor has more than 2 appointments on that day
        System.out.println("\nAppointments full for the doctor on the particular day");
      }
      else                            //Creating an appointment and puttingit in appointment Map
      {
        noOfAppointment++;
        appointment.put(date,doctor);
        doctor.appointmentCount.put(date,noOfAppointment);
        strDate = simpleFormat.format(date);
        
        
        doctor.patientsList.add(patient.patId);
        System.out.println("\nAppointment set with Doctor: "+doctor.name+" Specialist in "
          +doctor.specialization+" on "+simpleFormat.format(date));
      }
    }
      
    else{                             //Creating an appointment and puttingit in appointment Map
          appointment.put(date,doctor);
          doctor.appointmentCount.put(date,1);
          strDate = simpleFormat.format(date);
          
          doctor.patientsList.add(patient.patId);
          System.out.println("\nAppointment set with Doctor: "+doctor.name+" Specialist in "
            +doctor.specialization+" on "+simpleFormat.format(date));
    }

  }

  //Printing all the available appointments
  void printAllAppointments()
  {
    int i=0,size;
    Set patMapSet = appointment.entrySet();
    Iterator mapIter = patMapSet.iterator(); 
    
    if(appointment.isEmpty()){
      System.out.println("No appointments yet!");
    }
    
    for (Object obj : appointment.entrySet()) {
     Map.Entry<Date, Doctor> entry = (Map.Entry) obj;
     System.out.println("");
     Date date = entry.getKey();
     Doctor d = entry.getValue();
     System.out.println("\n#:");

     System.out.print("Name of the Doctor: " + d.name);
     System.out.println("\nWith Patient: " + d.patientsList.get(i));

     System.out.println("on : " + simpleFormat.format(date));
     System.out.println("\n");
     i++;
    }

  }
}
