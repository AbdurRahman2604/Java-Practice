package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class D2_Array {
	
	
	public static void main(String[] args) {
		
		
		// Array index out of bound exception
		
		int[]rollNo=new int [4];
		
		rollNo[0]=1;
		rollNo[1]=2;
		rollNo[2]=3;
		rollNo[3]=4;
		rollNo[4]=5;	
		
		for (int i=0;i<rollNo.length;i++) {
			System.out.println(rollNo[i]);
			
		}
		//negative array size exception
		
		String[]name=new String[-1];
		name[0]="Raja";
		
		//check the array accepts duplicates 
		int[]no=new int[3];
		no[0]=100;
		no[1]=200;
		no[2]=100;
		for(int i=0;i<no.length;i++) {
			System.out.println(no[i]);
		}
		
		// array to update the value
		
		char gender []=new char[2];
		gender[0]='M';
		gender[1]='F';
		gender[0]='F';
		
		
		System.out.println(Arrays.toString(gender));
		
		// to check null value is stored or not
		
		
		String city[]=new String[3];
		city[0]="Mysore";
		city[1]="Banglore";
		//city[2]=" ";
		
		System.out.println(Arrays.toString(city));
		
		
		int array1[]=new int[3];
		array1[0]=100;
		array1[1]=200;
		array1[2]=300;
		
		int array2[]=new int[3];
		array2[0]=100;
		array2[1]=200;
		array2[2]=3000;
		
		boolean equals = Arrays.equals(array1, array2);
		if(equals==true) {
			System.out.println("given two arrays are same");
		}
		else {
			System.out.println("given two arrays are not same");
		}
		
		
		
		String studentName[]=new String[3];
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Student name: ");
		
		for(int i=0;i<studentName.length;i++) {
			studentName[i]=s1.next();
			
			}
		System.out.println(Arrays.toString(studentName));
		
		int number[]=new int[4];
		number[0]=1000;
		number[1]=2000;
		number[2]=3000;
		number[3]=50;
		
		int noToCheck=50;
		
		for(int i=0;i<number.length;i++) {
			
			if(noToCheck==number[i]) {
				
				System.out.println(noToCheck +" is the part of array " + i);
			}
			else {
				System.out.println(noToCheck +" is not a part of array " + i);
			}
		}
		
		int array3[]=new int[3];
		array3[0]=100;
		array3[1]=200;
		array3[2]=300;
		
		int array4[]=new int[3];
		 for (int i = 0; i < array3.length; i++)  {
		
		array4[i] = array3[array3.length-1-i];
	}
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
		
		String one="heart";
		String two="earth";
		char[] charArray1 = one.toCharArray();
		Arrays.sort(charArray1);
		char[] charArray2 = two.toCharArray();
		Arrays.sort(charArray2);
		
		boolean equals1 = Arrays.equals(charArray1, charArray2);
		if(equals1==true) {
			System.out.println("Given two strings are anagram");
		}
		else {
			System.out.println("Given two strings are not anagram");
		}
		
	
			
		}
		
		
		
	
	
	
	}	
	

