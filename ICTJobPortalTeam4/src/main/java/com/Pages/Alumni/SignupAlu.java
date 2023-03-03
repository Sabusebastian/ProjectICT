package com.Pages.Alumni;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupAlu {

	@FindBy(xpath = "//a[text()='Log In As Alumni']")
	private WebElement loginmenu;

	@FindBy(xpath = "//a[text()='Signup? ']")
	private WebElement signup;

	@FindBy(xpath = "//input[@formcontrolname='name']")
	private WebElement AlumniName;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	private WebElement EmailAddress;

	@FindBy(xpath = "//input[@formcontrolname='mobile']")
	private WebElement MobileNumber1;

	@FindBy(xpath = "//input[@formcontrolname='course']")
	private WebElement Course;

	@FindBy(xpath = "//input[@formcontrolname='qualification']")
	private WebElement Qualification;

	@FindBy(xpath = "//select[@formcontrolname='batch']")
	private WebElement Batch;

	@FindBy(xpath = "//input[@formcontrolname='placement']")
	private WebElement PlacementStatus;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;
	
	
	@FindBy(xpath="//div[text()='Please, enter valid email address.']")
	private WebElement invalidemail;
	
	@FindBy(xpath="//div[text()='mobilenumber is required.']")
	private WebElement invalidnumber;
	
	@FindBy(xpath="//button[text()='Login..?']")
	private WebElement login;


	WebDriver driver = null;

	public SignupAlu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickLogin() throws InterruptedException {
		loginmenu.click();
		Thread.sleep(3000);
		signup.click();
		Thread.sleep(3000);
	}

	public void EnterAlumniName(Object alumniname) throws InterruptedException {
		AlumniName.sendKeys(alumniname.toString());
		Thread.sleep(1000);

	}

	public void EnterEmailAdress(Object emailaddress) throws InterruptedException {
		EmailAddress.sendKeys(emailaddress.toString());
		Thread.sleep(1000);

	}

	public void EnterMobileNumber(Object mobilenumber) throws InterruptedException {
		MobileNumber1.sendKeys(mobilenumber.toString());
		Thread.sleep(1000);

	}

	public void EnterCourse(Object course) throws InterruptedException {
		Course.sendKeys(course.toString());
		Thread.sleep(1000);

	}

	public void EnterQualification(Object qualification) throws InterruptedException {
		Qualification.sendKeys(qualification.toString());
		Thread.sleep(1000);

	}

	public void EnterBatch(Object batch) throws InterruptedException {
		Thread.sleep(2000);
		Select select = new Select(Batch);
		select.selectByVisibleText(batch.toString());

		Batch.sendKeys(batch.toString());
	}

	public void EnterPlacementStatus(Object placementstatus) throws InterruptedException {
		Thread.sleep(2000);
		PlacementStatus.sendKeys(placementstatus.toString());
	}

	public void EnterPassWord(Object password) throws InterruptedException {
		Thread.sleep(2000);
		Password.sendKeys(password.toString());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
	}
	
	public boolean Errormsg() throws InterruptedException
	{
		Thread.sleep(1000);
	
	boolean ErrorMsg=invalidemail.isDisplayed();
	return ErrorMsg;}
	public boolean Invalidpass() throws InterruptedException
	{Thread.sleep(1000);
	boolean Invailnumber=invalidnumber.isDisplayed();
			return Invailnumber ;
	}
	
	public void Disabledbutton() throws InterruptedException
	{login.click();
	Thread.sleep(1000);
	}
	
	
}
