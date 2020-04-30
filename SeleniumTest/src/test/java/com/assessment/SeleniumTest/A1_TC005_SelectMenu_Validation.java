package com.assessment.SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A1_TC005_SelectMenu_Validation extends Base{
	
	WebDriver driver;
	@Test
public void TestMethod() throws IOException, InterruptedException {
		
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
	    driver.get(prop.getProperty("URL5"));
	    
	   
	    driver.findElement(By.xpath(getSpeedButton())).click();  
	    driver.findElement(By.xpath(getSpeedType())).click();
	    driver.findElement(By.xpath(getFileButton())).click();
	    driver.findElement(By.xpath(getFileType())).click();
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)");
	    
	    driver.findElement(By.xpath(getNumberButton())).click();
	    driver.findElement(By.xpath(getNumber())).click();
	    driver.findElement(By.xpath(getSalutationButton())).click();
	    driver.findElement(By.xpath(getSalutation())).click();
	    Thread.sleep(3000);
	    
	    driver.close();
}
}
