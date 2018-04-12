package com.bridgeit.doctor.patient;

public class Doctor {
private int doctorId;
private String  doctorName;
private String docSpecialization;
private String docAvailability;
public int getDocId() {
	return doctorId;
}
public void setDocId(int doctorId2) {
	this.doctorId = doctorId2;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public String getDocSpecialization() {
	return docSpecialization;
}
public void setDocSpecialization(String docSpecialization) {
	this.docSpecialization = docSpecialization;
}
public String getDocAvailability() {
	return docAvailability;
}
public void setDocAvailability(String docAvailability) {
	this.docAvailability = docAvailability;
}
public Doctor(int docId, String doctorName, String docSpecialization, String docAvailability) {
	super();
	this.doctorId = docId;
	this.doctorName = doctorName;
	this.docSpecialization = docSpecialization;
	this.docAvailability = docAvailability;
}
public Doctor() {
	super();
}
public String toString()
{
	return "Doctor Details[Doctor Id="+doctorId+",Doctor Name="+doctorName+",Doctor Specialization="+docSpecialization+",Doctor Availability="+docAvailability+"]";
}

}
