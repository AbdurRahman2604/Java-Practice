package com.java.practice;

public class A1_Static_Method {
	//call the static method 5 times in the main method

		static void staticMethod() {
			System.out.println("I am static method");
		}
		public static void main(String[] args) {
			staticMethod();
			staticMethod();
			staticMethod();
			staticMethod();
			staticMethod();
		}
}
