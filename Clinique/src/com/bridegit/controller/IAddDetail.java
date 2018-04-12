package com.bridegit.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;




public interface  IAddDetail {
	public void addDoctor() throws IOException;
	public void addPatient() throws IOException;
	public void takeAppointment() throws FileNotFoundException;
	public void printDoctorDetails() throws JsonParseException, JsonMappingException, IOException;
	public void printPatientDetails()throws JsonParseException, JsonMappingException, IOException;
	
	public void popularDoctor();
	public void searchDoctorById() throws IOException;
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException;
	public void searchDcotorBySpecialization() throws JsonParseException, JsonMappingException, IOException;
	public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException;
	public void searchPatientById() throws IOException;
	public void searchPatientByName();
	
}
