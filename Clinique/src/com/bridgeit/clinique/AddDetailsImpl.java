package com.bridgeit.clinique;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridegit.controller.IAddDetail;
import com.bridgeit.Utility.Utility;
import com.bridgeit.doctor.patient.Appointment;
import com.bridgeit.doctor.patient.Doctor;
import com.bridgeit.doctor.patient.Patient;

public class AddDetailsImpl implements IAddDetail {

	private ObjectMapper mapper = new ObjectMapper();
	private List<Doctor> doctorlist = new ArrayList<Doctor>();
	private List<Patient> patientlist = new ArrayList<Patient>();
	private List<Appointment> appointmentList = new ArrayList<Appointment>();
	private Doctor doctor;
	private Patient patient;
	private String filepath;

	@Override
	public void addDoctor() throws IOException {

		doctor = new Doctor();
		filepath = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
		doctorlist = fetchJsonFromFile(filepath, Doctor[].class);

		System.out.println("Enter name of doctor");
		doctor.setDoctorName(Utility.inputString());

		System.out.println("Enter doctor id");
		doctor.setDoctorId(Utility.inputInteger());

		System.out.println("Enter Specialization of doctor");
		doctor.setDocSpecialization(Utility.inputString());

		System.out.println("Enter Availablity of doctor");
		doctor.setDocAvailability(Utility.inputString());

		doctorlist.add(doctor);
		mapper.writeValue(new File("/home/bridgeit/test/Clinique/Cinique/Doctor.json"), doctorlist);
		System.out.println("Doctor added ");
	}

	@Override
	public Patient addPatient() throws IOException {

		patient = new Patient();

		patientlist = fetchJsonFromFile("/home/bridgeit/test/Clinique/Cinique/Patient.json", Patient[].class);

		System.out.println("Enter patient name :");
		patient.setPatientName(Utility.inputString());

		System.out.println("Enter patient ID. :");
		patient.setPatientId(Utility.inputInteger());

		System.out.println("Enter patient mobile number :");
		patient.setMobileNumber(Utility.inputInteger());

		System.out.println("Enter patient age");
		patient.setPatientAge(Utility.inputInteger());

		patientlist.add(patient);
		mapper.writeValue(new File("/home/bridgeit/test/Clinique/Cinique/Patient.json"), patientlist);
		System.out.println("Patient added successfully");
		return patient;
	}

	public void fixAppointment() throws JsonParseException, JsonMappingException, IOException {
		String doctorName;
		String appointmentFile = "/home/bridgeit/test/Clinique/Cinique/Appointment.json";
		String doctorFile = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
		Patient patient = new Patient();
		Appointment appointment = new Appointment();
		appointmentList = fetchJsonFromFile(appointmentFile, Appointment[].class);

		System.out.println("Enter Doctor name to take appointment");
		doctorName = Utility.inputString();
		doctorlist = fetchJsonFromFile(doctorFile, Doctor[].class);

		for (int i = 0; i < doctorlist.size(); i++) {
			Doctor doctor = doctorlist.get(i);
			if (doctorName.equals(doctor.getDoctorName())) {
				if (doctor.getCount() == 0) {
					Date date = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					patient = addPatient();
					doctor.setCount(1);
					mapper.writeValue(new File("/home/bridgeit/test/Clinique/Cinique/Doctor.json"), doctorlist);
					appointment.setDoctorName(doctorName);
					appointment.setPatient(patient);
					appointment.setAppointmentDate(formatter.format(date));
					appointmentList.add(appointment);
					mapper.writeValue(new File("/home/bridgeit/test/Clinique/Cinique/Appointment.json"),
							appointmentList);
				} else if (doctor.getCount() > 0 && doctor.getCount() < 5) {
					Date date = new Date();
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					patient = addPatient();
					doctor.setCount(doctor.getCount() + 1);
					mapper.writeValue(new File("/home/bridgeit/test/Clinique/Cinique/Doctor.json"), doctorlist);
					appointment.setDoctorName(doctorName);
					appointment.setPatient(patient);
					appointment.setAppointmentDate(formatter.format(date));
					appointmentList.add(appointment);
					mapper.writeValue(new File("/home/bridgeit/test/Clinique/Cinique/Appointment.json"),
							appointmentList);
				}
			}
		}
	}

	@Override
	public void famousDoctor() {
		for (int i = 0; i < doctorlist.size(); i++) {
			if (doctor.getCount() == 5) {
				{
					System.out.println("Famous Doctor in the hospital" + doctorlist.get(i));
				}
			}
		}

	}

