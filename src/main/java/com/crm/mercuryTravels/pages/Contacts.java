package com.crm.mercuryTravels.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercuryTravels.baseClass.Testbase;

public class Contacts extends Testbase
{
     Actions action;
	public Contacts() {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	//*[@id="dashboard-toolbar"]/div[2]/div/a/button
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement NewContact_button;
	
	@FindBy(xpath = "//input[@type=\"text\" and @placeholder=\"Search\"]")
	WebElement SearchContact;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/div/div/div[2]/table/tbody/tr/td[2]/a")
	WebElement actualContact;
	
	public NewContactpage CreateNewContact()
	{
		NewContact_button.click();
		return new NewContactpage();
		
	}
	
	public void searchContact() throws InterruptedException
	{
		 SearchContact.click();
		 SearchContact.sendKeys(prop.getProperty("searchContact_name"));
		 SearchContact.sendKeys(Keys.ENTER);
		 Thread.sleep(2000);
		 System.out.println(actualContact.getText());
		
	}

}
