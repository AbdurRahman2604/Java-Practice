package com.java.practice;

public class A4_Non_Static_OVL {
	//Operators with non static method by using method overloading concepts

		void addition(int a, int b) {
			int c = a + b;
			System.out.println("first static:" + c);
		}
		void addition(double a, int b) {
			double c = a - b;
			System.out.println("second static:" + c);
		}
		void addition(double a, int b, String d) {
			double c = a * b;
			System.out.println("third static:" + c + " & name is:" +d);
			//System.out.println("my name is :"+ d);
		}
		public static void main(String[] args) {
			A4_Non_Static_OVL n1 =new A4_Non_Static_OVL();
			n1.addition(20, 20);
			n1.addition(40.5, 50);
			n1.addition(100.5, 4, "Raja");
		}
}
