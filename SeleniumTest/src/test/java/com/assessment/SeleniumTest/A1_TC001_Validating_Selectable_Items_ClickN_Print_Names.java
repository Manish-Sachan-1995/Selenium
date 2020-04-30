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

 
public class A1_TC001_Validating_Selectable_Items_ClickN_Print_Names extends Base {
	public  String URL1 = null;
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
			System.setProperty("webdriver.chrome.driver",  getChromeDriverLocation());
			driver = new ChromeDriver();  
			}
		
		driver.manage().deleteAllCookies();
	    
	    //Implicit wait, wait for at least some time (30 sec) to identify an element, //if can't find the element with in 10 
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	    driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    //open the url or AUT 
	    driver.get(prop.getProperty("URL1"));
	    
	    driver.findElement(By.xpath(getSelectItem1())).click();
	    System.out.println("Item1 Selected");
	    String str1 =  driver.findElement(By.xpath(getNameItem1())).getText();
	    System.out.println("Item Name----->>>>"+str1);
	    
	    driver.findElement(By.xpath(getSelectItem2())).click();
	    System.out.println("Item2 Selected");
	    String str2 =  driver.findElement(By.xpath(getNameItem2())).getText();
	    System.out.println("Item Name----->>>>"+str2);
	    
	    driver.findElement(By.xpath(getSelectItem3())).click();
	    System.out.println("Item3 Selected");
	    String str3 =  driver.findElement(By.xpath(getNameItem3())).getText();
	    System.out.println("Item Name----->>>>"+str3);
	    
	    driver.findElement(By.xpath(getSelectItem4())).click();
	    System.out.println("Item4 Selected");
	    String str4 =  driver.findElement(By.xpath(getNameItem4())).getText();
	    
	    System.out.println("Item Name----->>>>"+str4);
	    
	    driver.findElement(By.xpath(getSelectItem5())).click();
	    System.out.println("Item5 Selected");
	    String str5 =  driver.findElement(By.xpath(getNameItem5())).getText();
	    System.out.println("Item Name----->>>>"+str5);
	    
	    driver.findElement(By.xpath(getSelectItem6())).click();
	    System.out.println("Item6 Selected");
	    String str6 =  driver.findElement(By.xpath(getNameItem6())).getText();
	    System.out.println("Item Name----->>>>"+str6);
	    
	    driver.findElement(By.xpath(getSelectItem7())).click();
	    System.out.println("Item7 Selected");
	    String str7 =  driver.findElement(By.xpath(getNameItem7())).getText();
	    System.out.println("Item Name----->>>>"+str7);
	    
	    System.out.println("End of TC001");
	}

	
}
	