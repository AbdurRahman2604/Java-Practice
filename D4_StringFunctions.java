package com.java.practice;

public class D4_StringFunctions {

	public static void main(String[] args) {
		// palindrome-26
		String a = "madam";

		String output = "";
		// String input = a.toLowerCase();

		for (int i = a.length() - 1; i >= 0; i--) {
			char c = a.charAt(i);
			output = output + c;
		}

		if (output.equals(a)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}

		// palindrome equals ignore case-37
		String b = "MAlayaLaM";
		String output1 = "";
		for (int i = b.length() - 1; i >= 0; i--) {
			char c = b.charAt(i);
			output1 = output1 + c;
		}
		if (output1.equalsIgnoreCase(b)) {
			System.out.println(b + " is Palindrome");
		} else {
			System.out.println(b + " is not a Palindrome");
		}

		// replace-38
		String myStr1 = "Kv no 2";
		System.out.println(myStr1.replace('K', 't'));

		String myStr = "Hello";
		System.out.println(myStr.replace('l', 'p'));

		// replace the word-39
		String cityName = "I'm in Gurgaon";
		String replaceCity = cityName.replace("Gurgaon", "Delhi");
		System.out.println(replaceCity);
		// replace number with nothing-40
		String name = "kv no 2";
		System.out.println(name.replace("2", ""));
		//41
		System.out.println(name.replace("kv no", ""));
		// replace all capital letters-42
		String name1 = "I am The Boss";
		String replaceCaps = name1.replaceAll("[A-Z]", "");
		System.out.println(replaceCaps);
		// replace all numeric-43
		String numeric = "My home is near to sector 2 Patna 4";

		String replaceNumeric = numeric.replaceAll("[0-9]", "");

		System.out.println(replaceNumeric);

		// count the letters-44
		String name2 = "kv no 2";
		int letterCount = 0;
		for (int i = 0; i < name2.length(); i++) {
			char ch = name2.charAt(i);
			if (Character.isAlphabetic(ch)) {
				letterCount++;
			}
		}
		System.out.println(letterCount);
		//startswith-45
		String name3="My name is Ram";
		boolean startsWith = name3.startsWith("M");
	System.out.println(startsWith);
	//endswith-46
	String name4="I am a boy";
	boolean endsWith = name4.endsWith("y");
System.out.println(endsWith);
//contains-47
String name5="I m a simple boy";
  boolean contains = name5.contains("s");
System.out.println(contains);
//replace-48
String name6="My name is Shyam";
String replace = name6.replace(" ", "_");
System.out.println(replace);







}
}
