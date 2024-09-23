package com.java.practice;

import java.util.Scanner;

public class A8_Scanner_AOS {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of area");
		int a = s1.nextInt();
		int area = a * a;
		System.out.println("Area of the square : " + area);
	}

}
