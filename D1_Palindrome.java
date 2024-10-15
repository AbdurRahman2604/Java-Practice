package com.java.practice;

public class D1_Palindrome {
	
	public static void main(String[] args) {
		
		String a="madam";
	
		String output="";
		//String input = a.toLowerCase();
		
		for(int i=a.length()-1;i>=0;i--) {
			char c = a.charAt(i);
			output=output+c;
		}
		
		if(output.equals(a)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		
		//equals ignore case
		String b="MAlayaLaM";
		String output1="";
		for(int i=b.length()-1;i>=0;i--) {
			char c = b.charAt(i);
			output1=output1+c;
		}
		if(output1.equalsIgnoreCase(b)) {
			System.out.println(b +" is Palindrome");
		}
		else {
			System.out.println(b +" is not a Palindrome");
		}
		
		
		String myStr1="Kv no 2";
		System.out.println(myStr1.replace('K', 't'));
		
		String myStr = "Hello";
		System.out.println(myStr.replace('l', 'p'));
		
		
		String cityName="I'm in Gurgaon";
		String replaceCity = cityName.replace("Gurgaon","Delhi");
		System.out.println(replaceCity);
		
		String name="kv no 2";
		System.out.println(name.replace("2", ""));
		System.out.println(name.replace("kv no",""));
	}

}
