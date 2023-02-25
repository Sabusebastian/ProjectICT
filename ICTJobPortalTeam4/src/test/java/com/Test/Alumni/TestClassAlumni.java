package com.Test.Alumni;

import java.io.IOException;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.Base.BaseClass;
import com.Pages.Alumni.ApplyJobAlu;
import com.Pages.Alumni.LoginAlu;
import com.Pages.Alumni.LogoutAlu;
import com.Pages.Alumni.SearchJobsAlu;
import com.Pages.Alumni.SignupAlu;
import com.Utilities.AlertMsg;
import com.Utilities.ExcelUtility;

public class TestClassAlumni extends BaseClass {

	SignupAlu ObjSignupAlu;
	LoginAlu objLogin;
	AlertMsg ObjAlert;
	SearchJobsAlu objsearch;
	LogoutAlu objlogout;
	ApplyJobAlu ObjApplyJobAlu;
	LoginAlu ObjLoginAlu;

	@Test(priority = 1)
	public void Signupverification() throws InterruptedException, IOException {

		ObjSignupAlu = new SignupAlu(driver);

		ObjAlert = new AlertMsg();

		Random random = new Random();
		int number = random.nextInt(10000);

		Object alumniname = ExcelUtility.GetCellData(3, 3,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object email = number + ExcelUtility.GetCellData(3, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object mobilenumber = ExcelUtility.GetCellData(3, 12,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object course = ExcelUtility.GetCellData(3, 13,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object qualification = ExcelUtility.GetCellData(3, 6,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object batch = ExcelUtility.GetCellData(3, 17,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object placement = ExcelUtility.GetCellData(3, 15,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object password = ExcelUtility.GetCellData(3, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);

		ObjSignupAlu.clickLogin();
		ObjSignupAlu.EnterAlumniName(alumniname);

		ObjSignupAlu.EnterEmailAdress(email);
		ObjSignupAlu.EnterMobileNumber(mobilenumber);
		ObjSignupAlu.EnterCourse(course);
		ObjSignupAlu.EnterQualification(qualification);
		ObjSignupAlu.EnterBatch(batch);
		ObjSignupAlu.EnterPlacementStatus(placement);
		ObjSignupAlu.EnterPassWord(password);
		ObjSignupAlu.ClickSubmit();

		String ActualAlert = ObjAlert.AcceptAlert(driver);
		Assert.assertEquals(ActualAlert, "Data saved successfully");

	}

	@Test(priority = 2)
	public void Loginverification() throws InterruptedException, IOException {

		ObjLoginAlu = new LoginAlu(driver);
		ObjLoginAlu.movetoHome();
		ObjLoginAlu.clickLogin();
		ObjAlert = new AlertMsg();

		Object emailaddress = ExcelUtility.GetCellData(3, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object password = ExcelUtility.GetCellData(3, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);

		ObjLoginAlu.EnterEmail(emailaddress);
		ObjLoginAlu.EnterPassword(password);
		ObjLoginAlu.ClickSubmit();

		String ActualAlert = ObjAlert.AcceptAlert(driver);
		Assert.assertEquals(ActualAlert, "Login success");

	}

	@Test(priority = 2)
	public void SearchJobVerification() throws IOException, InterruptedException {

		objsearch = new SearchJobsAlu(driver);
		Object search = ExcelUtility.GetCellData(2, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);

		objsearch.SearchJob(search);

		objsearch.Clicksearch();
		Thread.sleep(2000);

		int count1 = objsearch.header();
		System.out.println("Total jobs displayed for the entered key word:" + count1);
		boolean m = count1 >= 0;
		Assert.assertTrue(m);

		// objsearch.Clickback();
	}

	@Test(priority = 3)
	public void ApplyJobVerification() throws InterruptedException, IOException {

		ObjApplyJobAlu = new ApplyJobAlu(driver);
		ObjApplyJobAlu.clickApply();

		Object yourname = ExcelUtility.GetCellData(3, 3,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object phonenumber = ExcelUtility.GetCellData(3, 12,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object emailaddress = ExcelUtility.GetCellData(3, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		Object qualification = ExcelUtility.GetCellData(3, 6,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object experience = ExcelUtility.GetCellData(3, 8,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object coursename = ExcelUtility.GetCellData(3, 13,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object branchname = ExcelUtility.GetCellData(3, 14,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object placementstatus = ExcelUtility.GetCellData(3, 15,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		Object companyname = ExcelUtility.GetCellData(3, 16,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		String resume = System.getProperty("user.dir") + "\\src\\main\\resources\\SRS.pdf";

		ObjApplyJobAlu.EnterYourName(yourname);
		ObjApplyJobAlu.EnterYourPhoneNumber(phonenumber);
		ObjApplyJobAlu.EnterYourEmailAddress(emailaddress);
		ObjApplyJobAlu.EnterYourQualification(qualification);
		ObjApplyJobAlu.EnteryourExperience(experience);
		ObjApplyJobAlu.EnterYourCourseName(coursename);
		ObjApplyJobAlu.EnterYourBranchName(branchname);
		ObjApplyJobAlu.EnterIsyouGotPlacedPreviously(placementstatus);
		ObjApplyJobAlu.EnterIfThenPlacedCompanyName(companyname);
		ObjApplyJobAlu.ShareYourResume(resume);
		ObjApplyJobAlu.ClickSubmit();

		String Alertmsg = ObjAlert.AcceptAlert(driver);
		Assert.assertEquals(Alertmsg, "Upload Success");

	}

	@Ignore
	@Test(priority = 3, description= "logout function verification")
	public void LogoutVerification() throws InterruptedException {
		objlogout = new LogoutAlu(driver);
		Object currenturl = driver.getCurrentUrl();
		objlogout.Clicklogout();
		Object newurl = driver.getCurrentUrl();
		Assert.assertNotEquals(newurl, currenturl, "The two urls are same-Test failed");
		
		
	}

}