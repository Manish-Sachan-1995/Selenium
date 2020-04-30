package com.assessment.SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class A1_TC002_Filling_ContactForm extends Base {
	
	WebDriver driver;
	
	@Test
	public void TestMethod() throws IOException {
		
		InputStream input = new FileInputStream(getPropFileLocation()); 

        Properties prop = new Properties();

        // load a properties file
        prop.load(input);
		//Launch firefox or chrome browser 
		if(prop.getProperty("browser_name").equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", getGhekoDriverLocation());
		driver = new FirefoxDriver();  
		}
		
		else if(prop.getProperty("browser_name").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", getChromeDriverLocation());
			driver = new ChromeDriver();  
			}
		
		
		driver.manage().deleteAllCookies();
	    
	    //Implicit wait, wait for at least some time (30 sec) to identify an element, //if can't find the element with in 10 
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    //open the url or AUT 
	    driver.get(prop.getProperty("URL2"));
	    
		driver.findElement(By.xpath(getFirstName())).sendKeys(prop.getProperty("fName"));
		driver.findElement(By.xpath(getLastName())).sendKeys(prop.getProperty("lName"));
		driver.findElement(By.xpath(getCountry())).sendKeys(prop.getProperty("nation"));
		driver.findElement(By.xpath(getSubject())).sendKeys(prop.getProperty("sub"));
		
		WebElement el=driver.findElement(By.partialLinkText("Link"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).click(el).keyUp(Keys.SHIFT).build().perform();
		WebElement el1=driver.findElement(By.partialLinkText("Link is"));
		act.keyDown(Keys.SHIFT).click(el1).keyUp(Keys.SHIFT).build().perform();
		
		if(driver.findElement(By.xpath(getSubmit())).isDisplayed()) {
		driver.findElement(By.xpath(getSubmit())).click();
		System.out.println("Form Submitted successfully");
		driver.quit();
		}
		else {
			System.out.println("Submit button is missing");
			driver.quit();
		}
		
	}
}
