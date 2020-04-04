package com.naukri.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.HomePage;
import com.naukri.qa.pages.LoginPage;


public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
       super();
	}
	
	@BeforeMethod
	public void invokeBrowser() {
		log.info("first test cases file");
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void testLoginPageTitleTest() {
		log.info("first test cases file");
		String logInPagetitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(logInPagetitle, "Jobseeker's Sign in - Search & Apply to Latest Jobs Online | MonsterIndia");
	}
	
	@Test(priority=2)
	
	public void testMonsterImage() {
		log.info("second test cases file");
		boolean flag = loginPage.validateImage();
		Assert.assertTrue(flag);
	}
     
	@Test(priority=3)
	 public void  testLoginFunctionality() {
		homePage = loginPage.loginFunc(prop.getProperty("username"), prop.getProperty("password"));
	 }
	 
	 @AfterMethod
	 	 public void closeDown() {
		 driver.quit();
	 }

}
