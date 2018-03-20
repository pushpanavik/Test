package com.bridgeit.LearningStage;

public class MyException  extends Exception{

	String versionUid="1425ASCD124";
	String error="Exception found";
	public MyException(String versionUid, String error) {
		super();
		this.versionUid = versionUid;
		this.error = error;
		
	}
	

	public String getErrorCode() {
		return error;
	}
	
}
