package com.Pages.Employer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEmp {
	
	@FindBy(xpath="//a[@title='Click To Go Home']")
	private WebElement HomeIcon;
	
	@FindBy(xpath="//a[text()='Log In As Employer']")
	private WebElement loginmenu;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;	
	
	WebDriver driver;
	
	public LoginEmp(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void MovetoHome() throws InterruptedException {
		Thread.sleep(3000);
		HomeIcon.click();
		Thread.sleep(3000);
	}
	public void clickLogin() throws InterruptedException {
		loginmenu.click();
		Thread.sleep(3000);
		login.click();
		Thread.sleep(3000);
	}
	public void EnterEmail(Object email) {
		Email.sendKeys(email.toString());
	}
	
	public void EnterPassword(Object password) {
		Password.sendKeys(password.toString());
	}
	
	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
	}
}
