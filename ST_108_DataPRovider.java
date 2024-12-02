package com.selenium.grotech;

import java.awt.RenderingHints.Key;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ST_108_DataPRovider {
	
	
	WebDriver driver; 
	@DataProvider(name = "searchData")
	public Object[][] data() {

		Object data[][] = new Object[2][1];
		data[0][0] = "Banglore";
		data[1][0] = "Chennai";
		return data;

	}
	
	public void screenShot() throws IOException {
		String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_MM_yy_HH_mm_ss"));
		TakesScreenshot t1=(TakesScreenshot) driver;
		File source = t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:\\Eclipse_GroTechMInd\\Selenium\\ScreenShots\\dataprovider "+ timeStamp +".png");
		FileHandler.copy(source, destination);
		
	}

	@Test(dataProvider = "searchData")
	public void googleSearch(String name) throws IOException {

		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(name + Keys.ENTER);
		
		screenShot();

	}

}
