package com.java.practice;


interface Amazon{
	
	void registration(); 
	void login();
}
interface Flipkart{
	void registrationFlipkart(); 
	void loginFlipkart();
	
}


public class C8_MultipleInheritance implements Amazon,Flipkart {

	@Override
	public void registration() {
		System.out.println("amazon registration succesfull");
		
	}

	@Override
	public void login() {
		System.out.println("amazon login successfull");
		
	}

	

	@Override
	public void registrationFlipkart() {
		System.out.println("flipkart registration succesfull");
		
	}

	@Override
	public void loginFlipkart() {
		System.out.println("flipkart login succesfull");
		
	}
	
	
	
public static void main(String[] args) {
		
		C8_MultipleInheritance m1=new C8_MultipleInheritance();
		//m1.registration();
		//m1.login();
		Amazon a=new C8_MultipleInheritance();
		a.registration();
		a.login();
		m1.registrationFlipkart();
		m1.loginFlipkart();
		
	}
	
	
	
	
	
	
}
