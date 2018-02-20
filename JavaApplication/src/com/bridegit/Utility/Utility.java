package com.bridegit.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

public class Utility {

	public static void regex() {
		// TODO Auto-generated method stub

		/*
		 * String REGEX="<<username>>"; String Input=""; Pattern
		 * pattern=Pattern.compile(scanner.next(Input)); Matcher
		 * matcher=pattern.Matcher.compile(scanner.next(REGEX)); boolean
		 */

	}

	public boolean leap(int year) {
		if (year % 400 == 0 && year % 4 == 0) {

			return true;
		} else {
			return false;
		}
	}

	public static void flipcoin(int flipcoin) {
		int count1 = 0;
		int count2 = 0;
		if (flipcoin >= 0) {
			for (int x = 1; x <= flipcoin; x++) {

				if (Math.random() < 0.5) {

					count1++;
				} else {

					count2++;
				}

			}
			int heads = (count1 * 100) / flipcoin;
			int tails = (count2 * 100) / flipcoin;
			System.out.println("heads:" + count1);
			System.out.println("tails:" + count2);
			System.out.println("Percentage Of Heads: " + heads);
			System.out.println("Percentage of Tails:)" + tails);
		}
	}

	public int power(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Math.pow(" + n + "," + i + ")=" + Math.pow(n, i));
		}
		return n;
	}

	public int harmonic(int n) {
		int i = 1;
		float result = 0;
		while (n >= i) {
			result = result + (float) 1 / n;
			n--;
		}
		System.out.println("The Nth harmonic value is:" + result);
		return n;
	}

	public int primefactors(int n) {
		int i = 1;
		for (i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.println(i + "");
				n = n / i;
			}
			if (n < 1)
				System.out.println(n);
		}
		return n;
	}

	public int euclidean(int x, int x1, int y, int y1) {
		int dist1 = x1 - x;
		System.out.println("distance between x and x1:=" + dist1);
		int dist2 = y1 - y;
		System.out.println("distance between y and y1:=" + dist2);
		int n = (int) Math.pow(dist1, 2);
		System.out.println("Math power of dist1 is:=" + n);
		int m = (int) Math.pow(dist2, 2);
		System.out.println("Math power of dist2 is:=" + m);
		int mul = n - m;
		System.out.println("Distance between dist1 and dist2:=" + mul);
		int d = (int) Math.sqrt(mul);

		return d;
	}

	public void lapsedTime() throws InterruptedException {

	}
}
