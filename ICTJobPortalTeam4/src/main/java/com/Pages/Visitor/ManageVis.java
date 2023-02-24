package com.Pages.Visitor;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class ManageVis extends BaseClass{
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter Job Name to Search']")
	private WebElement jobname;

	@FindBy(xpath="//button[text()='Search']")
	private WebElement searchbutton;

	@FindBy(xpath="//button[text()='read more']")
	private WebElement readmore;
	
	
	@FindBy(xpath="//button[text()='Back ']")
	private WebElement backbutton;

	@FindBy(xpath="//h5[@class='card-title']")
	private List<WebElement> result;

	
	
	public ManageVis(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	
	public void EnterJobname(Object JbName) throws InterruptedException
	{
		jobname.sendKeys( JbName.toString() );
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		searchbutton.click();
		Thread.sleep(3000);
		
	}
	public int ResultCount() throws InterruptedException
	{
	
		int count=result.size();
		//System.out.println("Total jobs displayed for the entered key word: "+count);
		return count;
		
	}
	
	
	public void clickonReadmore() throws InterruptedException
	{
		readmore.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,350)", "");
	}
	public void clickBack() throws InterruptedException
	{
		backbutton.click();
		Thread.sleep(2000);
	}
}