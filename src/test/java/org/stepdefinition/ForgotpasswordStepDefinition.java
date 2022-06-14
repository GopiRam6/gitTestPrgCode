package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.utility.BaseClass;
import org.utility.LoginPojo;

import cucumber.api.java.en.*;

public class ForgotpasswordStepDefinition extends BaseClass {

	@Given(": The user should launch the browser")
	public void the_user_should_launch_the_browser() {
		DriverInstall();
	}

	@When(": The user should load the url")
	public void the_user_should_load_the_url() {
		GetUrl("https://www.facebook.com/");
	}

	@When(": The user should maximize the window")
	public void the_user_should_maximize_the_window() {
		WindoMax();	
	}

	@When(": The user should click the forgot password link")
	public void the_user_should_click_the_forgot_password_link() throws IOException {
	LoginPojo l = new LoginPojo();
	Selectwebelement(l.getSelectwebelement());
	}

	@When(": The user should navigate to find your account page")
	public void the_user_should_navigate_to_find_your_account_page() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Verify the fb account page", current.endsWith("screen=0"));
		System.out.println("Acconut page verified");
	}

	@When(": The user should type the registered mobile number or email id")
	public void the_user_should_type_the_registered_mobile_number_or_email_id() {
	    
	}

	@When(": The user should click the search button")
	public void the_user_should_click_the_search_button() {
	    
	}

	@Then(": The user should navigate to reset your password page")
	public void the_user_should_navigate_to_reset_your_password_page() {
		driver.findElement(By.xpath("//button[@id='identify_email']")).sendKeys("1234567890");
	}

}
