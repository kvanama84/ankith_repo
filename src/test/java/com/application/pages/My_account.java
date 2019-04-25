package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.Genericmethods;

public class My_account extends Genericmethods{
	
		@FindBy(how = How.XPATH, using = "(//a[normalize-space(text())='Sign out'])[1]")
		public static WebElement lnk_signout;
		
		//***********************************INITIALIZATION************************************************
		public My_account(){
			PageFactory.initElements(driver, this);
		}
	
		// ********************************* METHODS IMPLEMENTATION ************************************************
		
		
		// ********************************************************************//

		/*
		 * Method Name := signout()
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
		
		public static Login click_Siginout(){
			boolean status=false;
			try {
				hoverAndClick(lnk_signout);
				status=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(status)
				System.out.println("succusfully sinout link clicked");
			else
				System.out.println(" sinout link is not clicked");
			return new Login();
			
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
