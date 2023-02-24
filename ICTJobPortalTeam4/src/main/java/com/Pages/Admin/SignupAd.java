package com.Pages.Admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Base.BaseClass;

public class SignupAd extends BaseClass
{
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement SignUpBtn;
	@FindBy(xpath="//input[@formcontrolname='name']")
	private WebElement Name;
	@FindBy(xpath ="//input[@formcontrolname='email']" )
	private WebElement Email;
	@FindBy(xpath =" //input[@formcontrolname='mobile']")
	private WebElement Mobile;
	@FindBy (xpath ="//input[@formcontrolname='course']")
	private WebElement Course;
	@FindBy(xpath="//input[@formcontrolname='qualification']")
	private WebElement Qualificatipon;
	@FindBy(xpath = "//select[@formcontrolname='batch']")
	private WebElement Batch;
	@FindBy(xpath = "//input[@formcontrolname='placement']")
	private WebElement Placement;
	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;
	
	
}
