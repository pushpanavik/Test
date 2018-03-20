package com.bridgeit.LearningStage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;



class EnumExample1{  
	/*private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close();
	    }
	}
	
	private static void copyFileUsingChannel(File source, File dest) throws IOException {
	    FileChannel sourceChannel = null;
	    FileChannel destChannel = null;
	    try {
	        sourceChannel = new FileInputStream(source).getChannel();
	        destChannel = new FileOutputStream(dest).getChannel();
	        destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
	       }finally{
	           sourceChannel.close();
	           destChannel.close();
	   }
	}
*/
	private static void appendUsingFileWriter(String filepath,String appendText) throws IOException
	{
		
		File f=new File(filepath);
		FileWriter fw=null;
		BufferedWriter bw=null;
		PrintWriter pw=null;
		try {
			f=new File(filepath);
			fw=new FileWriter(f,true);
			bw=new BufferedWriter(fw);
			pw=new PrintWriter(bw);
			pw.println(appendText);
		}finally {
			try {
				pw.flush();
				pw.close();
				bw.close();
				fw.close();
			}
			catch(IOException io)
			{
				io.printStackTrace();
				
			}
	
	}	
	}
public static void main(String args[]) throws IOException
{
	/*File source=new File("/home/bridgeit/Desktop/Files Folder/StringFile");
	File dest=new File("/home/bridgeit/Desktop/Files Folder/Number");
	long start = System.nanoTime();
	copyFileUsingStream(source,dest);
	System.out.println("Time taken by Stream Copy = "+(System.nanoTime()-start));
    
	start = System.nanoTime();
	copyFileUsingChannel(source,dest);
	System.out.println("Time taken by Channel Copy = "+(System.nanoTime()-start));*/
    
	String filepath= "/home/bridgeit/Desktop/Files Folder/abc.txt";
	   
   String appendText="pushpa";
    appendUsingFileWriter(filepath, appendText);
   
    
	
    
	}
}

