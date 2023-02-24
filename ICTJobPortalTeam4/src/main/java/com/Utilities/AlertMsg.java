package com.Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.Base.BaseClass;

public class AlertMsg extends BaseClass{

	
	public String AcceptAlert(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String alertMsg=driver.switchTo().alert().getText();
		System.out.println("ALERT MESSAGE DISPLAYED ON SCREEN: "+alertMsg);
		alert.accept();
		return alertMsg;
		
	}
}