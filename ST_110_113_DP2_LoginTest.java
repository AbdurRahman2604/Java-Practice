package com.selenium.grotech;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ST_110_113_DP2_LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@DataProvider(name = "datas")
	public Object[][] login() {

		return new Object[][] {

				// positive test case
				{ "student", "Password123", "Congratulations student. You successfully logged in!" },
				//negative test case
				{ "student", "Password", "Your password is invalid!" },
				{ "students", "Password123", "Your username is invalid!" } };
	}

	@Test(dataProvider = "datas")
	public void loginTest(String username, String password, String expectedResult) {

		WebElement uname = driver.findElement(By.id("username"));

		uname.sendKeys(username);

		WebElement pwd = driver.findElement(By.id("password"));

		pwd.sendKeys(password);

		WebElement btnSubmit = driver.findElement(By.id("submit"));

		btnSubmit.click();

		if (expectedResult.equals("Congratulations student. You successfully logged in!")) {
			WebElement btnLogout = driver.findElement(By.linkText("Log out"));

			Assert.assertTrue(btnLogout.isDisplayed(), "Logout button should be displayed");

		} else {
			WebElement errorMessage = driver.findElement(By.id("error"));

			Assert.assertEquals(errorMessage.getText(), expectedResult, "error message doesnt match");

		}

	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
