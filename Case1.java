package com.accessspecifier.practice;

public class Case1 {
	
	public void add() {
		System.out.println("add method");
	}
	
	 void sub() {
		System.out.println("sub method");
	}
	
	private void mul() {
		System.out.println("mul method");
	}
	
	protected void div() {
		System.out.println("div method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Case1 c1=new Case1();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();
		

	}

}
