package com.selenium.grotech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ST_105_106_testNg {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void searchProduct() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		WebElement cart = driver.findElement(By.id("a-autoid-1-announce"));
		cart.click();
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
