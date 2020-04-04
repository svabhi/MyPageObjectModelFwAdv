package com.naukri.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory
		
	@FindBy(xpath="//input[@id='signInName']") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//input[@value='Login']") WebElement logInBtn;
	@FindBy(css="div.monster-logo>a:nth-child(1)>img") WebElement monsterImage;
	
	
	
	public LoginPage(){
    PageFactory.initElements(driver, this);		
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
    public boolean validateImage() {
    	return monsterImage.isDisplayed();
    }
    
    public HomePage loginFunc(String un, String pwd) {
    	highLighElememnt1(driver, username);
    	username.sendKeys(prop.getProperty("username"));
    	highLighElememnt1(driver, password);
    	password.sendKeys(prop.getProperty("password"));
    	highLighElememnt1(driver, logInBtn);
    	
    	logInBtn.click();
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
    	return new HomePage();
    }

}
