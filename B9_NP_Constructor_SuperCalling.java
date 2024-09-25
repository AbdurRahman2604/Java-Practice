package com.java.practice;

class Constructor1{
	 Constructor1() {
		
		System.out.println("I am np constructor 1");
	}
}

class Constructor2 extends Constructor1{
	 Constructor2() {
		
		System.out.println("I am np constructor 2");
	}
}


class Constructor3 extends  Constructor2{
	 Constructor3() {
	
		System.out.println("I am np constructor 3");
	}
}

public class B9_NP_Constructor_SuperCalling extends  Constructor3 {
	
    public static void main(String[] args) {
    	
    	
		new B9_NP_Constructor_SuperCalling();
	}
}
