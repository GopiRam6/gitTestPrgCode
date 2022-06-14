package org.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass 
{
	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindAll({	
		@FindBy(xpath="//input[@id='email']"),
		@FindBy(xpath="//div[text()='adf@outlook.in']")
	})
	private WebElement Findelesendkeyusername;
	@FindAll({
		@FindBy(xpath="//input[@id='pass']"),
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	,@FindBy(xpath="//input[@type='password']")
	})
	private WebElement Findelesendkeypasswrd;
	@FindBy(id="first_name")
	private WebElement Findelesendkeyfirstname;
	@FindBy(id="last_name")
	private WebElement Findelesendkeylastname;
	@FindBy(id="address")
	private WebElement Findelesendkeyaddress;
	@FindBy(id="cc_num")
	private WebElement Findelesendkeycredit;
	@FindBy(id="cc_cvv")
	private WebElement Findelesendkeycreditcvvno;
	
	

	
	
	
	@FindBy(id="email")			
	private WebElement Findelesendkeyemil;
	@FindBy(id="mobile")			
	private WebElement Findelesendkeymobil;
	
	
	@FindAll(
			{@FindBy(xpath="(//div[@class='testimonial-section'])[19]")
			 ,@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
			}
			)	
	private WebElement jsexscrolldown;
	@FindBy(xpath="(//div[@class='testimonial-section'])[19]")	
	private WebElement jsexscrollup;
	
	@FindAll({
		@FindBy(xpath="//button[@name='login']"),
		@FindBy(xpath="//button[@type='submit']")
	})
	private WebElement Selectwebelement;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement MoveElement;
	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement MoveElement1;
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement MoveElement2;
	@FindBy(xpath="//input[@id='idSIButton9']")
	private WebElement Selectwebelement1;
	@FindAll({
		
		@FindBy(id="signInLink")
		,@FindBy(xpath="//input[@type='radio']")
	}
	)
	private WebElement Checkbox;
	@FindBy(id="continue")
	private WebElement Submitbutton;
	@FindBy(id="book_now")
	private WebElement Submitbutton1;
	@FindAll(
			{
				@FindBy(id=("location"))
				,@FindBy(xpath="//select[@class='form-group__select']")
				,@FindBy(xpath="//select[@name='register[default_area_id]']")			
	})
	private WebElement DropDownSelectvisbtextloc;
	@FindBy(id=("hotels"))
	private WebElement DropDownSelectvisbtexthotel;
	@FindBy(id=("room_type"))
	private WebElement DropDownSelectvisbtextroomtype;
	@FindBy(id=("room_nos"))
	private WebElement DropDownSelectvisbtextnoofroom;
	@FindBy(id=("adult_room"))
	private WebElement DropDownSelectvisbtextadults;
	@FindBy(id=("child_room"))
	private WebElement DropDownSelectvisbtextchildren;
	@FindBy(id="cc_type")
	private WebElement DropDownSelectvisbtextcredittype;
	@FindBy(id="cc_exp_month")
	private WebElement DropDownSelectvisbtextexpdate;
	@FindBy(id="cc_exp_year")
	private WebElement DropDownSelectvisbtextexpyear;
	
	@FindAll({
		@FindBy(xpath="//input[@id='order_no']")
		,@FindBy(xpath="//input[@name='order_no']")
		,@FindBy(xpath="(//input[@type='text'])[16]")
		
		
		
	})
	
	private WebElement PrintwebeleText;
	
	@FindAll({
		@FindBy(xpath="//input[@id='order_no']")
		,@FindBy(xpath="//input[@name='order_no']")
		,@FindBy(xpath="(//input[@type='text'])[16]")		
		
	})
	private WebElement jsexgetattprint;
	public WebElement getjsexgetattprint() {
		return jsexgetattprint;
	}
	
	
	public WebElement getPrintwebeleText() {
		return PrintwebeleText;
	}
	public WebElement getFindelesendkeyemil() {
		return Findelesendkeyemil;
	}
	public WebElement getFindelesendkeymobil() {
		return Findelesendkeymobil;
	}
	public WebElement getSelectwebelement() {
		return Selectwebelement;
	}
	public WebElement getSelectwebelement1() {
		return Selectwebelement1;
	}
	public WebElement getCheckbox(){
		return Checkbox;
	}
	public WebElement getSubmitbutton(){
		return Submitbutton;
	}
	public WebElement getSubmitbutton1(){
		return Submitbutton1;
	}
	
	public WebElement getMoveElement() {
		return MoveElement;
	}
	public WebElement getMoveElement1() {
		return MoveElement1;
	}
	public WebElement getMoveElement2() {
		return MoveElement2;
	}
	public WebElement getFindelesendkeyusername() {
		return Findelesendkeyusername;
	}
	public WebElement getFindelesendkeypasswrd() {
		return Findelesendkeypasswrd;
	}
	public WebElement getFindelesendkeyfirstname() {
		return Findelesendkeyfirstname;
	}
	public WebElement getFindelesendkeylastname() {
		return Findelesendkeylastname;
	}
	public WebElement getFindelesendkeyaddress() {
		return Findelesendkeyaddress;
	}
	public WebElement getFindelesendkeycredit() {
		return Findelesendkeycredit;
	}
	public WebElement getFindelesendkeycreditcvvno() {
		return Findelesendkeycreditcvvno;
	}
	
	
	
	
	public WebElement getDropDownSelectvisbtextloc() {
		return DropDownSelectvisbtextloc;
	}
	public WebElement getDropDownSelectvisbtexthotel() {
		return DropDownSelectvisbtexthotel;
	}
	public WebElement getDropDownSelectvisbtextroomtype() {
	return DropDownSelectvisbtextroomtype;
	}
	public WebElement getDropDownSelectvisbtextnoofroom() {
		return DropDownSelectvisbtextnoofroom;
	}
	public WebElement getDropDownSelectvisbtextadults() {
		return DropDownSelectvisbtextadults;
	}
	public WebElement getDropDownSelectvisbtextchildren() {
		return DropDownSelectvisbtextchildren;
	}
	public WebElement getDropDownSelectvisbtextcredittype() {
		return DropDownSelectvisbtextcredittype;
	}
	public WebElement getDropDownSelectvisbtextexpdate() {
		return DropDownSelectvisbtextexpdate;
	}
	public WebElement getDropDownSelectvisbtextexpyear() {
		return DropDownSelectvisbtextexpyear;
	}
	public WebElement getjsexscrolldown() {
		return jsexscrolldown;
	}
	public WebElement getjsexscrollup() {
		return jsexscrollup;
	}
}