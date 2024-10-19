package com.collection.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set s1 = new TreeSet();
		s1.add(100);
		s1.add(5000);
		// s1.add("raja");
		s1.add(500);
		s1.add(2000000);
		s1.add(20000);

		// s1.add("");
		System.out.println(s1);
		Set s2 = new HashSet();
		s2.addAll(s1);

		System.out.println(s2);

		Set s3 = new LinkedHashSet();
		s3.addAll(s1);
		System.out.println(s3);
	}

}
