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

public class BaseTest1 {
public WebDriver dr;
	
	@Before
	public void openBrowser() throws IOException {
		
		FileInputStream fl = new FileInputStream("C:\\Users\\Md Shamibur Rahman\\eclipse-workspace\\FacebookLogin\\src\\main\\resources\\files\\config.properties");
		Properties p = new Properties();
		p.load(fl);
		
		String b = p.getProperty("browser");
		String url = p.getProperty("url"); 
		
		//System.getproperty() will allow user to read/get any value from the system/command line
		//String b = System.getProperty("browser"); 
		
		if(b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Shamibur Rahman\\Documents\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(b.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Md Shamibur Rahman\\Documents\\geckodriver.exe");
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(b.equals("ie")) {
			//System.setProperty("", "");
			//dr = new InternetExplorerDriver();
			System.out.println("running IE browser");
		}
		else if(b.equals("safari")) {
			//System.setProperty("", "");
			//dr = new SafariDriver();
			System.out.println("running Safari browser");
		}else {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Md Shamibur Rahman\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
			//dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Chrome wa executed from ELSE..........");
		}
		
		
		
	}
	
	public HomePage nevigateToURL() throws IOException {
		
		
		  FileInputStream fl = new
		  FileInputStream("C:\\Users\\Md Shamibur Rahman\\eclipse-workspace\\FacebookLogin\\src\\main\\resources\\files\\config.properties"
		  ); Properties p = new Properties(); p.load(fl); String url =
		  p.getProperty("url"); System.out.println(url);
		 
		dr.get(url);
		return new HomePage(dr);	
		}
	

	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
		
	}

}
