package com.Pages.Employer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostJobEmp {

	@FindBy(xpath = "//a[@routerlink='postjob']")
	private WebElement PostJob;

	@FindBy(id = "Jobname")
	private WebElement JobName;

	@FindBy(id = "CompanyName")
	private WebElement CompanyName;

	@FindBy(id = "Place")
	private WebElement Location;

	@FindBy(id = "Salary")
	private WebElement Salary;

	@FindBy(id = "JobType")
	private WebElement JobType;

	@FindBy(id = "Qualifications")
	private WebElement Qualifications;

	@FindBy(id = "JobDescription")
	private WebElement JobDescription;

	@FindBy(id = "Experience")
	private WebElement Experience;

	@FindBy(id = "Benefits")
	private WebElement Benefits;

	@FindBy(id = "Schedule")
	private WebElement Schedule;

	@FindBy(id = "Language")
	private WebElement Language;

	@FindBy(id = "Contact")
	private WebElement Contact;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//a[text()='Dashboard']")
	private WebElement Dashboard;
	
	WebDriver driver;

	public PostJobEmp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void CreateNewPost() throws InterruptedException {
		Thread.sleep(5000);
		PostJob.click();
	}

	public void EnterJobName(Object jobname) throws InterruptedException {
		Thread.sleep(2000);
		JobName.sendKeys(jobname.toString());
	}

	public void EnterCompanyName(Object companyname) throws InterruptedException {
		Thread.sleep(500);
		CompanyName.sendKeys(companyname.toString());
	}

	public void EnterLocation(Object location) throws InterruptedException {
		Thread.sleep(500);
		Location.sendKeys(location.toString());
	}

	public void EnterSalary(Object salary) throws InterruptedException {
		Thread.sleep(500);
		Salary.sendKeys(salary.toString());
	}

	public void EnterJobType(Object jobtype) throws InterruptedException {
		Thread.sleep(500);
		JobType.sendKeys(jobtype.toString());
	}

	public void EnterQualifications(Object qualifications) throws InterruptedException {
		Thread.sleep(500);
		Qualifications.sendKeys(qualifications.toString());
	}

	public void EnterJobDescription(Object jobdescription) throws InterruptedException {
		Thread.sleep(500);
		JobDescription.sendKeys(jobdescription.toString());
	}

	public void EnterExperience(Object experience) throws InterruptedException {
		Thread.sleep(500);
		Experience.sendKeys(experience.toString());
	}

	public void EnterBenefits(Object benefits) throws InterruptedException {
		Thread.sleep(500);
		Benefits.sendKeys(benefits.toString());
	}

	public void EnterSchedule(Object schedule) throws InterruptedException {
		Thread.sleep(500);
		Schedule.sendKeys(schedule.toString());
	}

	public void EnterLanguage(Object language) throws InterruptedException {
		Thread.sleep(500);
		Language.sendKeys(language.toString());
	}

	public void EnterContact(Object contact) throws InterruptedException {
		Thread.sleep(500);
		Contact.sendKeys(contact.toString());
		
	}
	public void SubmitJob() throws InterruptedException {
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		
		Thread.sleep(2000);

		Submit.click();
	}
	public boolean IsSubmitButtonEnabled() throws InterruptedException {
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 350)");
		
		Thread.sleep(2000);

		boolean isEnabled= Submit.isEnabled();
		return isEnabled;
	}
	public void ClickDashboard() throws InterruptedException {
		Thread.sleep(1000);
		Dashboard.click();
		Thread.sleep(2000);

	}
	

}
