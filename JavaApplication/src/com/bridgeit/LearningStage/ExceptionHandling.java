package com.bridgeit.LearningStage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling {

	public static void main(String[] args) throws ArithmeticException {
	int number1=0;
	int number2=5;
	try {
		int number=number1/number2;
		ArithmeticException myException = new ArithmeticException("Divide by zero");
		throw myException;
	}
	catch(ArithmeticException e)
	{
		
		e.printStackTrace();
		System.out.println();
		
	}
	}

}