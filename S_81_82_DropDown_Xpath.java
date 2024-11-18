package com.selenium.grotech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S_81_82_DropDown_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://grotechminds.com/registration/");
//		driver.findElement(By.linkText("Automate me")).click();
//		driver.findElement(By.linkText("Read More")).click();

		WebElement skills = driver.findElement(By.id("Skills"));

		Select skill = new Select(skills);
		skill.selectByIndex(0);
		skill.selectByValue("select1");
		skill.selectByVisibleText("Non-Technical Skills");

		WebElement countries = driver.findElement(By.id("Country"));

		Select country = new Select(countries);
		country.selectByVisibleText("India");
		WebElement relegions = driver.findElement(By.id("Relegion"));

		Select relegion = new Select(relegions);
		relegion.selectByVisibleText("Muslim");
		// Assignment - 82
		
		WebElement fName = driver.findElement(By.xpath("//input[@id='fname']"));
		fName.sendKeys("Raja");
		
		
	}

}
