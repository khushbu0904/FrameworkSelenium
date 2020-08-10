package com.crm.mercuryTravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mercuryTravels.baseClass.Testbase;

public class NewContactpage extends Testbase
{
	
	
	
	public NewContactpage() {
		super();
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath ="//input[@name='first_name']")
	WebElement FirstName;
	
	@FindBy(xpath ="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath ="//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]/i")  
	WebElement SaveButton;
	
	public void NewContact(String First_name, String last_name) throws InterruptedException
	{
		
		driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(FirstName));
		FirstName.sendKeys(First_name);
		lastName.sendKeys(last_name);
		if(SaveButton.isEnabled())
		{
			SaveButton.click();
		}
		else
		{
			System.out.println("button disabled");
		}
		
	}
	
	
	

}
