package com.stepdefinations;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.support.PageFactory;

import com.application.pages.Createaccount;
import com.application.pages.Login;
import com.application.pages.My_account;
import com.genericmethods.Genericmethods;
import com.readexcel.WriteExcel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_test extends Genericmethods {
	
	public static Login login;
	public static Createaccount lb;
	public static  My_account account;
	public static WriteExcel wr;
	public static String temp_email="";
	public static String temp_password="";

	
	
	@Given("^launch the \"(.*?)\" browser and having url \"(.*?)\" and click on sign-in link$")
	public void launch_the_browser_and_having_url_and_click_on_sign_in_link(String arg1, String arg2){  
	launchBrowser(arg1,arg2);
	login=new Login();
	lb=new Createaccount();
	account=new My_account();
	login=login.click_SiginLink();
	
	    
	}
	

	@When("^the page is displayed, verify module header is \"(.*?)\" and enter the valid Email address \"(.*?)\" and click on the Sign-in button$")
	public void the_page_is_displayed_verify_module_header_is_and_enter_the_valid_Email_address_and_click_on_the_Sign_in_button(String arg1, String arg2) {
		String emailstamp=arg2;
		String Datearr[] =emailstamp.split("@");
		String emailfront=Datearr[0];
		String emailrear=Datearr[1];
		
		SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");
		
		String timestamp=sdf.format(Calendar.getInstance().getTime());
		timestamp=timestamp.replace(":", "-");
		temp_email=emailfront+timestamp+"@"+emailrear;
		
		login.verify_header_text_createaccount(arg1);
		login.click_createaccountLink(temp_email);
		
		
		logStatus("pass", "Successfully clicked on Create Account button");
		
	    
	}

	@Then("^enter the your personal information \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
	public void enter_the_your_personal_information(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)  {
	    lb.click_button_MR();
		lb.text_first_name(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^enter the address of the yousers \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
	public void enter_the_address_of_the_yousers(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)  {
	    lb.your_address(arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@Then("^click on register button which is navigating to my account page and click on sin-out button$")
	public void click_on_register_button_which_is_navigating_to_my_account_page_and_click_on_sin_out_button()  {
	    lb.register_click();
	    logStatus("pass", "succusfully clicked on register button");
	    login=account.click_Siginout();
	    logStatus("pass", "succusfully clicked on sig-out button");
	    
	}

	@When("^the page is displayed, verify module header is \"(.*?)\" and Enter valid username  and password \"(.*?)\"$")
	public void the_page_is_displayed_verify_module_header_is_and_Enter_valid_username_and_password(String arg1, String arg2) {
		try {
			login.verify_header_text(arg1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			login.edi_user_name.clear();
			login.edi_user_name.sendKeys(temp_email);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			temp_password=arg2;
			login.edi_password.clear();
			login.edi_password.sendKeys(arg2);
			
			wr.write(temp_email, arg2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	@When("^click on the signin button$")
	public void click_on_the_signin_button()  {
		hoverAndClick(login.btn_signin_button);
		logStatus("pass", "succusfully clicked on sig-in button");
	    
	}

	@When("^verify user is navigated to the next page sucessfully \"(.*?)\"$")
	public void verify_user_is_navigated_to_the_next_page_sucessfully(String arg1)  {
	    account.verify_tittle(arg1);
	    System.out.println("the user id >"+temp_email+ "<and password are >"+temp_password+"<");
	}

	@When("^quit the browser$")
	public void quit_the_browser() {
		tearDownBrowser();
	    
	   
	}

}
