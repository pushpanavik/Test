package com.bridgeit.doctor.patient;

public class Patient {
private int patientId;
private String patientName;
private int mobileNumber;
private int patientAge;
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public int getPatientAge() {
	return patientAge;
}
public void setPatientAge(int patientAge) {
	this.patientAge = patientAge;
}
public Patient(int patientId, String patientName, int mobileNumber, int patientAge) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.mobileNumber = mobileNumber;
	this.patientAge = patientAge;
}
public Patient() {
	super();
}
public String toString()
{
	return "Patient Details[Patient Id="+patientId+",Patient Name="+patientName+",Patient Mobile Number="+mobileNumber+"Patient Age="+patientAge+"]";
}
}
