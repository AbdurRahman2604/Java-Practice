package com.java.practice;

class SuperClass {
	void add() {
		int a = 100;
		int b = 200;
		int add = a + b;
		System.out.println("add: " + add);
	}

	void sub() {
		int a = 100;
		int b = 200;
		int sub = a - b;
		System.out.println("sub: " + sub);
	}

}

public class B7_SingleInheritance_NonStatic extends SuperClass {
	void mul() {
		int a = 100;
		int b = 200;
		int mul = a * b;
		System.out.println("multipy : " + mul);
	}

	void modulo() {
		int a = 100;
		int b = 200;
		int modulo = a % b;
		System.out.println("modulo : " + modulo);
	}

	public static void main(String[] args) {
		
		B7_SingleInheritance_NonStatic s1=new B7_SingleInheritance_NonStatic();
		s1.add();
		s1.sub();
		s1.mul();
		s1.modulo();

	}
	
	

}
