package com.Pages.Faculty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignoutFac {

	WebDriver driver;
	@FindBy(xpath="//a[text()='Logout Faculty']")
	private WebElement logout;
	
	public SignoutFac(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clicksignout()
	{logout.click();
	}
}