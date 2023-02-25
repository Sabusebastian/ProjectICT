package com.Test.Employer;

import java.io.IOException;
import java.util.Random;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.Employer.ApprovedPostEmp;
import com.Pages.Employer.EditJobEmp;
import com.Pages.Employer.LoginEmp;
import com.Pages.Employer.LogoutEmp;
import com.Pages.Employer.PostJobEmp;
import com.Pages.Employer.SignupEmp;
import com.Utilities.AlertMsg;
import com.Utilities.ExcelUtility;

public class TestClassEmployer extends BaseClass {

	SignupEmp ObjSignup;
	LoginEmp ObjLogin;
	AlertMsg ObjAlert;
	PostJobEmp ObjPostJob;
	EditJobEmp ObjEditJob;
	ApprovedPostEmp ObjApprovedPosts;
	LogoutEmp ObjLogout;

	
	@Test(priority = 1, description= "New user signup with valid details")
	public void SignupVerification() throws InterruptedException, IOException {

		ObjSignup = new SignupEmp(driver);
		ObjAlert = new AlertMsg();
		
		Random random= new Random();
		int rand= random.nextInt(1000);

		Object name = ExcelUtility.GetCellData(1, 3,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object companyname = ExcelUtility.GetCellData(1, 2,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object email = rand+ExcelUtility.GetCellData(1, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object password = ExcelUtility.GetCellData(1, 2,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object phoneNum = ExcelUtility.GetCellData(1, 12,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object designation = ExcelUtility.GetCellData(1, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);

		ObjSignup.ClickSignup();
		ObjSignup.EnterName(name);
		ObjSignup.EnterCompanyName(companyname);
		ObjSignup.EnterEmail(email);
		ObjSignup.EnterPassword(password);
		ObjSignup.EnterPhoneNumber(phoneNum);
		ObjSignup.EnterDesignation(designation);
		ObjSignup.ClickSubmit();
		String ActualAlert = ObjAlert.AcceptAlert(driver);
		Assert.assertEquals(ActualAlert, "registerd successfully");
	}

	
	@Test(priority = 2, description = "Login with valid username and password")
	public void LoginVerfication() throws InterruptedException, IOException {

		ObjLogin = new LoginEmp(driver);
		ObjAlert = new AlertMsg();

		ObjLogin.MovetoHome();
		ObjLogin.clickLogin();

		Object email = ExcelUtility.GetCellData(1, 1,System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 0);
		Object password = ExcelUtility.GetCellData(1, 2,System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 0);

		ObjLogin.EnterEmail(email);
		ObjLogin.EnterPassword(password);
		ObjLogin.ClickSubmit();
		
		String ActualAlert = ObjAlert.AcceptAlert(driver);

		Assert.assertEquals(ActualAlert, "Successfully logged in");

	}
	
	
	@Test(priority = 3, description = "Create New Job Post with Valid Details")
	public void CreateNewPostVerification() throws InterruptedException, IOException {

		ObjPostJob = new PostJobEmp(driver);
		ObjAlert = new AlertMsg();

		Object jobname = ExcelUtility.GetCellData(1, 1,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object companyname = ExcelUtility.GetCellData(1, 2,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object location = ExcelUtility.GetCellData(1, 3,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object salary = ExcelUtility.GetCellData(1, 4,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object jobtype = ExcelUtility.GetCellData(1, 5,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object qualifications = ExcelUtility.GetCellData(1, 6,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object jobdescription = ExcelUtility.GetCellData(1, 7,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object experience = ExcelUtility.GetCellData(1, 8,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object benefits = ExcelUtility.GetCellData(1, 9,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object schedule = ExcelUtility.GetCellData(1, 10,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object language = ExcelUtility.GetCellData(1, 11,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object contact = ExcelUtility.GetCellData(1, 12,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);

		ObjPostJob.CreateNewPost();
		ObjPostJob.EnterJobName(jobname);
		ObjPostJob.EnterCompanyName(companyname);
		ObjPostJob.EnterLocation(location);
		ObjPostJob.EnterSalary(salary);
		ObjPostJob.EnterJobType(jobtype);
		ObjPostJob.EnterQualifications(qualifications);
		ObjPostJob.EnterJobDescription(jobdescription);
		ObjPostJob.EnterExperience(experience);
		ObjPostJob.EnterBenefits(benefits);
		ObjPostJob.EnterSchedule(schedule);
		ObjPostJob.EnterLanguage(language);
		ObjPostJob.EnterContact(contact);
		ObjPostJob.SubmitJob();

		String ActualAlert = ObjAlert.AcceptAlert(driver);
		Assert.assertEquals(ActualAlert, "Job Posted");
	}
	
	
	@Test(priority = 4, description = "Edit Job Post with new Details")
	public void EditPostVerification() throws InterruptedException, IOException {

		ObjEditJob = new EditJobEmp(driver);
		ObjAlert = new AlertMsg();
		
		Object jobname = ExcelUtility.GetCellData(2, 1,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object companyname = ExcelUtility.GetCellData(2, 2,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object location = ExcelUtility.GetCellData(2, 3,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object salary = ExcelUtility.GetCellData(2, 4,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object jobtype = ExcelUtility.GetCellData(2, 5,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object qualifications = ExcelUtility.GetCellData(2, 6,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object jobdescription = ExcelUtility.GetCellData(2, 7,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object experience = ExcelUtility.GetCellData(2, 8,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object benefits = ExcelUtility.GetCellData(2, 9,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object schedule = ExcelUtility.GetCellData(2, 10,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object language = ExcelUtility.GetCellData(2, 11,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);
		Object contact = ExcelUtility.GetCellData(2, 12,
				System.getProperty("user.dir") + "\\src\\\\main\\\\resources\\\\ExcelHome.xlsx", 1);

		ObjEditJob.ClickViewJob();
		ObjEditJob.ClickEditJob();
		ObjEditJob.EditJobName(jobname);
		ObjEditJob.EditCompanyName(companyname);
		ObjEditJob.EditLocation(location);
		ObjEditJob.EditSalary(salary);
		ObjEditJob.EditJobType(jobtype);
		ObjEditJob.EditQualifications(qualifications);
		ObjEditJob.EditJobDescription(jobdescription);
		ObjEditJob.EditExperience(experience);
		ObjEditJob.EditBenefits(benefits);
		ObjEditJob.EditSchedule(schedule);
		ObjEditJob.EditLanguage(language);
		ObjEditJob.EditContact(contact);
		ObjEditJob.ClickUpdate();
		

		String ActualAlert = ObjAlert.AcceptAlert(driver);
		Assert.assertEquals(ActualAlert, "data updated");

	}
	
	
	
	@Test(priority=5, description = "View resume from approved posts")
	public void ViewResumeVerification() throws InterruptedException {
	    ObjApprovedPosts = new ApprovedPostEmp(driver);
	    
	    String firstWindowHandle = driver.getWindowHandle();
	    
	    ObjApprovedPosts.ClickApprovedPosts();
	    ObjApprovedPosts.ClickViewResume();
	    
	    Thread.sleep(3000);
	    
	    Set<String> windowHandles = driver.getWindowHandles();
	    String secondWindowHandle = "";
	    for (String handle : windowHandles) {
	        if (!handle.equals(firstWindowHandle)) {
	            secondWindowHandle = handle;
	            break;
	        }
	    }
	 
	    driver.switchTo().window(secondWindowHandle);
	    String SecondTabURL = driver.getCurrentUrl();
	    Thread.sleep(2000);
	    driver.switchTo().window(firstWindowHandle);
	    String firstTabURL = driver.getCurrentUrl();
	    System.out.println(firstTabURL);
	    System.out.println(SecondTabURL);
	    Assert.assertNotEquals(firstTabURL, SecondTabURL, "The URLs are same");    
	}

	
	
	@Test(priority=6, description = "Logout function verification")
	public void LogOutVerification() throws InterruptedException{
		
		ObjLogout= new LogoutEmp(driver);
		
		ObjLogout.ClickLogout();
		Object Header = ObjLogout.LoginPageHeader();
		Assert.assertEquals(Header, "Employer Login");
		
		System.out.println("Test Finished");
		
	}

}
