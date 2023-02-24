package com.Pages.Alumni;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyJobAlu {

	@FindBy(xpath = "//button[text()='Apply ']")
	private WebElement Apply;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_name']")
	private WebElement Name;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_phone']")
	private WebElement PhoneNumber;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_email']")
	private WebElement EmailAdress;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_qualification']")
	private WebElement Qualification1;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_Experience']")
	private WebElement Experience;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_course']")
	private WebElement CourseName;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_branch']")
	private WebElement BranchName;

	@FindBy(xpath = "//input[@formcontrolname='Alumni_Placement']")
	private WebElement IsYouGotPlacedPreviously;

	@FindBy(xpath = "//input[@formcontrolname='Placed_company']")
	private WebElement IfThenEnterPlacedCompanyName;

	@FindBy(xpath = "//input[@formcontrolname='Resume']")
	private WebElement PleaseShareYourResume;

	@FindBy(xpath = "//button[@class='btn rounded my-2 btn-warning']")
	private WebElement Submit;

	WebDriver driver = null;

	public ApplyJobAlu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickApply() throws InterruptedException {
		Thread.sleep(3000);
		Apply.click();
		// JavascriptExecutor executor=(JavascriptExecutor)driver;
		// executor.executeScript("arguments[0].click();", Apply);
		Thread.sleep(3000);

	}

	public void EnterYourName(Object yourname) {
		Name.sendKeys(yourname.toString());
	}

	public void EnterYourPhoneNumber(Object phonenumber) {
		PhoneNumber.sendKeys(phonenumber.toString());
	}

	public void EnterYourEmailAddress(Object emailaddress) {
		EmailAdress.sendKeys(emailaddress.toString());
	}

	public void EnterYourQualification(Object qualification) {
		Qualification1.sendKeys(qualification.toString());
	}

	public void EnteryourExperience(Object experience) {
		Experience.sendKeys(experience.toString());
	}

	public void EnterYourCourseName(Object coursename) {
		CourseName.sendKeys(coursename.toString());
	}

	public void EnterYourBranchName(Object branchname) {
		BranchName.sendKeys(branchname.toString());
	}

	public void EnterIsyouGotPlacedPreviously(Object placementstatus) {
		IsYouGotPlacedPreviously.sendKeys(placementstatus.toString());
	}

	public void EnterIfThenPlacedCompanyName(Object companyname) {
		IfThenEnterPlacedCompanyName.sendKeys(companyname.toString());
	}

	public void ShareYourResume(String resume) throws InterruptedException {
		Thread.sleep(2000);
		PleaseShareYourResume.sendKeys(resume);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public void ClickSubmit() throws InterruptedException {
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);

		System.out.println("sample66");
		System.out.println("sample63333336");
	}

}