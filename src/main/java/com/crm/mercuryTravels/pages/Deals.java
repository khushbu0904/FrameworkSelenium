package com.crm.mercuryTravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercuryTravels.baseClass.Testbase;

public class Deals extends Testbase
{


	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[3]")
	WebElement New_Deals;
	
	public Deals() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public NewDeals clickOnNewDeals()
	{
		New_Deals.click();
		return new NewDeals();
	}
}
