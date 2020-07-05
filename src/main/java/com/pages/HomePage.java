package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver dr; //make it global
	
	@FindBy(name="email") WebElement userName;
	@FindBy(name="pass") WebElement password; 
	@FindBy(xpath="//input[contains(@id,'u_') and @value='Log In']") WebElement loginButton;
	public HomePage (WebDriver x){
		//WebDriver dr = x; 
		dr = x;
		PageFactory.initElements(dr, this);
	}
	
	public void sendUserName(String username) {
		
		userName.sendKeys(username);		
	}
public void sendPassword(String pass) {
	password.sendKeys(pass);		
	}
	
	public ProfilePage clickOnLoginButton() {
		loginButton.click();
		return new ProfilePage(dr);
	}
	
	
}
