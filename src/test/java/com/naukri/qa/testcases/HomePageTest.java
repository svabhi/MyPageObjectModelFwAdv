package com.naukri.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.pages.HomePage;
import com.naukri.qa.pages.LoginPage;
import com.naukri.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	
	public HomePageTest() {
		super();
	}
	
	@BeforeClass
	public void invokeBrower() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loginFunc(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void homePagetitleTest() {
		String hptitle = homePage.getHomePageTitle();
		Assert.assertEquals(hptitle, "My Dashboard | Monster India");
	}
	
	@Test(priority=2)
	public void testuserId() {
	    String actuserId = homePage.VerifyUserIdLable(); 
	    Assert.assertEquals(actuserId, "Abhi S");
	}
	
	@Test(priority=3)
	public void testUserLocation() {
	    String actuuserLocation = homePage.VerifyUserLocationLable(); 
	    Assert.assertEquals(actuuserLocation, "Hyderabad / Secunderabad");
	}
	
	@Test(priority=4)
	public void d() {
	    String actuserPhoneNumber = homePage.VerifyuserPhoneNumberLable(); 
	    Assert.assertEquals(actuserPhoneNumber, "+91 8328598037");
	}
	
	@Test(priority=5)
	public void testUserMailId() {
	    String actuserMailId = homePage.VerifyUserMailIdLable(); 
	    Assert.assertEquals(actuserMailId, "callabhimanyu@gmail.com");
	}
	
	public void clickonupdateProfilelink () {
		homePage.clickonLink();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	
	}
		
	
	@AfterClass
	public void closeDown() {
		driver.quit();
	}
	

}
