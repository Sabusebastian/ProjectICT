package com.Pages.Faculty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupFac {

	WebDriver driver;
	@FindBy(xpath = "//a[@routerlink=\"faculty\"]")
	private WebElement Facicon;

	@FindBy(xpath = "//button[@routerlink='/facsignup']")
	private WebElement Sign;

	@FindBy(xpath = "//input[@placeholder='Enter your Name']")
	private WebElement Name;

	@FindBy(xpath = "//input[@placeholder='Enter your Email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@placeholder='Enter your Password']")
	private WebElement Pass;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Sub;
	@FindBy(xpath="//div[text()='Please, enter valid email address.']")
	private WebElement invalid;
	@FindBy(xpath="//div[text()='password is required.']")
	private WebElement invalidpass;
	@FindBy(xpath="//button[text()='Login..?']")
	private WebElement log;

	public SignupFac(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickonloginasFaculty() throws InterruptedException {
		Facicon.click();
		Thread.sleep(3000);
	}

	public void clickonSignup() throws InterruptedException {
		Sign.click();
		Thread.sleep(3000);
	}

	public void enterName(Object StrName) throws InterruptedException {
		Thread.sleep(3000);
		Name.sendKeys(StrName.toString());
		Thread.sleep(3000);
	}

	public void enterEmail(Object StrEmail) throws InterruptedException {
		Email.sendKeys(StrEmail.toString());
		Thread.sleep(3000);
	}

	public void enterPassword(Object StrPassword) throws InterruptedException {
		Pass.sendKeys(StrPassword.toString());
		Thread.sleep(3000);
	}

	public void clicksubmit() throws InterruptedException {
		Sub.click();
		Thread.sleep(3000);
	}
	public boolean Errormsg() throws InterruptedException
	{
		Thread.sleep(1000);
	
	boolean ErrorMsg=invalid.isDisplayed();
	return ErrorMsg;}

}