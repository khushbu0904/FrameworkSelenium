package com.qa.mercuryTravels.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.mercuryTravels.pages.Contacts;
import com.crm.mercuryTravels.pages.HomePage;
import com.crm.mercuryTravels.pages.LoginPage;
import com.crm.mercuryTravels.pages.NewContactpage;
import com.mercuryTravels.baseClass.Testbase;

public class NewContactTest extends Testbase
{
	LoginPage loginpage;
	HomePage homepage;
	Contacts contactpage;
	NewContactpage newcontactpage;
	

	public NewContactTest() {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		homepage=loginpage.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		contactpage=new Contacts();
		contactpage=homepage.ContactLink_click();
		Thread.sleep(2000);
		newcontactpage=new NewContactpage();
		newcontactpage=contactpage.CreateNewContact();
		Thread.sleep(2000);
		
	}
	@Test
	public void createNewContact() throws InterruptedException
	{
		newcontactpage.NewContact(prop.getProperty("NewContactFirstName"), prop.getProperty("NewContactLastName"));
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
