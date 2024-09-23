package com.java.practice;

public class A2_Non_Static_Method {

	//Operators(+,-,*,/,%) using non_static method

	void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition operator:" + c);
	}
	void subtraction() {
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println("subtraction operator:" + c);
	}
	void multiplication() {
		int a = 10;
		int b = 20;
		int c = a * b;
		System.out.println("Multiplication operator:" + c);
	}
	void division() {
		int a = 10;
		int b = 20;
		int c = a / b;
		System.out.println("Division operator:" + c);
	}
	void modulo() {
		int a = 10;
		int b = 20;
		int c = a % b;
		System.out.println("Modulo operator:" + c);
	}
	public static void main(String[] args) {
		System.out.println("I am non static addtion method ");
		A2_Non_Static_Method s1 = new A2_Non_Static_Method();
		s1.addition();
		s1.subtraction();
		s1.multiplication();
		s1.division();
		s1.modulo();
	}
}
