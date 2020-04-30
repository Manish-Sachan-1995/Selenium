package com.assessment.SeleniumTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A3_TC001 extends Base {
	

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
	    
	    //Implicit wait, wait for at least some time (50 sec) to identify an element, //if can't find the element with in 10 
	    
	    driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS); 
	    driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    //open the url or AUT 
	    driver.get(prop.getProperty("mmtURL"));
	    
	    
	    if(prop.getProperty("journeyType").equalsIgnoreCase("oneWay")) {
	    driver.findElement(By.xpath(getOneWay())).click();
	    }else if(prop.getProperty("journeyType").equalsIgnoreCase("roundTrip")) {
	    	driver.findElement(By.xpath(getRoundTrip())).click();
	    }
	    
	    if(prop.getProperty("fromCity").equalsIgnoreCase(prop.getProperty("toCity"))){
	    	System.out.println("***********Source and Destination cities cannot be same**************");
	    	driver.close();
	    }
	    driver.findElement(By.xpath(getFromCity())).click();
	    driver.findElement(By.xpath(getEnterCity1())).sendKeys(prop.getProperty("fromCity"));
	    Thread.sleep(500);
	    driver.findElement(By.xpath(getSelectCity())).click();
	    driver.findElement(By.xpath(getEnterCity2())).sendKeys(prop.getProperty("toCity"));
	    Thread.sleep(500);
	    driver.findElement(By.xpath(getSelectCity())).click();
	    
//	    driver.findElement(By.xpath(getDepartureDate())).click();
	    
	    boolean flag1=true;
		   while (flag1) {
			   String str=   driver.findElement(By.xpath(getDepMonYear())).getText();
			   String text = prop.getProperty("depMonthYear");
			   if(text.equalsIgnoreCase(str)) {
				   flag1=false;
			   }else {
				   driver.findElement(By.xpath(getNext())).click();
			   }  
		   }
		   List<WebElement> allDates =  driver.findElements(By.xpath(getMmtdatePickerTD()));
		    for(WebElement ele:allDates) {
		    	String date=ele.getText();
		    	if(date.length()>2) {
		    		String date1=date.substring(0, 2);
		    		System.out.println(date1+"-->>"+prop.getProperty("depDay"));
		    		if(date1.equalsIgnoreCase(prop.getProperty("depDay"))) {
			    		ele.click();
			    		break;
		    	}
		    	}else {
		    		System.out.println(date+"-->>"+prop.getProperty("depDay"));
		    	if(date.equalsIgnoreCase(prop.getProperty("depDay"))) {
		    		ele.click();
		    		break;}
		    	}
		    }
		    
		    
		    if(prop.getProperty("journeyType").equalsIgnoreCase("roundTrip")) {
		    	
		    	while (flag1) {
					   String str=   driver.findElement(By.xpath(getDepMonYear())).getText();
					   String text = prop.getProperty("returnMonthYear");
					   if(text.equalsIgnoreCase(str)) {
						   flag1=false;
					   }else {
						   driver.findElement(By.xpath(getNext())).click();
					   }  
				   }
		    	List<WebElement> allDates1 =  driver.findElements(By.xpath(getMmtdatePickerTD()));
		    	for(WebElement ele:allDates1) {
			    	String date=ele.getText();
			    	if(date.length()>2) {
			    		String date1=date.substring(0, 2);
			    		System.out.println(date1+"-->>"+prop.getProperty("returnDay"));
			    		if(date1.equalsIgnoreCase(prop.getProperty("returnDay"))) {
				    		ele.click();
				    		break;
			    	}
			    	}else {
			    		System.out.println(date+"-->>"+prop.getProperty("returnDay"));
			    	if(date.equalsIgnoreCase(prop.getProperty("returnDay"))) {
			    		ele.click();
			    		break;}
			    	}
			    }
		    }
		    
		    
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(getMmtSearch())).click();
		    
		    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		    if(prop.getProperty("journeyType").equalsIgnoreCase("oneWay")) {
	    try {
		   driver.findElement(By.cssSelector(getNonStopFlight1())).isEnabled() ;
		   driver.findElement(By.cssSelector(getNonStopFlight1())).click();
		  }catch(Exception e) {
		   driver.findElement(By.cssSelector(getNonStopFlight())).click();
		  }
	    
		    try {
		    driver.findElement(By.xpath(getDirectcheapestFlight())).isDisplayed(); 
		    driver.findElement(By.xpath(getDirectcheapestFlight())).click();
		    }catch(Exception e) {
		    driver.findElement(By.xpath(getViewFares())).click();
		    driver.findElement(By.xpath(getCheapestFlight())).click();
		    }
		    System.out.println("Worked");
		    
		    driver.switchTo().window(tabs2.get(1));
		    String source=driver.findElement(By.xpath(getVerifySource())).getText();
		    String destination=driver.findElement(By.xpath(getVerifyDestination())).getText();
		    Assert.assertEquals(source.toLowerCase(),prop.getProperty("fromCity").toLowerCase());
		    Assert.assertEquals(destination.toLowerCase(),prop.getProperty("toCity").toLowerCase());
		    System.out.println("==============>>Verified<<=================");
		   
		    driver.close();
	    
}
		    else if(prop.getProperty("journeyType").equalsIgnoreCase("roundTrip")) {
		    	driver.findElement(By.xpath(getRoundBook())).click();
		    	driver.findElement(By.xpath(getCntinue())).click();
		    	driver.switchTo().window(tabs2.get(1));
		    	driver.close();
		    }
	}  
}
