package com.Pages.Employer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditJobEmp {

	@FindBy(xpath = "//a[text()='View Job']")
	private WebElement ViewJob;

	@FindBy(xpath = "(//h5[text()='Business Analyst'])[1]//following-sibling::button")
	private WebElement Edit;

	@FindBy(xpath = "//input[@name= 'Jobname']")
	private WebElement JobName;

	@FindBy(xpath = "//input[@name= 'CompanyName']")
	private WebElement CompanyName;

	@FindBy(xpath = "//input[@name= 'Place']")
	private WebElement Location;

	@FindBy(xpath = "//input[@name= 'Salary']")
	private WebElement Salary;

	@FindBy(xpath = "//input[@name= 'JobType']")
	private WebElement JobType;

	@FindBy(xpath = "//input[@name= 'Qualifications']")
	private WebElement Qualifications;

	@FindBy(xpath = "//input[@name= 'JobDescription']")
	private WebElement JobDescription;

	@FindBy(xpath = "//input[@name= 'Experience']")
	private WebElement Experience;

	@FindBy(xpath = "//input[@name= 'Benefits']")
	private WebElement Benefits;

	@FindBy(xpath = "//input[@name= 'Schedule']")
	private WebElement Schedule;

	@FindBy(xpath = "//input[@name= 'Language']")
	private WebElement Language;

	@FindBy(xpath = "//input[@name= 'Contact']")
	private WebElement Contact;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Update;

	WebDriver driver;

	public EditJobEmp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickViewJob() throws InterruptedException {

		Thread.sleep(2000);

		ViewJob.click();
	}

	public void ClickEditJob() throws InterruptedException {

		Thread.sleep(2000);
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Edit);

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0, 350)");

		Thread.sleep(2000);

		//Edit.click();
	}

	public void EditJobName(Object jobname) throws InterruptedException {
		Thread.sleep(3000);
		JobName.clear();
		JobName.sendKeys(jobname.toString());
	}

	public void EditCompanyName(Object companyname) throws InterruptedException {
		Thread.sleep(500);
		CompanyName.clear();
		CompanyName.sendKeys(companyname.toString());
	}

	public void EditLocation(Object location) throws InterruptedException {
		Thread.sleep(500);
		Location.clear();
		Location.sendKeys(location.toString());
	}

	public void EditSalary(Object salary) throws InterruptedException {
		Thread.sleep(500);
		Salary.clear();
		Salary.sendKeys(salary.toString());
	}

	public void EditJobType(Object jobtype) throws InterruptedException {
		Thread.sleep(500);
		JobType.clear();
		JobType.sendKeys(jobtype.toString());
	}

	public void EditQualifications(Object qualifications) throws InterruptedException {
		Thread.sleep(500);
		Qualifications.clear();
		Qualifications.sendKeys(qualifications.toString());
	}

	public void EditJobDescription(Object jobdescription) throws InterruptedException {
		Thread.sleep(500);
		JobDescription.clear();
		JobDescription.sendKeys(jobdescription.toString());
	}

	public void EditExperience(Object experience) throws InterruptedException {
		Thread.sleep(500);
		Experience.clear();
		Experience.sendKeys(experience.toString());
	}

	public void EditBenefits(Object benefits) throws InterruptedException {
		Thread.sleep(500);
		Benefits.clear();
		Benefits.sendKeys(benefits.toString());
	}

	public void EditSchedule(Object schedule) throws InterruptedException {
		Thread.sleep(500);
		Schedule.clear();
		Schedule.sendKeys(schedule.toString());
	}

	public void EditLanguage(Object language) throws InterruptedException {
		Thread.sleep(500);
		Language.clear();
		Language.sendKeys(language.toString());
	}

	public void EditContact(Object contact) throws InterruptedException {
		Thread.sleep(500);
		Contact.clear();
		Contact.sendKeys(contact.toString());
	}

	public void ClickUpdate() throws InterruptedException {
		Thread.sleep(2000);

	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0, 350)");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Update);

		Thread.sleep(3000);

	//	Update.click();
	}

}
