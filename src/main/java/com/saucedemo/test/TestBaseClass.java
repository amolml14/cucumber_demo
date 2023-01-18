package com.saucedemo.test;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.saucedemo.pom.HomepagePom_Class;
import com.saucedemo.pom.LoginPom_Class;
import com.saucedemo.utility.Utility;

public class TestBaseClass 
{ 
	    WebDriver driver;
	    
		
		public WebDriver setUp() throws IOException
		{
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Open Browser");
		driver.manage().window().maximize();
		
		System.out.println("maximmize browser");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
		}
		
		
}