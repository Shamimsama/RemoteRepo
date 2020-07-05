package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pages.HomePage;

public class BaseTest {
	
	static WebDriver dr;
	//@Before
	public static void getBrowserOption(String b)
	{
		if(b.equals("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Shamibur Rahman\\Documents\\chromedriver.exe");
			dr=new ChromeDriver();
			
		}

		else if(b.equals("firefox"))
		{
			dr=new FirefoxDriver();
		}
		
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public void getDriver() {
		dr=new ChromeDriver();
		
	}
	
	public HomePage nevigateToURL() throws IOException {
		
		
		  FileInputStream fl = new
		  FileInputStream("C:\\Users\\Md Shamibur Rahman\\eclipse-workspace\\FacebookLogin\\src\\main\\resources\\files\\config.properties"); 
		  Properties p = new Properties(); 
		  p.load(fl); 
		  String url1 = p.getProperty("url"); 
		 
		dr.get(url1);
		return new HomePage(dr);	
		}
	
	//@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
		
	}
}
