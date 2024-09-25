package com.java.practice;

class grandFather {
	
	static void grandfatherHouse() {
		System.out.println("grandFather's house from 1st-2nd generation");
		
	}
	
	void grandfatherland() {
		System.out.println("grandFather's land from 1st-2nd generation");
	}
}

class Father extends grandFather{
	
		static void fatherCar() {
			System.out.println("Father's house from 2nd-3rd generation");
			
		}
		
		void fatherGold() {
			System.out.println("Father's land from 2nd-3rd generation");
		}
		
	}

class Son extends Father{
	
	static void sonSavings() {
		System.out.println("savings from 3rd-4th generation");
		
	}
	
	void sonShoppingMall() {
		System.out.println("Shoping mall from 3rd-4th generation");
	}
	
}

public class B8_MultiLevel_NonStatic  extends Son {
	public static void main(String[] args) {
	System.out.println("Properties acquired from 1st generation");	
		grandfatherHouse();
		fatherCar();
		sonSavings();
		System.out.println("***************************************");
	B8_MultiLevel_NonStatic m1=new B8_MultiLevel_NonStatic();
		
	m1.grandfatherland();
	m1.fatherGold();
	m1.sonShoppingMall();
	
	
	
	
	
	}
	
	
	
	

}
