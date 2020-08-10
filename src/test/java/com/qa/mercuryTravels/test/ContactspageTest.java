package com.qa.mercuryTravels.test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.mercuryTravels.pages.Contacts;
import com.crm.mercuryTravels.pages.HomePage;
import com.crm.mercuryTravels.pages.LoginPage;
import com.crm.mercuryTravels.pages.NewContactpage;
import com.mercuryTravels.baseClass.Testbase;

public class ContactspageTest extends Testbase
{
	Contacts contactpage;
	NewContactpage newContact;
	LoginPage loginPage;
	HomePage homePage;
	Actions action;
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));
		//contactpage=new Contacts();
		contactpage=homePage.ContactLink_click();
		
	}
	
	
	
	
	@Test(priority=1)
	public void searchContact() throws InterruptedException
	{
		contactpage.searchContact();
		
		
		
	}
	
	/*@Test(priority=2)
	public void NewContact()
	{
		newContact=contactpage.CreateNewContact();
		
	}*/
}