	private <T> List<T> fetchJsonFromFile(String filepath, Class<T[]> clazz)
			throws JsonParseException, JsonMappingException, IOException {

		File file = new File(filepath);
		List<T> list = new ArrayList<T>(Arrays.asList(mapper.readValue(file, clazz)));
		return list;

	}

	@Override
	public void printDoctorDetails() throws JsonParseException, JsonMappingException, IOException {
		String filepath = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
		doctorlist = fetchJsonFromFile(filepath, Doctor[].class);
		for (int i = 0; i < doctorlist.size(); i++) {
			System.out.println("" + doctorlist.get(i));
		}

	}

	@Override
	public void printPatientDetails() throws JsonParseException, JsonMappingException, IOException {
		String filepath = "/home/bridgeit/test/Clinique/Cinique/Patient.json";
		patientlist = fetchJsonFromFile(filepath, Patient[].class);
		for (int i = 0; i < patientlist.size(); i++) {
			System.out.println("" + patientlist.get(i));
		}

	}

	@Override
	public void searchDoctorById() throws IOException {

		try {
			System.out.println("Enter the doctor id");
			int docid = Utility.inputInteger();

			String filepath = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
			doctorlist = fetchJsonFromFile(filepath, Doctor[].class);

			Iterator<Doctor> doctorIterator = doctorlist.iterator();

			while (doctorIterator.hasNext()) {
				Doctor doctor1 = doctorIterator.next();
				if (doctor1.getDoctorId() == (docid)) {

					System.out.println("\t\tDoctor Details \t\t ");
					System.out.println("\tDoctor Name=" + doctor1.getDoctorName());
					System.out.println("\tDoctor Id=" + doctor1.getDoctorId());
					System.out.println("\tDoctor Specialization=" + doctor1.getDocSpecialization());
					System.out.println("\tDoctor Availabiliity=" + doctor1.getDocAvailability());
					break;
				} else
					System.out.println("Doctor by that id not found");

			}
		} catch (ClassCastException e) {

			System.out.println();
		}
	}

	@Override
	public void searchDoctorByName() throws JsonParseException, JsonMappingException, IOException {
		try {
			System.out.println("Enter the doctor Name");
			String docName = Utility.inputString();

			String filepath = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
			doctorlist = fetchJsonFromFile(filepath, Doctor[].class);

			Iterator<Doctor> doctorIterator = doctorlist.iterator();

			while (doctorIterator.hasNext()) {
				Doctor doctor1 = doctorIterator.next();
				if (doctor1.getDoctorName().equals(docName)) {

					System.out.println("\t\tDoctor Details \t\t ");
					System.out.println("\tDoctor Name=" + doctor1.getDoctorName());
					System.out.println("\tDoctor Id=" + doctor1.getDoctorId());
					System.out.println("\tDoctor Specialization=" + doctor1.getDocSpecialization());
					System.out.println("\tDoctor Availabiliity=" + doctor1.getDocAvailability());
					break;
				} else
					System.out.println("Doctor by that name not found");

			}
		} catch (ClassCastException e) {

			System.out.println();
		}

	}

	@Override
	public void searchDcotorBySpecialization() throws JsonParseException, JsonMappingException, IOException {
		try {
			System.out.println("Enter the doctor Specialization");
			String Speciallization = Utility.inputString();

			String filepath = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
			doctorlist = fetchJsonFromFile(filepath, Doctor[].class);

			Iterator<Doctor> doctorIterator = doctorlist.iterator();

			while (doctorIterator.hasNext()) {
				Doctor doctor1 = doctorIterator.next();
				if (doctor1.getDocSpecialization().equals(Speciallization)) {

					System.out.println("\t\tDoctor Details \t\t ");
					System.out.println("\tDoctor Name=" + doctor1.getDoctorName());
					System.out.println("\tDoctor Id=" + doctor1.getDoctorId());
					System.out.println("\tDoctor Specialization=" + doctor1.getDocSpecialization());
					System.out.println("\tDoctor Availabiliity=" + doctor1.getDocAvailability());
					break;
				} else
					System.out.println("Doctor by that Specialization not found");

			}
		} catch (ClassCastException e) {

			System.out.println();
		}
	}

