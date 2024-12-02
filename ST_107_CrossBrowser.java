package com.selenium.grotech;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ST_107_CrossBrowser {
	
	WebDriver driver;
	@BeforeMethod 
	@Parameters("browser")
	public void launchBrowser(String nameOfBrowser) {
		if(nameOfBrowser.equals("Chrome")) {
		System.out.println("launching chrome browser");
		driver=new ChromeDriver();
		}
		if(nameOfBrowser.equals("Edge")) {
			System.out.println("launching edge browser");
			driver=new EdgeDriver();
			
			}
		
	
	}
	@Test
	public void searchProduct() {
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		WebElement click = driver.findElement(By.id("nav-search-submit-button"));
		click.click();
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	@AfterMethod
//	public void closeBrowser() {
//		driver.quit();
//	}
//	
	
		
		
	}


