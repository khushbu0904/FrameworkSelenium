package com.qa.mercuryTravels.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.mercuryTravels.pages.HomePage;
import com.crm.mercuryTravels.pages.LoginPage;
import com.mercuryTravels.baseClass.Testbase;

public class LoginPageTest extends Testbase
{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void VerifyPageTitleTest()
	{
		String Actual_Title=loginpage.VerifyPageTitle();
		Assert.assertEquals(Actual_Title, "Cogmento CRM");
	}
	@Test(priority=2)
	public void ValidLoginTest()
	{
		homepage=loginpage.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
