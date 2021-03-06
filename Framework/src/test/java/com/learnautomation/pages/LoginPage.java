package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="password") WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']") WebElement loginButton;
	
	public void loginToCRM(String username,String password)
	{
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			
		}
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginButton.click();
	}
}
