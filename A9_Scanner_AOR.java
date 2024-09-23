package com.java.practice;

import java.util.Scanner;

public class A9_Scanner_AOR {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of length");
		int l = s1.nextInt();
		System.out.println("Enter the value of width");
		int w = s1.nextInt();
		int area = l * w;
		System.out.println("Area of the square : " + area);	    }


}

