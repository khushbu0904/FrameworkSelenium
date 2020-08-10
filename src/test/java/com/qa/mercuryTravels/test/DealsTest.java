package com.qa.mercuryTravels.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.mercuryTravels.pages.Deals;
import com.crm.mercuryTravels.pages.HomePage;
import com.crm.mercuryTravels.pages.LoginPage;
import com.crm.mercuryTravels.pages.NewDeals;
import com.mercuryTravels.baseClass.Testbase;

public class DealsTest extends Testbase
{
	LoginPage loginpage;
	HomePage homepage;
	Deals deals;
	NewDeals newdeals;
	public DealsTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   @BeforeMethod
   public void setup()
   {
	   initialization();
	   loginpage=new LoginPage();
	   homepage=loginpage.ValidLogin(prop.getProperty("username"), prop.getProperty("password"));
	   homepage.verifyHomePageTitle();
	   homepage.DealsLink_click();
	   
   }
   
   @Test(priority = 1)
   public void newDealsButtonClick()
   {
	   deals = new Deals();
	   newdeals=deals.clickOnNewDeals();
   }
	
	
	

}
