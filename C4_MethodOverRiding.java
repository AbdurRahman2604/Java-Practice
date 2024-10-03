package com.java.practice;


class Parent_Method{
	
	void login() {
		
		System.out.println("login with password");
	}

}
 		

public class C4_MethodOverRiding extends Parent_Method {
	@Override
	void login() {
		
		System.out.println("login with OTP");
	}
	public static void main(String[] args) {
		C4_MethodOverRiding m1=new C4_MethodOverRiding();
		
		m1.login();
	}
	
}
