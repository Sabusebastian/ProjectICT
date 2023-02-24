package com.Pages.Employer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutEmp {

	@FindBy(xpath = "//a[text()='Log Out']")
	private WebElement Logout;

	@FindBy(xpath = "//h2[text()='Employer Login']")
	private WebElement loginpageheader;

	WebDriver driver;

	public LogoutEmp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickLogout() throws InterruptedException {
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		
		Thread.sleep(1000);

		Logout.click();
		
		Thread.sleep(3000);
	}

	public String LoginPageHeader() throws InterruptedException {
		Thread.sleep(3000);
		String text = loginpageheader.getText();
		return text;
	}

}
