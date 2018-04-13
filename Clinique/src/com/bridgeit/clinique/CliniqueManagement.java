package com.bridgeit.clinique;

import java.io.IOException;

import com.bridegit.controller.IAddDetail;
import com.bridgeit.Utility.Utility;

public class CliniqueManagement {
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
			System.out.println("12. Famous Doctor");
			
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
