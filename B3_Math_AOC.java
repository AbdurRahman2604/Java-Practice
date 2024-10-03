package com.java.practice;

public class B3_Math_AOC {

	final static double pi = Math.PI;

	public static void main(String[] args) {

		double radius = Math.random();
		System.out.println("radius:" + radius);
		double area = pi * radius * radius;
		System.out.println("area:" + area);

		double a = Math.random();
		System.out.println("random no" + a);

		for (int i = 0; i < 5; i++) {
			System.out.println("loop random no" + Math.random());

		}
		int b = Math.min(10, 20);
		System.out.println(b);

	}
}
