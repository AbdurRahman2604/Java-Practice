package com.selenium.grotech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class ST_111_114_DP3_Amazon {
	
	WebDriver driver;

	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
	}
	@DataProvider(name="datas")
	public Object[][] data(){
		return new Object[][] {
			{"Mobile"},
			{"Laptop"},
			{"TV"},
			{"Books"},
			{"Shirts"},
			{"Jeans"},
			{"Watch"},
			{"Perfume"},
			{"Airpod"},
			{"Headphone"}
			
		};
	}
	
	@Test(dataProvider="datas")
	public void search(String items) {
		
		WebElement searchTab = driver.findElement(By.id("twotabsearchtextbox"));
		searchTab.sendKeys(items);
		WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
		searchIcon.click();
		
		
	
	}
	@Test
	public void searchTab_assert() {
		WebElement searchTab = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(searchTab.isDisplayed(),"search tab is not displayed");
		Assert.assertTrue(searchTab.isEnabled(),"search tab is not enabled");
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
