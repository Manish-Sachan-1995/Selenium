package com.assessment.SeleniumTest;

import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class A1_TC004_DatePicker_Validation extends Base {

	
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
	    driver.get(prop.getProperty("URL4"));
	    
	    driver.findElement(By.xpath(getDatePicker())).click();
	    boolean flag1=true;
	   while (flag1) {
		   String year = driver.findElement(By.xpath(getDobYear())).getText();
		   String text = prop.getProperty("Year");
		   if(text.equalsIgnoreCase(year)) {
			   flag1=false;
		   }else {
			   driver.findElement(By.xpath(getPrev())).click();
		   }
	   }
	    boolean flag=true;
	   while(flag) {
		   String month = driver.findElement(By.xpath(getDobMonth())).getText();
		   String text = prop.getProperty("Month");
		   if(text.equalsIgnoreCase(month)) {
			   flag=false;
		   }else {
			   driver.findElement(By.xpath(getPrev())).click();
		   }
	   }
	   
	   List<WebElement> allDates =  driver.findElements(By.xpath(getDatePickerTD()));
	    for(WebElement ele:allDates) {
	    	String date=ele.getText();
	    	if(date.equalsIgnoreCase(prop.getProperty("Day"))) {
	    		ele.click();
	    		break;
	    	}
	    }
//	driver.close();
	}
	
	
}
