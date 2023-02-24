package com.Pages.Alumni;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutAlu {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Logout Alumni']")
	private WebElement Logout;

	public LogoutAlu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Clicklogout() throws InterruptedException {
		Thread.sleep(3000);
		Logout.click();
		Thread.sleep(2000);
	}

}