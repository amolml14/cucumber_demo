package com.saucedemo.pom;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview_PomClass 
{
	private WebDriver driver;
	
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement Finish;
	public void clickfinish()
	{
		Finish.click();
	}
	
	
	public Overview_PomClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	

}
