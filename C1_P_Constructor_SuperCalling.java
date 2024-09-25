package com.java.practice;

class Constructor_A {

	Constructor_A(int a) {

		System.out.println("I am Para constructor A");
	}
	
}

class Constructor_B extends Constructor_A {
	Constructor_B(String b) {
		super(10);
		System.out.println("I am Para constructor B");
	}

}

class Constructor_C extends Constructor_B {

	Constructor_C(int b, int c) {
		super("raja");
		System.out.println("I am Para constructor C");
	}
}

public class C1_P_Constructor_SuperCalling extends Constructor_C {

	public C1_P_Constructor_SuperCalling() {
		super(20, 30);
		System.out.println("I am Para main class constructor");
	}

	public static void main(String[] args) {
		
		new C1_P_Constructor_SuperCalling();
	}
}
