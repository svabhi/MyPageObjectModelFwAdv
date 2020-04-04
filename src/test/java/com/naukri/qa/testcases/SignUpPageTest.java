package com.naukri.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.HomePage;
import com.naukri.qa.pages.LoginPage;
import com.naukri.qa.pages.SignUpPage;
import com.naukri.qa.util.TestUtil;

public class SignUpPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	SignUpPage signUpPage;
	
	
	public SignUpPageTest() {
	       super();
		}
	
	@BeforeClass
	public void invokeBrowser() {
		initialization();
		signUpPage = new SignUpPage();
	}
	
	@Test
	public void SignUpPageDataEnterTest() {
			signUpPage.clickOnMonsterSingUpLink();
			signUpPage.enterDataSignUpPage("Raju", "Raju@emailid.com", "369486984986", "Software Tester");
	}
	
	@AfterClass
	public void closeDown11(){
		driver.quit();
	}

}
