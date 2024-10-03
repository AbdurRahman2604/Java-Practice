package com.java.practice;

class SuperMost{
	void testNG() {
		System.out.println("i am learning testNG");
	}
	void jenkins() {
		System.out.println("i am learning jenkins");
	}
}
abstract class MidClass extends SuperMost{
	void facebook_Login() {
		System.out.println("login success through fb");
	}
	void whatsapp_Login() {
		System.out.println("login success through whatsapp");
	}
	
	abstract void methodAbstract1();
	abstract void methodAbstract2();
}

public class C7_AbstractWithConcreteClass2 extends MidClass {

	void java() {
		System.out.println("login success through gmail");
	}
	void selenium() {
		System.out.println("login success through gmail");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		C7_AbstractWithConcreteClass2 a1=new C7_AbstractWithConcreteClass2();
		a1.testNG();
		a1.jenkins();
		a1.facebook_Login();
		a1.whatsapp_Login();
		a1.java();
		a1.selenium();
		a1.methodAbstract1();
		a1.methodAbstract2();
	
	}
	@Override
	void methodAbstract1() {
		System.out.println("i am abstract method 1");
	}
	@Override
	void methodAbstract2() {
		System.out.println("i am abstract method 2");
	}

}
