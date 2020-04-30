package com.assessment.SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


//Before running TC you can configure the Rental car options from property File.

public class A1_TC006_Automate_Rental_Car_Block extends Base {
	
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
	    driver.get(prop.getProperty("URL6"));
	    
	    
	    driver.findElement(By.xpath(getCarType())).click();
	    Thread.sleep(500);
	    String str=prop.getProperty("CarType");
	    if(str.equals("compact")) {
	    	driver.findElement(By.xpath(getCompact())).click();
	    }else if(str.equals("midSize")) {
	    	driver.findElement(By.xpath(getMidSize())).click();
	    }else if(str.equals("fullSize")) {
	    	driver.findElement(By.xpath(getFullSize())).click();
	    }else if(str.equals("SUV")) {
	    	driver.findElement(By.xpath(getSUV())).click();
	    }else if(str.equals("luxury")) {
	    	driver.findElement(By.xpath(getLuxury())).click();
	    }else if(str.equals("truck")) {
	    	driver.findElement(By.xpath(getTruck())).click();
	    }else if(str.equals("van")) {
	    	driver.findElement(By.xpath(getVan())).click();
	    }
	    
	    String str1=prop.getProperty("Feature");
	    if(str1.equals("automatic")) {
	    	driver.findElement(By.xpath(getAutomatic())).click();
	    }else if(str1.equals("standard")) {
	    	driver.findElement(By.xpath(getStandard())).click();
	    }Thread.sleep(500);
	    
	    driver.findElement(By.xpath(getInsurance())).click();
	    Thread.sleep(500);
	    
	    String nos = prop.getProperty("CarsRequired");
	    int i=Integer.parseInt(nos);
	    for(int j=0; j<i; j++) {
	    	driver.findElement(By.xpath(getCarsRequired())).click();
	    	Thread.sleep(500);
	    }
	    
	    driver.findElement(By.xpath(getBookNow())).click();
	    Thread.sleep(3000);
	    
	    driver.close();
	   
	}

}
