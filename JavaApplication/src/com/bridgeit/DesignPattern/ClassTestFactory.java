package com.bridgeit.DesignPattern;

public class ClassTestFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.9 GHz");
		Computer server = ComputerFactory.getComputer("server","8 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}
