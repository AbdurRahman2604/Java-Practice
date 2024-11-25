package com.selenium.grotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class S_93_to_97_testNG {
	
	
	@Test(enabled=false)
	public void test() {
		System.out.println("Assignment 93");
	}
	
	@Test(priority = 0,enabled=false)
	public void signup() {
		System.out.println("signup");
	}
	@Test(priority = 1,enabled=false)
	public void signin() {
		System.out.println("signin");
	}
	@Test(priority =2,enabled=false)
	public void signout() {
		System.out.println("signout");
	}
	@Test(timeOut =1,enabled=false)
	public void timeOut() {
		WebDriver driver=new ChromeDriver();
		driver.get("www.google.com");
		driver.manage().window().maximize();
		
	}
	@Test(invocationCount =5)
	public void multipleTimes() {
		System.out.println("multiple times");
	}

}
