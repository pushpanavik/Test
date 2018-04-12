package com.bridgeit.doctor.patient;

import java.util.Date;

public class Appointment {
private String doctorId;
private String doctorName;
private String patientId;
private String patientName;
private Date appointmentDate;
public String getDoctorId() {
	return doctorId;
}
public void setDoctorId(String doctorId) {
	this.doctorId = doctorId;
}
public String getPatientId() {
	return patientId;
}
public void setPatientId(String patientId) {
	this.patientId = patientId;
}
public Date getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(Date appointmentDate) {
	this.appointmentDate = appointmentDate;
}

public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public Appointment(String doctorId, String patientId, Date appointmentDate,String patientName, String doctorName) {
	super();
	this.doctorId = doctorId;
	this.patientId = patientId;
	this.appointmentDate = appointmentDate;
	this.doctorName=doctorName;
	this.patientName=patientName;
}
public Appointment() {
	super();
}
public String toString()
{
	return "Appointment Details[Doctor Id="+doctorId+",Doctor Name="+doctorName+",Patient Id="+patientId+",Patient Name="+patientName+",Appointment Date="+appointmentDate+"]";
}
	
}
