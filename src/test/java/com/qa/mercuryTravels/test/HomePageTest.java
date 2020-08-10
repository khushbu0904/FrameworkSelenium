package com.qa.mercuryTravels.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.mercuryTravels.pages.Contacts;
import com.crm.mercuryTravels.pages.Deals;
import com.crm.mercuryTravels.pages.EmailPage;
import com.crm.mercuryTravels.pages.HomePage;
import com.crm.mercuryTravels.pages.LoginPage;
import com.crm.mercuryTravels.pages.Tasks;
import com.mercuryTravels.baseClass.Testbase;

public class HomePageTest extends Testbase
{
	LoginPage loginPage;
	HomePage homePage;
	Contacts ContactsPage;
	Deals DealsPage;
	Tasks TasksPage;
	EmailPage emailPage;

	public HomePageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	//PreRequisite
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle()
	{
		String ActualHomePageTitle=homePage.verifyHomePageTitle();
		Assert.assertEquals(ActualHomePageTitle, prop.getProperty("homePageTitleExpected"));
	}
	
	@Test(priority=2)
	public void verifyHomePageUsername()
	{
		String ActualUsername=homePage.verifyUsername();
		Assert.assertEquals(ActualUsername, prop.getProperty("homePageUsernameExpected"));
	}
	
	@Test(priority=2)
	public void clickOnContacts()
	{
		ContactsPage=homePage.ContactLink_click();
		
	}
	
	@Test(priority=3)
	public void clickOnDeals()
	{
		DealsPage=homePage.DealsLink_click();
	}
	@Test(priority=4)
	public void clickOnTasks()
	{
		TasksPage=homePage.TasksLink_click();
	}
	
	@Test(priority=5)
	public void clickOnEmail()
	{
		emailPage=homePage.EmailLink_click();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
