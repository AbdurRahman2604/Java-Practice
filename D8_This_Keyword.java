package com.java.practice;

public class D8_This_Keyword {
	
	String name;
	int age;
	
	public void studentInfo(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("Name is " + name +"\n"+ "Age is " + age);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D8_This_Keyword t1=new D8_This_Keyword();
		t1.studentInfo("naailah", 1);
		System.out.println(t1.name);
		System.out.println(t1.age);
		

	}

}
