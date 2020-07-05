package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	WebDriver dr;
	public ProfilePage (WebDriver x){
		dr = x;
		PageFactory.initElements(dr, this);
	}
	
}
