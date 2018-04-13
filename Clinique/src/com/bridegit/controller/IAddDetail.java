package com.bridegit.controller;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgeit.doctor.patient.Patient;


public interface  IAddDetail {
	public void addDoctor() throws IOException;
	public Patient addPatient() throws IOException;
	public void fixAppointment()throws JsonParseException, JsonMappingException, IOException;
	public void printDoctorDetails() throws JsonParseException, JsonMappingException, IOException;
	public void printPatientDetails()throws JsonParseException, JsonMappingException, IOException;
	public void famousDoctor();
	public void searchDoctorById() throws IOException;
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException;
	public void searchDcotorBySpecialization() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException;
	public void searchPatientById() throws IOException;
	public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException;
	
}
