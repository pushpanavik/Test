package com.bridgeit.ObjectOrientedPrograms;



import java.io.IOException;

import com.bridegit.Utility.Utility;

	public class InventoryManagement {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Utility u=new Utility();
			int varieties;
			
			System.out.println("Enter the how many varieties you want");
			varieties=u.inputInteger();
			u.inventorymanage(varieties);
	
			
		}

	}


