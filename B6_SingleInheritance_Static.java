package com.java.practice;

class Parent {
	static void add() {
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println("add: "+ add);
	}
	
	static void sub() {
		int a=10;
		int b=20;
		int sub=a-b;
		System.out.println("sub: "+ sub);
	}
	
}

public class B6_SingleInheritance_Static extends Parent {
	
	static void mul() {
			int a=10;
			int b=20;
			int mul=a*b;
			System.out.println("multipy : " + mul);
		}
		
	
	static void modulo() {
		int a=10;
		int b=20;
		int modulo=a%b;
		System.out.println("modulo : "+ modulo);
	}
	

	public static void main(String[] args) {
		add();
		sub();
		mul();
		modulo();
		
	
	}

}
