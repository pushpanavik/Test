package com.bridgeit.ObjectOrientedPrograms;

import java.io.IOException;
import java.text.ParseException;

import com.bridegit.Utility.Utility;

public class CliniqueManagement {

	public static void main(String[] args) throws ParseException, java.text.ParseException, org.json.simple.parser.ParseException, IOException {
		Utility utility = new Utility();
		
		while (true) 
		{
			System.out.println("Enter 1 to Add Doctors");
			System.out.println("Enter 2 to Add Patients");
			System.out.println("Enter 3 to Search Doctor");
			System.out.println("Enter 4 to Search Patient");
			System.out.println("Enter 5 to Take an appoitment");
                        System.out.println("Enter 6 to Display CliniqueDetails");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				utility.addDoctor();
				break;
			case 2:
				utility.addPatient();
				break;
			case 3:
				utility.searchDoctor();
				break;
			case 4:
				utility.searchPatient();
				break;
			case 5:
                                 utility.fixAppointment();
				break;
                        case 6: 
                            utility.displayCliniqueDetails();
			}
		}

	}

}
