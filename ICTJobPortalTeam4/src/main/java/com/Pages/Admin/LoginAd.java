package com.Pages.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class LoginAd extends BaseClass{ 
	
	@FindBy(xpath="//a[@title='Click To Go Home']")
	private WebElement HomeIcon;
	@FindBy(xpath = "//a[text()='Log In As Admin']")
	private WebElement LoginAsAd;
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement Email;
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='a']")
	private WebElement Submit;
	
	
	public LoginAd(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickGoToHome() throws InterruptedException
	{
		Thread.sleep(2000);
		HomeIcon.click();
		Thread.sleep(2000);
	}
	public void clickLogin() throws InterruptedException 
	{
		Thread.sleep(2000);
		LoginAsAd.click();
		Thread.sleep(2000);
	}
	public void enterEmail(String strEmail) throws InterruptedException 
	{
		Thread.sleep(2000);
		Email.sendKeys(strEmail);
		Thread.sleep(2000);
	}
	public void enterPassword(String strPassword) throws InterruptedException 
	{
		Thread.sleep(2000);	
		Password.sendKeys(strPassword);	
		Thread.sleep(2000);
	}
	public void clickSubmit() throws InterruptedException 
	{
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
	}
	
}
