package com.selenium.grotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_79_80_Basic {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		//Assignment 79
		driver.get("https://www.facebook.com/");
		//Assignment 80
		driver.navigate().to("https://www.amazon.in/");
		WebElement customerService = driver.findElement(By.linkText("Customer Service"));
		customerService.click();
		
	
	
	}

}
