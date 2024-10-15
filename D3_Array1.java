package com.java.practice;

public class D3_Array1 {
	
	public static void main(String[] args) {
		
	
		int alphaCount=0;
		int digitCount=0;
		int specialCount=0;
		int spaceCount=0;
		String input="$ kv no 2 banglore";
	
	
		char[] c = input.toCharArray();
		for(int i=0;i<input.length();i++) {
		if(Character.isAlphabetic(c[i])) {
			alphaCount++;
	}
		if(Character.isDigit(c[i])) {
			digitCount++;
		}
		if(Character.isWhitespace(c[i]))
		{
			spaceCount++;
		}
		if(!Character.isAlphabetic(c[i])&&!Character.isDigit(c[i])&&!Character.isWhitespace(c[i])) {
			specialCount++;
		}

}
		System.out.println(alphaCount);
		System.out.println(digitCount);
		System.out.println(spaceCount);
		System.out.println(specialCount);
	}
}