package com.Test.Admin;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Base.BaseClass;
import com.Pages.Admin.LoginAd;
import com.Utilities.ExcelUtility;

public class TestClassAdmin extends BaseClass {

	LoginAd objLogin;

	// Pls note: Admin module Test cases are not added as the admin profile access has been denied on the given ICT website.

	@Test
	public void LoginPageVerification() throws IOException, InterruptedException {
		objLogin = new LoginAd(driver);

		String username = ExcelUtility.GetCellData(2, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 2);
		String password = ExcelUtility.GetCellData(2, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelHome.xlsx", 2);

		objLogin.clickGoToHome();
		objLogin.enterEmail(username);
		objLogin.enterPassword(password);
		objLogin.clickLogin();

	}

}