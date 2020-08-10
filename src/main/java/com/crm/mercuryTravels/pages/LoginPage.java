package com.crm.mercuryTravels.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercuryTravels.baseClass.Testbase;

public class LoginPage extends Testbase
{
    //Object repository
	@FindBy(xpath = "//*[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//*[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath ="//*[@id=\"ui\"]/div/div/form/div/div[3]")
	WebElement login_Btn;
	
	@FindBy(tagName = "Sign Up")
	WebElement SignUp_btn;
	
	@FindBy(tagName = "Forgot your password?")
	WebElement ForgotPwd_btn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Page title verification
	public String VerifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage ValidLogin(String u_name,String password)
	{
		username.sendKeys(u_name);
		pwd.sendKeys(password);
		login_Btn.click();
		//instantiate homepage obj only when login is successful
		return new HomePage();
	}
	
	
}
