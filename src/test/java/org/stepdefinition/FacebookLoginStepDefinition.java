package org.stepdefinition;

import java.util.*;
import java.io.IOException;

import org.junit.Assert;
import org.utility.BaseClass;
import org.utility.LoginPojo;

import cucumber.api.java.en.*;

public class FacebookLoginStepDefinition extends BaseClass {
	@Given("The user should launch the chrome browser")
	public void the_user_should_launch_the_chrome_browser() {
		DriverInstall();
	}

	@When("The user should type the url")
	public void the_user_should_type_the_url() {
		GetUrl("https://www.facebook.com/");
		
	}

	@When("The user should maxmize the window")
	public void the_user_should_maxmize_the_window() {
		WindoMax();	
	}

	@When("The user should type the invalid username and invalid password")
	public void the_user_should_type_the_invalid_username_and_invalid_password() throws InterruptedException, IOException {
		
		LoginPojo l = new LoginPojo();
		
		Findelesendkeyusername(l.getFindelesendkeyusername(),Filepath("C:\\\\\\\\Users\\\\\\\\Gopi_Ram\\\\\\\\eclipse-workspace\\\\\\\\FrameWorkProject\\\\\\\\target\\\\\\\\File\\\\\\\\emp_details.xlsx","id", 2, 0));
		Findelesendkeypasswrd(l.getFindelesendkeypasswrd(),Filepath("C:\\\\\\\\Users\\\\\\\\Gopi_Ram\\\\\\\\eclipse-workspace\\\\\\\\FrameWorkProject\\\\\\\\target\\\\\\\\File\\\\\\\\emp_details.xlsx","id", 2, 1));
	}

	@When("The user should click the login button")
	public void the_user_should_click_the_login_button() throws InterruptedException {
		LoginPojo l = new LoginPojo();
		Selectwebelement(l.getSelectwebelement());
		StaticThread(5000);
	}

	@Then("The user should navigate to incorrect credential page")
	public void the_user_should_navigate_to_incorrect_credential_page() {
		String currenturl =driver.getCurrentUrl();
		System.out.println(currenturl);
		Assert.assertTrue("Verify the page", currenturl.contains("privacy"));
		System.out.println("The test case is passed");
		Cls();
	    
	}
	@When("The user should get the title of the incredential page")
	public void the_user_should_get_the_title_of_the_incredential_page() {
		PrintTitle();
	}
	
	@When("The user should type the invalid username{string} and valid password {string}")
	public void the_user_should_type_the_invalid_username_and_valid_password(String usrname, String passname)  {
		LoginPojo l = new LoginPojo();
		Findelesendkeyusername(l.getFindelesendkeyusername(),usrname);
		Findelesendkeypasswrd(l.getFindelesendkeypasswrd(),passname);
		
	
	}

	@When("The user should get the current url of the incredential page")
	public void the_user_should_get_the_current_url_of_the_incredential_page() {
		PrintCurrentUrl();
	}
	
	@When("The user should type the invalid username and invalid passwords")
	public void the_user_should_type_the_invalid_username_and_invalid_passwords(io.cucumber.datatable.DataTable oneddata) {
		LoginPojo l = new LoginPojo();
		List<String> oned = oneddata.asList();
		Findelesendkeyusername(l.getFindelesendkeyusername(),oned.get(0));
		Findelesendkeypasswrd(l.getFindelesendkeypasswrd(),oned.get(1));
		
	}




}
