package com.selenium.grotech;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class S_98_to_104_testNG {
	
	@Test
	public void test1() {
		System.out.println("test 1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("After suit");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BEfore suit");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}

}
