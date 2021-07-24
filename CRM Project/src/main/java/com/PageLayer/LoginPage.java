package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//input[@name='email' and @type='text']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password' and @type='password']")
	WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	WebElement clickOnLogin;
	
	public LoginPage() 
	{
		PageFactory.initElements(driver,this);
	}
	public void typeusername(String uname)
	{
		username.sendKeys(uname);
	}
	public void typepassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void loginbtn()
	{
		clickOnLogin.click();
	}
	
	
	
	

}
