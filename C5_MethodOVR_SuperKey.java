package com.java.practice;

class Mother {
	
	 void signin() {
		System.out.println("signin with pwd");
	}
	
}



public class C5_MethodOVR_SuperKey extends Mother{
	
	@Override
	 void signin() {
		super.signin();
		System.out.println("signin with otp");
	}
	
	public static void main(String[] args) {
		C5_MethodOVR_SuperKey m1=new C5_MethodOVR_SuperKey();		
		m1.signin();
	}

}
