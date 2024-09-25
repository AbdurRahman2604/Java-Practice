package com.java.practice;

public class C2_NP_Constructor_ThisCalling {
	
	C2_NP_Constructor_ThisCalling() {
		
	System.out.println("NP constructor");	
	}
	
	C2_NP_Constructor_ThisCalling(int a){
		this();
		System.out.println("Para constructor");
	}
	
	public static void main(String[] args) {
		
		new C2_NP_Constructor_ThisCalling(10);
	}

}
