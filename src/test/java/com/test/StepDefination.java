package com.test;

import java.util.List;

import org.openqa.selenium.By;

import com.pages.HomePage;
import com.pages.ProfilePage;
import com.sun.org.apache.xerces.internal.util.DraconianErrorHandler;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination extends BaseTest{
	BaseTest b;
	HomePage h;
	ProfilePage p;
	
	
	/*
	 * @Given("^open browser$")
	 * 
	 * public void open_browser() throws Throwable { b = new BaseTest1();
	 * b.openBrowser(); }
	 */
	 
	 
	
	
	
	
	  @Given("^open browser$") 
	  public void open_browser(DataTable arg1) throws Throwable { 
		  List<List<String>> browsers = arg1.raw(); 
		  String browser = browsers.get(0).get(0); 
		  BaseTest.getBrowserOption(browser);
	  
	  }
	 
	
	
	@Given("^nevigate to URl$")
	public void nevigate_to_URl() throws Throwable {
		b = new BaseTest();
		h=b.nevigateToURL();
		
	}
	
	@When("^user type userId and password$")
	public void user_type_userId_and_password() throws Throwable {
	   h.sendUserName("jfdjkfjk");
	   h.sendPassword("jkdfkjkf");
	}

	@When("^user type \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_and(String username, String password) throws Throwable {
		h.sendUserName(username);
		   h.sendPassword(password);
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		p = h.clickOnLoginButton();
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
	System.out.println("Profile");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   b.closeBrowser();
	}
	

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
		System.out.println("Not a right Profile");
	}

}
