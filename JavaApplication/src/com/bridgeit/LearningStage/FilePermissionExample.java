package com.bridgeit.LearningStage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


@SuppressWarnings("unused")
public class FilePermissionExample {
	public static void main(String[] args) {      
	      File f = null;
	      boolean bool = false;
	      
	      try { 
	      
	         // create new File object
	         f = new File("/home/bridgeit/Desktop/Files Folder/filename.txt");
	         
	         // returns true if file exists
	         bool = f.exists();
	         f.setExecutable(false);
        	 f.setWritable(true);
        	 f.setReadable(true,true);
	         // if file exists
	         if(bool) {
	        	 Set<PosixFilePermission> perms=new HashSet<PosixFilePermission>();
	        	 //users permission
	        	 
	        	 perms.add(PosixFilePermission.OWNER_READ);
	        	 perms.add(PosixFilePermission.OWNER_WRITE);
	        	 perms.add(PosixFilePermission.OWNER_EXECUTE);
	        	 
	        	 Files.setPosixFilePermissions(Paths.get("/home/bridgeit/Desktop/Files Folder/filename.txt"), perms);
	            // set read permission
	            //bool = f.setReadable(true, true);
	            
	            // print
	           // System.out.println("setReadable() succeeded?: "+bool);
	            
	            // checks whether the file is readable
	           // bool  = f.canRead();
	            
	            // prints
	           // System.out.print("Is file readable?: "+bool);
	         }
	         
	      } catch(Exception e) {
	         
	         // if any error occurs
	         e.printStackTrace();
	      }
	   } 
}

