package com.TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage loginpage;
	
	@BeforeClass
	public void setUp()
	{
		BaseClass.intilization();
	}
	@Test
	public void loginFunctionality() throws InterruptedException
	{
		loginpage=new LoginPage();
		loginpage.typeusername(prop.getProperty("username"));
		loginpage.typepassword(prop.getProperty("password"));
		loginpage.loginbtn();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		
	}

}
