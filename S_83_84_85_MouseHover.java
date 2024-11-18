package com.selenium.grotech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S_83_84_85_MouseHover {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		WebElement fashion = driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
	
		Actions action=new Actions(driver);
		
		action.moveToElement(fashion).perform();
		
		WebElement footWear = driver.findElement(By.xpath("//a[.='Men Footwear']"));
	
		action.moveToElement(footWear).perform();
		
		WebElement shoes = driver.findElement(By.linkText("Men's Sports Shoes"));
		shoes.click();
		// assignment 85
		WebElement login = driver.findElement(By.linkText("Login"));
	
		action.contextClick().perform();
		// assignment 84
		WebElement cart = driver.findElement(By.linkText("Cart"));
		
		action.doubleClick().perform();
		
	}

}
