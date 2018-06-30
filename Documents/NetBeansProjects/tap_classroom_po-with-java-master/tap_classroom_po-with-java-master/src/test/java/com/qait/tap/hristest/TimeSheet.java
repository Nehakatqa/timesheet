package com.qait.tap.hristest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;


public class TimeSheet   {
	WebDriver driver;
	TimeSheet(WebDriver driver)
	{
		//super(driver);
		this.driver=driver;
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	
}
