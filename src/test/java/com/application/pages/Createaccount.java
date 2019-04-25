package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.Genericmethods;

public class Createaccount extends Genericmethods  {
	
	// *********************************************WEBELEMENT************************************************//


	
	@FindBy(how =How.XPATH, using= "//*[@id='id_gender1']")
	public static WebElement btn_mr;
	
	@FindBy(how =How.XPATH, using= "//input[@id='customer_firstname']")
	public static WebElement edi_firstname;
	
	@FindBy(how =How.XPATH, using= "//input[@id='customer_lastname']")
	public static WebElement edi_lastname;//input[@id='email']
	
	@FindBy(how =How.XPATH, using= "//input[@id='email']")
	public static WebElement edi_email;
	
	@FindBy(how =How.XPATH, using= "//input[@id='passwd']")
	public static WebElement edi_password;
	
	@FindBy(how =How.XPATH, using= "//*[@id='days']")
	public static WebElement dropdown_date;
	
	@FindBy(how =How.XPATH, using= "//*[@id='months']")
	public static WebElement dropdown_months;
	
	@FindBy(how =How.XPATH, using= "//*[@id='years']")
	public static WebElement dropdown_year;
	
	@FindBy(how =How.XPATH, using= "//input[@id='company']")
	public static WebElement edi_company;  
	
	@FindBy(how =How.XPATH, using= "//input[@id='address1']")
	public static WebElement edi_address1;
	
	@FindBy(how =How.XPATH, using= "//*[@id='city']")
	public static WebElement edi_city; 
	
	@FindBy(how =How.XPATH, using= "//*[@id='id_state']")
	public static WebElement dropdown_state;
	
	@FindBy(how =How.XPATH, using= "//*[@id='postcode']")
	public static WebElement edi_postcode;
	
	//@FindBy(how =How.XPATH, using= "//select[@id='id_country']")
	//public static WebElement dropdown_countery;
	
	@FindBy(how =How.XPATH, using= "//input[@id='phone_mobile']")
	public static WebElement edi_mobilenumber;  
	
//	@FindBy(how =How.XPATH, using= "//input[@id='alias']")
	//public static WebElement edi_alis; //
	
	@FindBy(how =How.XPATH, using= "//*[@id='submitAccount']")
	public static WebElement btn_register;
	
	//***********************************INITIALIZATION************************************************
			public Createaccount(){
				PageFactory.initElements(driver, this);
			}
	// ********************************* METHODS IMPLEMENTATION ************************************************
	
	// ********************************************************************//

	/*
	 * Method Name := click_button_MR()
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
	
	public static void click_button_MR() {
		try {
			
			hoverAndClick(btn_mr);
			
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
	
	public static void text_first_name(String firstname,String lastname,String password,String date,String month,String year) {
		try {
			  edi_firstname.sendKeys(firstname);
			} catch (Exception e) {
			  e.printStackTrace();
			}
		
		try {
			edi_lastname.sendKeys(lastname);
		    } catch (Exception e) {
			  e.printStackTrace();
		    }
		try {
			edi_password.sendKeys(password);
		    }catch (Exception e) {
			 e.printStackTrace();
		    }
		try {
			drop_down_byvalue(dropdown_date,date);
			} catch (Exception e) {
			e.printStackTrace();
		    }
		try {
			drop_down_byvalue(dropdown_months,month);
			} catch (Exception e) {
			e.printStackTrace();
		    }
		try {
			drop_down_byvalue(dropdown_year,year);
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

	public static void your_address(String company,String address,String city,String state,String postcode,String phonenumber){
		try {
			edi_company.sendKeys(company);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_address1.sendKeys(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_city.sendKeys(city);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			drop_down_byvalue(dropdown_state, state);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_postcode.sendKeys(postcode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_mobilenumber.sendKeys(phonenumber);
		} catch (Exception e) {
			e.printStackTrace();
		}}
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
	public static void register_click(){
		try {
			hoverAndClick(btn_register);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
