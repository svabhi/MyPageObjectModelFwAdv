package com.naukri.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.util.TestUtil;

public class HomePage extends TestBase{
	TestUtil testUtil;
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@id=\"stickySidebar\"]/div[1]/div/div[1]/div[2]/h3") WebElement userId;
	@FindBy(xpath="//*[@id=\"stickySidebar\"]/div[1]/div/div[1]/div[2]/h5") WebElement userLocation;
	@FindBy(xpath="//*[@id=\"stickySidebar\"]/div[1]/div/div[2]/p") WebElement userPhoneNumber;
	@FindBy(xpath="//*[@id=\"stickySidebar\"]/div[1]/div/div[3]/p") WebElement userMailId;
	@FindBy(xpath="//*[@id=\"stickySidebar\"]/div[1]/div/a") WebElement updateProfileLink;
	@FindBy(xpath="//*[contains(@class,'profile-img-holder')]") WebElement profileId;
	
	//*[contains(@class,'profile-img-holder')]
	
	public String VerifyUserIdLable() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		highLighElememnt1(driver, userId);
		String label = userId.getText();
		System.out.println(label);
		return label;
		
	}
	
	public String VerifyUserLocationLable() {
		highLighElememnt1(driver, userLocation);
		return userLocation.getText();
		
	}
	
	public String VerifyuserPhoneNumberLable() {
		highLighElememnt1(driver, userPhoneNumber);
		return userPhoneNumber.getText();
	}
	
	public String VerifyUserMailIdLable() {
		highLighElememnt1(driver, userMailId);
		return userMailId.getText();
	}
	

	
	public MyProfile clickonLink() {
		highLighElememnt1(driver, updateProfileLink);
		
		updateProfileLink.click();
		return new MyProfile(); 
		
		
		

}
	
	public String getHomePageTitle() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();
	}
	
	
	

	
	
}
