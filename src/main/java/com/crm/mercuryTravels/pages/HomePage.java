package com.crm.mercuryTravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercuryTravels.baseClass.Testbase;

public class HomePage extends Testbase
{
	@FindBy(xpath = "//*[@class='user-display']")
	WebElement Username;
	
	@FindBy(xpath = "//div[@id='main-nav']/a[3]")
	WebElement contacts_Link;
	
	@FindBy(xpath = "//div[@id='main-nav']/a[5]")
	WebElement Deals_Link;

	
	@FindBy(xpath = "//div[@id='main-nav']/a[6]")
	WebElement task_Link;

	@FindBy(xpath = "//div[@id='main-nav']/a[10]")
	WebElement Email_Link;
	
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}

	//after landing on Page, check title first
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
		
	}
	
	//checking if username of the page is Khushbu
	public String verifyUsername()
	{
		return Username.getText();
		
	}
	
	//After clicking on contact, contact page is opening
	public Contacts ContactLink_click()
	{
		contacts_Link.click();
		return new Contacts();
		
	}
	//After clicking on Deals, Deals page is opening
	public Deals DealsLink_click()
	{
		Deals_Link.click();
		return new Deals();
		
	}
	//After clicking on taskLink, task page is opening
	public Tasks TasksLink_click()
	{
		task_Link.click();
		return new Tasks();
		
	}

	public EmailPage EmailLink_click()
	{
		Email_Link.click();
		return new EmailPage();
		
	}


	
	

}
