package com.java.practice;

import java.util.Scanner;

import org.testng.annotations.Test;

public class D7_Try_Catch {

	@Test(enabled = false)
	public void arithmeticException() {

		System.out.println("Program started");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int num = sc.nextInt();

		try {
			System.out.println(100 / num);

		} catch (ArithmeticException a) {
			System.out.println("invalid number");

		}

		System.out.println("program is completed");

	}

	@Test(enabled = false)
	public void nullPointerException() {

		System.out.println("Program started");
		String s = null;

		try {
			System.out.println(s.length());

		} catch (ArithmeticException a) {
			System.out.println("invalid number");
			System.out.println(a.getMessage());

		}

		catch (NumberFormatException n) {
			System.out.println("Invalid format");
			System.out.println(n.getMessage());

		} catch (NullPointerException n) {
			System.out.println("Invalid string");
			System.out.println(n.getMessage());

		}
		System.out.println("program is completed");
	}

	@Test
	public void unKnownException() {
		System.out.println("Program started");
		String s = null;

		try {
			System.out.println(s.length());

		} catch (Exception e) {
			System.out.println("invalid format");
			System.out.println(e.getMessage());

		}
		
		finally {
			System.out.println("i am from finally block");
		}
		System.out.println("program is completed");
	}

}
