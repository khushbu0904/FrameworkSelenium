package com.mercuryTravels.baseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.mercuryTravels.utility.TestUtil;

public class Testbase 
{
	public static WebDriver driver;
	public static Properties prop;
	
   public Testbase() 
   {
	   prop=new Properties();
	   try {
		FileInputStream fin=new FileInputStream("D:/Khushbu/Framework1/Framework/src/main/java/com/mercuryTravels/config/config.properties");
	    prop.load(fin);
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }
   
   public static void initialization()
   {
	   String Browser_name=prop.getProperty("browser");
	   if(Browser_name.equalsIgnoreCase("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver", "D://MyWorkSpace//chromedriver.exe");
		    driver=new ChromeDriver();
		  
	   }
	   
	   if(Browser_name.equalsIgnoreCase("ie"))
	   {
		   driver=new InternetExplorerDriver();
		   //Not installed other drivers
		   System.setProperty("webdriver.chrome.driver", "D://MyWorkSpace//chromedriver.exe");
	   }
	   
	   if(Browser_name.equalsIgnoreCase("firefox"))
	   {
		 //Not installed other drivers
		   System.setProperty("webdriver.chrome.driver", "D://MyWorkSpace//chromedriver.exe");
		   driver=new FirefoxDriver();
	   }
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   
	   //Timer is defined in utility class
	   driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
	   
	   //Read from property file
	   driver.get(prop.getProperty("url"));
	   
	   
   }
}
