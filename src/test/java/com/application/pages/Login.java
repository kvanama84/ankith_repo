package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.Genericmethods;

public class Login extends Genericmethods {

	// *********************************************WEBELEMENT************************************************//
	@FindBy(how = How.XPATH, using = "//*[text()='Create an account']")
	public static WebElement txt_sub_heading;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	public static WebElement edi_email_address;
	
	@FindBy(how =How.XPATH, using= "//*[@id='SubmitCreate']")
	public static WebElement btn_create_an_account;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign in']")
	public static WebElement lnk_signin_homepage;

	@FindBy(how = How.XPATH, using = "//h3[text()='Already registered?']")
	public static WebElement txt_already_existed;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public static WebElement edi_user_name;

	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public static WebElement edi_password;

	@FindBy(how = How.XPATH, using = "//*[@id='SubmitLogin']")
	public static WebElement btn_signin_button;

	//***********************************INITIALIZATION************************************************
	public Login(){
		PageFactory.initElements(driver, this);
	}
	// ********************************* METHODS IMPLEMENTATION ************************************************
	

	// ********************************************************************//
	/*
	 * Method Name := verify_header_text()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=kiran
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************//
	
	public static void verify_header_text_createaccount(String text) {
		boolean status = false;
		try {
			//status=wait_VisibilityOfElement(txt_sub_heading);
			String str = txt_sub_heading.getText();
			System.out.println(str);
			if (str.equalsIgnoreCase((text).trim()))
				System.out.println("module header is equal");
			else
				System.out.println("module header is not equal");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// ********************************************************************//

	/*
	 * Method Name :=click_createaccountLink()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=kiran
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************//
	
	public static void click_createaccountLink(String email) {
		try {
			edi_email_address.sendKeys(email);
			hoverAndClick(btn_create_an_account);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ********************************************************************//

	/*
	 * Method Name := sigin_link_ homepage()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=kiran
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************//
	
	public static Login click_SiginLink() {
		boolean status = false;

		try {
		hoverAndClick(lnk_signin_homepage);
		logStatus("pass", "Signin link is displayed on the homepage");
			status=true;
			
			} catch (Exception e) {
				logStatus("fail", "sign_in button is Not clicked at homepage");
			e.printStackTrace();
		}
		if(status)
		{
			System.out.println("Signin link is displayed on the homepage");
			
			
			System.out.println("Successfully sign_in button is clicked at homepage");
			
		}else
		{
			System.out.println("Unable to find sigin link on the homepage");
			System.out.println("sign_in button is Not clicked at homepage");
		}
		
		return new Login();	
	}

	// ********************************************************************//
	/*
	 * Method Name := verify_header_text()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=kiran
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************//
	
	public static void verify_header_text(String text) {
		boolean status = false;
		try {
			//status=wait_VisibilityOfElement(txt_already_existed);
			String str = txt_already_existed.getText();
			if (str.equalsIgnoreCase((text).trim()))
				System.out.println("create an account header is equal");
			else
				System.out.println("create an header is not equal");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ********************************************************************//
	/*
	 * Method Name := validaing_username_password(String usenam,String pwd)
	 * 
	 * Input Parameter := username,password
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=kiran
	 * 
	 * Sprint #:=
	 */

	public static void validaing_username_password(String usenam, String pwd) {
		boolean status = false;
		try {
			status=wait_VisibilityOfElement(edi_user_name);
			edi_user_name.clear();
			edi_user_name.sendKeys(usenam);
			edi_password.clear();
			edi_password.sendKeys(pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ********************************************************************//
	/*
	 * Method Name := verify_tittle(String str)
	 * 
	 * Input Parameter :=
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=kiran
	 * 
	 * Sprint #:=
	 */

	public static void verify_tittle(String str) {
		try {
			String title = driver.getTitle();
			if (title.equalsIgnoreCase(str))
				System.out.println("login succuss");
			else
				System.out.println("login is not succuss-full");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
