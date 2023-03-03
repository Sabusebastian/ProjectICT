package com.Pages.Alumni;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchJobsAlu {

	WebDriver driver;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement Search;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbutton;

	@FindBy(xpath = "//button[text()='Back ']")
	private WebElement back;

	// @FindBy(xpath="//h5[text()='tester']")
	// private List<WebElement> header;

	@FindBy(xpath = "//h5[@class='card-title']")
	private List<WebElement> header;
	 @FindBy(xpath="//h1[text()='Ohh That Job Is Not Found']")
		
	    private WebElement header1;

	public SearchJobsAlu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void SearchJob(Object search) throws InterruptedException {
		Thread.sleep(2000);
		Search.sendKeys(search.toString());
		Thread.sleep(2000);
	}

	public void Clicksearch() throws InterruptedException {
		Thread.sleep(2000);
		searchbutton.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public void Clickback() throws InterruptedException {
		Thread.sleep(2000);
		back.click();
		Thread.sleep(2000);
	}

	public int header() throws InterruptedException {
		Thread.sleep(2000);
		int count = header.size();
		return count;
	}
	 public boolean header1() throws InterruptedException	
	 {
		 
		 Thread.sleep(2000);
	   
	   boolean isDisplayed=header1.isDisplayed();
	   
	   return isDisplayed;
	 }
	
}