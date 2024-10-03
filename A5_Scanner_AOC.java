package com.java.practice;

import java.util.Scanner;

public class A5_Scanner_AOC {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		double pi = 3.14;
		System.out.println("Enter the value of circle radius");
		double d1 = s1.nextDouble();
		double area = pi * d1;
		System.out.println("Area of the circle is : " + area);
	}
}
