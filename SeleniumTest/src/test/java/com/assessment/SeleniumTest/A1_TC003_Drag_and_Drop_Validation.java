package com.assessment.SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
 

public class A1_TC003_Drag_and_Drop_Validation extends Base  {


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
		 
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		    
		    //maximize the browser
		    driver.manage().window().maximize();
		    //open the url or AUT 
		    driver.get(prop.getProperty("URL3"));
		 
		 //Actions class method to drag and drop 
		 Actions builder = new Actions(driver);
		 
		 WebElement from = driver.findElement(By.id("draggable"));
		 
		 WebElement to = driver.findElement(By.id("droppable")); 
		 //Perform drag and drop
		 builder.dragAndDrop(from, to).perform();
		 
		 //verify text changed in to 'Drop here' box 
		 String textTo = to.getText();
		 
		 if(textTo.equals("Dropped!")) {
		 System.out.println("Source is dropped to target successfully");
		 }else {
		 System.out.println("failed to drop in desired position");
		 }
		 
		 driver.close();
		 
	}
		 
		}
