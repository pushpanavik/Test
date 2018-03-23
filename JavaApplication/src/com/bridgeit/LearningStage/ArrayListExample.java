package com.bridgeit.LearningStage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayListExample {

	public static void main(String[] args) {
		String str[]=new String[] {"a","e","i","o","u"};
	Set<String> set=new HashSet<>(Arrays.asList(str));
	for(String s: set)
	{
		System.out.print(s+  " ");
	}
	System.out.println();
	set.remove("e");
	System.out.println(set);
	set.clear();
//	System.out.println(set);
	}
}