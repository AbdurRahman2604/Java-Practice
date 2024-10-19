package com.java.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class D5_CurrentDate_TIme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDateTime currentTime = LocalDateTime.now();

	DateTimeFormatter format= DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
	
	String formatDateTime = currentTime.format(format);
	
	System.out.println(formatDateTime);
	
	
	}

}
