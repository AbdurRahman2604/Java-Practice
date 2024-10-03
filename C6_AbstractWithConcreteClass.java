package com.java.practice;


abstract class Parent_Abstract{
	
	abstract void amazonLogin();
	
	void flipkartLogin() {
		System.out.println("login success through flipkart");
	}
	
	
}

public class C6_AbstractWithConcreteClass extends Parent_Abstract {

	@Override
	void amazonLogin() {
		System.out.println("login success through amazon");
		
	}
	
	public static void main(String[] args) {
		C6_AbstractWithConcreteClass a1=new C6_AbstractWithConcreteClass();
		a1.amazonLogin();
		a1.flipkartLogin();
	
	
	
	
	
	
	}

}
