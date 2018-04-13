package com.bridgeit.doctor.patient;

public class Doctor {
private int doctorId;
private String  doctorName;
private String docSpecialization;
private String docAvailability;
private int count;


public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
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
public Doctor(int doctorId, String doctorName, String docSpecialization, String docAvailability) {
	super();
	this.doctorId = doctorId;
	this.doctorName = doctorName;
	this.docSpecialization = docSpecialization;
	this.docAvailability = docAvailability;
}
public Doctor() {
	
}
@Override
public String toString() {
	return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", docSpecialization=" + docSpecialization
			+ ", docAvailability=" + docAvailability + ", doctorAppointment=" + count + "]";
}


}
