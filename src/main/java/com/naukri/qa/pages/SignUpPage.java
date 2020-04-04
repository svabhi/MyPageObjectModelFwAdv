package com.naukri.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.naukri.qa.base.TestBase;
import com.naukri.qa.util.TestUtil;

public class SignUpPage extends TestBase {
	SignUpPage signUpPage;
	LoginPage loginPage;
	TestBase testBase;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[contains(@class,'btn line-btn fl txt-ac')]") WebElement newToMonsterLink;
	@FindBy(name="fullname") WebElement fullName;
	@FindBy(name="email") WebElement emailField;
	@FindBy(name="Mobile Number") WebElement mobileNumberField;
	@FindBy(name="keywords") WebElement keyworkdsField;
	@FindBy(xpath="//input[@name='function' and @type='text']") WebElement preferredFunctionSelect;

	public void clickOnMonsterSingUpLink () {
		newToMonsterLink.click();
		System.out.println("System enter into clickOnMonsterSingUpLink");

	
		 	}
    public void enterDataSignUpPage(String fulname, String emailid, String mobnum, String kw) {
    	highLighElememnt1(driver, fullName);
    	fullName.sendKeys(fulname);
    	highLighElememnt1(driver, emailField);
    	emailField.sendKeys(emailid);
    	highLighElememnt1(driver, mobileNumberField);
    	mobileNumberField.sendKeys(mobnum);
    //	highLighElememnt1(driver, keyworkdsField);
    //	keyworkdsField.sendKeys(kw);
    	
		/*
		 * highLighElememnt1(driver, preferredFunctionSelect); Select select = new
		 * Select(preferredFunctionSelect); select.selectByVisibleText(title);
		 */
    	
    }

}