	@Override
	public void searchDoctorByAvailability() throws JsonParseException, JsonMappingException, IOException {
		try {
			System.out.println("Enter the doctor Availability");
			String doctorAvailability = Utility.inputString();

			String filepath = "/home/bridgeit/test/Clinique/Cinique/Doctor.json";
			doctorlist = fetchJsonFromFile(filepath, Doctor[].class);

			Iterator<Doctor> doctorIterator = doctorlist.iterator();

			while (doctorIterator.hasNext()) {
				Doctor doctor1 = doctorIterator.next();
				if (doctor1.getDocAvailability().equals(doctorAvailability)) {

					System.out.println("\t\tDoctor Details \t\t ");
					System.out.println("\tDoctor Name=" + doctor1.getDoctorName());
					System.out.println("\tDoctor Id=" + doctor1.getDoctorId());
					System.out.println("\tDoctor Specialization=" + doctor1.getDocSpecialization());
					System.out.println("\tDoctor Availabiliity=" + doctor1.getDocAvailability());
					break;
				} else
					System.out.println("Doctor is not available");

			}
		} catch (ClassCastException e) {

			System.out.println();
		}

	}

	@Override
	public void searchPatientById() throws IOException {

		String filepath = "/home/bridgeit/test/Clinique/Cinique/Patient.json";
		patientlist = fetchJsonFromFile(filepath, Patient[].class);
		System.out.println("Enter Patient id");
		int patientId = Utility.inputInteger();

		Iterator<Patient> patientIterator = patientlist.iterator();
		while (patientIterator.hasNext()) {
			Patient patient = patientIterator.next();
			if (patient.getPatientId() == patientId) {

				System.out.println("\t\tPatient  Details \t\t ");
				System.out.println("\tPatient Name=" + patient.getPatientName());
				System.out.println("\tPatient Id=" + patient.getPatientId());
				System.out.println("\tPatient Mobile Number=" + patient.getMobileNumber());
				System.out.println("\tPatient Age=" + patient.getPatientAge());
				break;
			}

		}
	}

	@Override
	public void searchPatientByName() throws JsonParseException, JsonMappingException, IOException {

		String filepath = "/home/bridgeit/test/Clinique/Cinique/Patient.json";
		patientlist = fetchJsonFromFile(filepath, Patient[].class);
		System.out.println("Enter Patient Name");
		String patientName = Utility.inputString();

		Iterator<Patient> patientIterator = patientlist.iterator();
		while (patientIterator.hasNext()) {
			Patient patient = (Patient) patientIterator.next();
			if (patient.getPatientName().equals(patientName)) {
				System.out.println("\t\tPatient  Details \t\t ");
				System.out.println("\tPatient Name=" + patient.getPatientName());
				System.out.println("\tPatient Id=" + patient.getPatientId());
				System.out.println("\tPatient Mobile Number=" + patient.getMobileNumber());
				System.out.println("\tPatient Age=" + patient.getPatientAge());
				break;
			}
		}

	}
	public static void main(String args[]) throws IOException, ClassCastException {

		IAddDetail addressDetail = new AddDetailsImpl();

		int choice;
		do {

			System.out.println("1. Add Doctor");
			System.out.println("2. Add Patient");
			System.out.println("3. Take Appointment");
			System.out.println("4.Display Patient Details");
			System.out.println("5. Display Doctor Details");
			System.out.println("6. Find Doctor by Id");
			System.out.println("7. Find Doctor by Name");
			System.out.println("8. Find Doctor by Speciality");
			System.out.println("9. Find Doctor by Availability");
			System.out.println("10. find Patient by Id");
			System.out.println("11. Find Patient by Name");
			System.out.println();
			System.out.println("Enter your choice");
			choice = Utility.inputInteger();
			switch (choice) {
			case 1:
				addressDetail.addDoctor();
				break;

			case 2:
				addressDetail.addPatient();
				break;

			case 3:
				addressDetail.fixAppointment();
				break;

			case 4:
				addressDetail.printPatientDetails();
				break;

			case 5:
				addressDetail.printDoctorDetails();
				break;

			case 6:
				addressDetail.searchDoctorById();
				break;

			case 7:
				addressDetail.searchDoctorByName();
				break;

			case 8:
				addressDetail.searchDcotorBySpecialization();
				break;

			case 9:
				addressDetail.searchDoctorByAvailability();
				break;

			case 10:
				addressDetail.searchPatientById();
				break;

			case 11:
				addressDetail.searchPatientByName();
				break;
			case 12:
				addressDetail.famousDoctor();
				break;

			default:
				System.exit(0);

			}
		} while (choice <= 12);
	}

}
