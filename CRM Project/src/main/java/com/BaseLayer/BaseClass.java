package com.BaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
	public BaseClass() 
	{
		 prop=new Properties();
		try {
			fis=new FileInputStream("C:\\Users\\Sushant\\eclipse-workspace\\CRM Project\\src\\main\\java\\com\\ConfigLayer\\confg.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void intilization()
	{
	   	String BrowserName=prop.getProperty("browser");
	   	if(BrowserName.equals("chrome")) 
	   	{
	   		WebDriverManager.chromedriver().setup(); 
	   		driver=new ChromeDriver();
	    }
	   	else if(BrowserName.equals("edge")) 
	   	{
	   		WebDriverManager.edgedriver().setup();
	   		driver=new EdgeDriver();
	   	}
	   	driver.manage().window().maximize();
	   	driver.manage().deleteAllCookies();
	   	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	   	driver.get(prop.getProperty("url"));
		
		
	}
		
		
		
	

}
