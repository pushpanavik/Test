package com.bridgeit.LearningStage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

import com.bridegit.Utility.Utility;

public class SitchCaseExample implements AutoCloseable{
	public void close() throws Exception
	{
		System.out.println("Closing");
				
	}


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new FileReader("/home/bridgeit/test/JavaApplication/src/com/"+ 
		"bridgeit/ObjectOrientedPrograms/helloworld"));
		java.io.BufferedWriter bw=java.nio.file.Files.newBufferedWriter(FileSystems.getDefault().getPath("/home/bridgeit/test/JavaApplication/src/com/"+
		"bridgeit/ObjectOrientedPrograms/helloworld"),Charset.defaultCharset());
	System.out.println(br.readLine());
		}
		catch(FileNotFoundException foe)
		{
			foe.printStackTrace();
		}
	}
		
}


