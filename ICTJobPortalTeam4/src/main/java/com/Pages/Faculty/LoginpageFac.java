package com.Pages.Faculty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageFac {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	private WebElement Pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement sub;
	@FindBy(xpath="//div[text()='Please, enter valid email address.']")
	private WebElement invalidmail;
	
	@FindBy(xpath = "//a[text()='Log In As Faculty']")
	private WebElement Facicon;
	
	public LoginpageFac(WebDriver driver)
	{this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	public void enterEmail(Object StrEmail) throws InterruptedException
	{Thread.sleep(3000);
		
		Email.sendKeys(StrEmail.toString());
	Thread.sleep(3000);
	}
	
	public void enterPassword(Object StrPassword) throws InterruptedException {
		Pass.sendKeys(StrPassword.toString());
		Thread.sleep(3000);
	}
	
	public void clicksubmit() throws InterruptedException
	{sub.click();
	Thread.sleep(3000);
	}
	
	
	public boolean Invalidid() throws InterruptedException
	{boolean Invalidmail=invalidmail.isDisplayed();
	return Invalidid();
	}

	public void clicklogasfac() throws InterruptedException
	{Facicon.click();
	Thread.sleep(1000);
	}
	
	
	
	
	

}