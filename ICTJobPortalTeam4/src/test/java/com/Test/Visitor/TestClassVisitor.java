package com.Test.Visitor;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.Visitor.ManageVis;
import com.Utilities.ExcelUtility;

public class TestClassVisitor extends BaseClass {

	ManageVis objManageVis;

	@Test(priority = 1 ,description="search a valid job name")
	public void SearchJobinVisitorPage() throws IOException, InterruptedException {
		objManageVis = new ManageVis(driver);

		Object JbName = ExcelUtility.GetCellData(1, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 1);
		objManageVis.EnterJobname(JbName);
		objManageVis.clickSearch();
		Thread.sleep(2000);
		objManageVis.ResultCount();

		int count1 = objManageVis.ResultCount();
		System.out.println("Total jobs displayed for the entered key word:" + count1);
		boolean m = count1 >= 0;
		Assert.assertTrue(m);
		objManageVis.clickonReadmore();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);

	}

	@Test(priority = 2, description="search a invalid job name")
	public void JobNameSearch() throws IOException, InterruptedException {
		objManageVis = new ManageVis(driver);
		Object JbName = ExcelUtility.GetCellData(0, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		objManageVis.EnterJobname(JbName);
		objManageVis.clickSearch();
		Thread.sleep(2000);
		 objManageVis.ResultCount();
		 int count1 = objManageVis.ResultCount();
			System.out.println("Total jobs displayed for the entered key word:" + count1);
		objManageVis.clickBack();
		
		Thread.sleep(3000);

	}
	@Test(priority = 3, description="checking the status of search button when passing a null value to the job name field")
	public void statusSearchButton() throws IOException, InterruptedException
	{
		objManageVis = new ManageVis(driver);
		Object JbName = ExcelUtility.GetCellData(20, 50,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 0);
		objManageVis.EnterJobname(JbName);
		objManageVis.clickSearch();
		boolean actual=false;
		boolean expected=objManageVis.checkStatusofSearchButton();
		Assert.assertEquals(actual, expected);
		System.out.println("CLICK BUTTON IS NOT ENABLED WITH EMPTY FIELD AS JOB NAME");
		objManageVis.clickBack();
		Thread.sleep(3000);
		
		

	}
	
	
	
	
	
}




