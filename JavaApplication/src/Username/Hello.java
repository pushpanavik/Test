package Username;

import java.util.Scanner;

import Utility.UserName;

public class Hello {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		String s = "welcome to bridgelabz";
		UserName callusername = new UserName();
		System.out.println("" + callusername.a(s));
		scanner.close();
	}

}
