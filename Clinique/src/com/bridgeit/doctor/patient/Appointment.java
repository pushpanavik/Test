package com.bridgeit.doctor.patient;


public class Appointment {

private String doctorName;
private Patient patient;
private String appointmentDate;

public String getAppointmentDate() {
	return appointmentDate;
}
public void setAppointmentDate(String string) {
	this.appointmentDate = string;
}

public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}
@Override
public String toString() {
	return "Appointment [doctorName=" + doctorName + ", patient=" + patient + ", appointmentDate=" + appointmentDate
			+ "]";
}

}
