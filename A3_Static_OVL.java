package com.java.practice;

public class A3_Static_OVL {
	//Operators with static method by using method overloading concepts
		static void addition(int a, int b) {
			int c = a + b;
			System.out.println("first static:" + c);
		}
		static void addition(double a, int b) {
			double c = a - b;
			System.out.println("second static:" + c);
		}
		static void addition(float a, byte b) {
			float c = a * b;
			System.out.println("third static:" + c);
		}
		public static void main(String[] args) {
			addition(100, 200);
			addition(20.5, 10);
			addition(200.13, 1);
		}

}
