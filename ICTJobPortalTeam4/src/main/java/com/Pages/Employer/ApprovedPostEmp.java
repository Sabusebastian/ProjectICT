package com.Pages.Employer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApprovedPostEmp {

	@FindBy(xpath = "//a[text()='Approved Posts']")
	private WebElement ApprovedPosts;

	@FindBy(xpath = "(//h5[@class='card-title text-center']//parent::div//child::button)[1]")
	private WebElement ViewResume;

	WebDriver driver;

	public ApprovedPostEmp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void ClickApprovedPosts() throws InterruptedException {
		Thread.sleep(3000);
		ApprovedPosts.click();
	}

	public void ClickViewResume() throws InterruptedException {

		Thread.sleep(2000);

	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0, 350)");
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ViewResume);
		Thread.sleep(3000);
		
	//	ViewResume.click();
	}

}
