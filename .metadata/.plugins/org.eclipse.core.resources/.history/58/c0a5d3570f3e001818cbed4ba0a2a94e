package com.bridgeit.objectOriented;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgeit.Utility.Utility;

public class AddressBookManagImpl implements AddressBookManagerInterface {
	ObjectMapper mapper = new ObjectMapper();
	
	private boolean isDirectoryOpen = false;
		
	private String relativePath = "/home/bridgeit/test/addrebook/";
	private File f;
	private File[] paths;
	boolean flag = false;
	File file;
	AddressBookInterface book=new AddressBookImpl();

	@Override
	public void createAddressBook() {
		if (isDirectoryOpen) {
			System.out.println("close existing file before opening a new  file ");
			isDirectoryOpen = true;
		} else {
			try {
				System.out.println("Enter the file name");
				String filename = Utility.inputString();
				
				String storefileName = relativePath + filename;
				f = new File(storefileName + ".json");
				f.createNewFile();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("File  created");

		}

	}

	@Override
	public void openAddressBook() {
		ArrayList<Person> list = new ArrayList<>();		
		f = new File("/home/bridgeit/test/addrebook/");
		paths = f.listFiles();

		for (File path : paths) {	
			System.out.println(path);
		}
		System.out.println("Enter the book name");
		String getfile = Utility.inputString();
		 file= new File(f + "/"+getfile + ".json");
	
		try {
		
			BufferedReader br = new BufferedReader(new FileReader(file));
			String readFile = br.readLine();
			if (readFile != null) {
				TypeReference<ArrayList<Person>> typeReference = new TypeReference<ArrayList<Person>>() {
				};
				list = mapper.readValue(file, typeReference);
				System.out.println(list);
				
			} else {
				System.out.println("\t\t\tNo data to disply...\n");
				
			}
			book.adressBookOperation(list);
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub
		// create.editPersonDetail();

	}

	@Override
	public void closeAddressBook() {
		// TODO Auto-generated method stub
		if (flag == false) {
			System.out.println("Please ensure that your file is saved");
			System.exit(0);
		}
		if (flag == true) {
			System.exit(0);
		}
	}

	@Override
	public void saveAddressBook() {
		List<Person> lis= book.list();
		System.out.println(lis);
		// TODO Auto-generated method stub
		System.out.println("do you want to save your details yes or no");
		String feedback = Utility.inputString();
		if (feedback.equals("yes")) {
		//List<Person> list1 = create.
			//System.out.println(list);
			try {
				mapper.writeValue(file,lis);
				System.out.print("Data added sucsessfully......\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {
			System.exit(0);
		}

	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
			System.out.println("Okay");
			System.exit(0);
		

	}

	@Override
	public void saveAs() {
		// TODO Auto-generated method stub
		ArrayList<Person> lis=(ArrayList<Person>) book.list();
		
		String src = "/home/bridgeit/test/addrebook/";

		System.out.println("Enter the file name");
		String filename = Utility.inputString();
		String storefileName = src+filename+".json";
		File fil = new File(storefileName);
		
			try {
				
				mapper.writeValue(fil,lis);
				System.out.print("Data added sucsessfully......\n");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}
}