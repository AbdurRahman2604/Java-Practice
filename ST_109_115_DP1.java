package com.selenium.grotech;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ST_109_115_DP1 {
	WebDriver driver;
	String text="C:\\Users\\monap\\OneDrive\\Desktop\\dummy.txt";

	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://grotechminds.com/registration/");
	}

	@DataProvider(name = "datas")
	public Object[][] data() {
		
		
		

//		Object[][] obj = new Object[1][6];
//		obj[0][0] = "raja";
//		obj[0][1] = "mona";
//		obj[0][2] = "raja@gmail.com";
//		obj[0][3] = "raja";
//		obj[0][4] = "Chennai";
//		obj[0][5] = "123";
		return new Object[][]{
			{"raja","mona","raja@gmail.com","raja","chennai","123"}
			
		};
	}

	@Test(dataProvider = "datas")
	public void registration(String fn, String ln, String Email, String pwd, String location, String pc) {

		WebElement firstName = driver.findElement(By.id("fname"));

		firstName.sendKeys(fn);

		WebElement lastName = driver.findElement(By.id("lname"));

		lastName.sendKeys(ln);

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys(Email);

		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys(pwd);

		WebElement gender = driver.findElement(By.id("male"));

		gender.click();

		WebElement address = driver.findElement(By.id("Present-Address"));

		address.sendKeys(location);
		WebElement paddress = driver.findElement(By.id("Permanent-Address"));

		paddress.sendKeys(location);

		WebElement pinCode = driver.findElement(By.id("Pincode"));

		pinCode.sendKeys(pc);
		
		WebElement file = driver.findElement(By.id("file"));

		file.sendKeys(text);
		WebElement relocate = driver.findElement(By.id("relocate"));

		relocate.click();

		WebElement submit = driver.findElement(By.cssSelector("button.btn"));

		submit.click();
		
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText().trim();
		
		alert.accept();
		
		Assert.assertEquals(actualText,"Registerd successfully!!","success message doesnt match");
		
		
	}

}
