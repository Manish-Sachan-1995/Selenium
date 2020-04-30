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

public class A2_TC001_Automating_Olay_Registration_SignIn extends Base {
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
		String day=prop.getProperty("Day");
		int day1=Integer.parseInt(day);
		String month=prop.getProperty("Month1");
		int month1=Integer.parseInt(month);
		String year=prop.getProperty("Year");
		int year1=Integer.parseInt(year);
		
		driver.manage().deleteAllCookies();
	    
	    //Implicit wait, wait for at least some time (50 sec) to identify an element, //if can't find the element with in 10 
	    
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS); 
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    //open the url or AUT 
	    driver.get(prop.getProperty("olayURL1"));
	    
	    
	    
	    driver.findElement(By.xpath(getOlayUkRegisterLink())).click();
	    String email=getRandomEmail();
	    driver.findElement(By.xpath(getOlayUkEnterEmail())).sendKeys(email);
	    System.out.println("Random Email Entered----------->>>>>>>  "+email);
	    driver.findElement(By.xpath(getOlayUkEnterPassword())).sendKeys(getPassword());
	    driver.findElement(By.xpath(getOlayUkconfirmPassword())).sendKeys(getPassword());
	    driver.findElement(By.cssSelector(getUkDay(day1))).click();
	    driver.findElement(By.cssSelector(getUkMonth(month1))).click();
	    driver.findElement(By.cssSelector(getUkYear(year1))).click();
	    String cookies="//button[@id='onetrust-reject-all-handler']";
	    if(driver.findElement(By.xpath(cookies)).isDisplayed()){
	    	driver.findElement(By.xpath(cookies)).click();
	    }
	    System.out.println("DOB Entered-------------------->>>>>>> "+day1+"-"+month1+"-"+year1);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,700)");
	    driver.findElement(By.xpath(getUkRegisterButton())).click();
	    
	    driver.findElement(By.xpath(getSkipUk())).click();
	    System.out.println("****************Successfully Registered*********************");

	    for(int i=0; i<=1;i++) {
	    	driver.findElement(By.xpath(getOlayUkSignOut())).click();
	    	driver.findElement(By.xpath(getLogOutButton())).click();
	    	Thread.sleep(5000);
	    }
	    System.out.println("****************Successfully LoggedOut*********************");
	    
	    driver.findElement(By.xpath(getOlayUkSignIn())).click();
	    driver.findElement(By.xpath(getUsername())).sendKeys(email);
	    driver.findElement(By.xpath(getPassword1())).sendKeys(getPassword());
	    driver.findElement(By.xpath(getUserSignInBtn())).click();
	    System.out.println("****************Successfully SignedIn*********************");
	    for(int i=0; i<=1;i++) {
		    driver.findElement(By.xpath(getOlayUkSignOut())).click();
		    driver.findElement(By.xpath(getLogOutButton())).click();
		    Thread.sleep(5000);
		    }
	    System.out.println("****************Successfully LoggedOut*********************");
	    
	    Thread.sleep(7000);
	    driver.close();
	}
}
