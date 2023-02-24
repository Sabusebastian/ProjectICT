package com.Pages.Employer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupEmp{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Log In As Employer']")
	private WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@placeholder='Enter your Company Name']")
	private WebElement CompanyName;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Enter your Phone no']")
	private WebElement PhoneNumber;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@placeholder='Enter your Designation']")
	private WebElement Designation;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;	
	
	public SignupEmp(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void ClickSignup() throws InterruptedException {
		Thread.sleep(5000);
		login.click();
		Thread.sleep(3000);
	}
	public void EnterName(Object name) {
		Name.sendKeys(name.toString());
	}
	public void EnterCompanyName(Object companyname) {
		CompanyName.sendKeys(companyname.toString());
	}
	public void EnterEmail(Object email) {
		Email.sendKeys(email.toString());
	}
	public void EnterPhoneNumber(Object phoneNumber) {
		PhoneNumber.sendKeys(phoneNumber.toString());
	}
	public void EnterPassword(Object password) {
		Password.sendKeys(password.toString());
	}
	public void EnterDesignation(Object designation) {
		Designation.sendKeys(designation.toString());
	}
	public void ClickSubmit() {
		Submit.click();
	}

}
