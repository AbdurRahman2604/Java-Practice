package com.retryanalyzer.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ST_112_Amazon_Fail {
	
	
	@Test(retryAnalyzer =com.retryanalyzer.testNG.ST_112_Amazon_Retry.class )
	public void search() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	WebElement searchTab = driver.findElement(By.id("twotabsearchtextboxe"));//wrong id value
	searchTab.sendKeys("phone");

}
}