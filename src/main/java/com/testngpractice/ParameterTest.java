package com.testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParameterTest {
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailid"})
	public void yahooLoginTest(String url, String emailid) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\\\SelDrivers\\\\New folder\\\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.manage().window().maximize();
		    driver.get(url);
		    WebElement username = driver.findElement(By.id("login-username"));
		    username.clear();
		    username.sendKeys(emailid);
		    
		    WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-username']"));
		    loginBtn.submit();
	}
	 

}
