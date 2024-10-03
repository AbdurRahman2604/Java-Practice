package com.java.practice;

import java.util.Scanner;

public class A7_Scanner_AOT {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of breadth");
		int b = s1.nextInt();
		System.out.println("Enter the value of height");
		int h = s1.nextInt();
		int area = (b * h) / 2;
		System.out.println("Area of the triangle : " + area);
	}
}
