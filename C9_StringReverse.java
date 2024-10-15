package com.java.practice;

import java.util.Arrays;

public class C9_StringReverse {
	
	//using string concatenation operator
	
	public static void main(String[] args) {
		String a="welcome";
		String b="";
		
		for(int i=a.length()-1;i>=0;i--) {
         char c = a.charAt(i);
			b=b+c;
			
			
		}
		
		System.out.println(b);
		
		
		
		
	// using character array
		String c="";
		char[] ch = a.toCharArray();
		System.out.println(Arrays.toString(ch));
	
		for(int i=ch.length-1;i>=0;i--) {
		c=c+ch[i];	
		}
		
		System.out.println(c);
	}
	
	
	
}
