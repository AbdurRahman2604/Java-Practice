package com.java.practice;

public class C3_P_Constructor_ThisCalling {
	
	C3_P_Constructor_ThisCalling(){
		
		System.out.println("NP constructor");
	}
	C3_P_Constructor_ThisCalling(String a) {
		
		System.out.println("Para String constructor");
	}
	C3_P_Constructor_ThisCalling(int a) {
		this("raja");
		 System.out.println("Para int constructor");
	}
	
public static void main(String[] args) {
	
	new C3_P_Constructor_ThisCalling(10);
}
}
