package com.naukri.qa.base;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.naukri.qa.util.TestUtil;

 


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public static Logger log = Logger.getLogger(TestBase.class);
	/*
	 * public static WebEventListener eventListener; public static
	 * EventFiringWebDriver e_driver;
	 */
	
	public TestBase() {
		String propertyFilePath = "D:\\Abhi\\NewProject\\MyPageObjectModelFw\\src\\main\\java\\com\\naukri\\qa\\config\\config.properties";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			prop = new Properties();
			
				prop.load(reader);
				log.info("peropery file has been read");
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			                 }
		
				}
	   public static void initialization() {
		   String browserName = prop.getProperty("browser");
		   
		if(browserName.equals("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "C:\\\\SelDrivers\\\\New folder\\\\chromedriver.exe");
		    driver = new ChromeDriver();
			log.warn("chrome browser got lauched and selected");
		    System.out.println("System entered in initiliztion method");
		    
		} 
		if(browserName.equals("FF")) {
		    System.setProperty("webdriver.gecko.driver", "C:\\\\SelDrivers\\\\New folder\\\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    log.info("FF browser got lauched and selected ");
		}
        
		if(browserName.equals("IE")) {
		    System.setProperty("webdriver.chrome.driver", "C:\\\\SelDrivers\\\\New folder\\\\chromedriver.exe");
		    driver = new ChromeDriver();
		    log.fatal("IE browser got lauched and selected ");
		  }
		
		/*
		 * e_driver = new EventFiringWebDriver(driver); eventListener = new
		 * WebEventListener(); e_driver.register(eventListener); driver = e_driver;
		 */
		     
	        driver.manage().window().maximize();
	        log.info("browser got lauched and selected ");
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().pageLoadTimeout(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	        
	        driver.get(prop.getProperty("url"));
	        
	}
	   
		public static void highLighElememnt1(WebDriver driver, WebElement webelement)
		{
			JavascriptExecutor js = (JavascriptExecutor)driver; 
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid green;');", webelement);
			
			try 
			{
			Thread.sleep(500);
			} 
			catch (InterruptedException e) {

			System.out.println(e.getMessage());
			} 

			js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", webelement); 
			
		}
		
	
  
}
