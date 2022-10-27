package com.timetracking.actiTIME.Automation.GenericUtility;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite()
	public void bsConfig() {
		System.out.println("dataBase connection has been established");
		}
	
	@BeforeClass()
	public void bcConfig() {
		System.out.println("The browser has been Launched");
		System.out.println("Navigated to Url");
	}
	@BeforeMethod()
	public void bmConfig() {
		System.out.println("Logged in to the application");
		
	}
	@AfterMethod()
	public void amConfig() {
		System.out.println("Logged out to the application");
		
	}
	@AfterClass()
	public void acConfig() {
		System.out.println("Browser has been closed");
		
	}
	@AfterSuite()
	public void asConfig() {
		System.out.println("dataBase connection ahs been closed");
		
	}
}


