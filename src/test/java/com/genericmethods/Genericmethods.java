package com.genericmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import com.utils.MakeExtentReport;

import cucumber.api.java.gl.E;

public class Genericmethods extends MakeExtentReport{
	public static WebDriver driver;

	public static void launchBrowser(String browser, String url) {

		try {
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;

			case "firefox":
				driver = new FirefoxDriver();

				break;

			default:
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")
								+ "\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

	}

	// **************************************************************//
	/*
	 * Method Name := verifyElementExist()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	public static void verifyElementExist(WebElement element) {
		try {

			new WebDriverWait(driver, 5).until(ExpectedConditions
					.visibilityOf(element));
			String elementname = element.getText();
			String pagename = driver.getTitle();
			if (element.isDisplayed()) {
				System.out.println(elementname + " is Displayed in " + pagename);
						
			} else
				System.out.println(elementname + " is Not Displayed in "+ pagename);
						

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// **************************************************************//
	/*
	 * Method Name := tearDownBrowser()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := Quit Browser
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */

	public static void tearDownBrowser() {
		driver.close();
	}

	// **************************************************************//
	/*
	 * Method Name := verifyElementColour()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	
	public static void verifyelementcolour(WebElement element) {
		try {
			String colour = element.getCssValue("colour");
			String elementname = driver.getCurrentUrl();
			if (colour != null) {
				System.out.println(colour + "having colour name" + elementname);
			} else {
				System.out.println(colour + "colour name is not present"
						+ elementname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// **************************************************************//
	/*
	 * Method Name := Getlinkurl()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	public static void getlinkurl(WebElement element) {
		String linkurl = null;
		try {
			linkurl = element.getAttribute("href");
			if (linkurl.equals(null)) {
				System.out.println(linkurl);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// **************************************************************//
	/*
	 * Method Name := wait_VisibilityOfElement()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	public static boolean wait_VisibilityOfElement(WebElement element)
	{
		boolean status=true;
		try
		{
			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
			Actions act =new Actions(driver);
			act.click(element).build().perform();
		}catch(Exception e)
		{
			status=false;
		}
		
		return status;
	}
	//****************************************GENERICMETHODS**********************// 
		/*
		 * Method Name := hoverAndClick()
		 * 
		 * Input Parameter := WebElement
		 * 
		 * OutPut Parameter := Boolean
		 * 
		 * Designer #:= kiran
		 * 
		 * Sprint #:=
		 */
	public static void hoverAndClick(WebElement element){
		
		try{
			//Wait till the WebElement is Displayed
			
			new WebDriverWait(driver,5).until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			Actions ass=new Actions(driver);
			ass.moveToElement(element).click(element).build().perform();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	// **************************************************************//
	/*
	 * Method Name := drop_down_byvalue()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= kiran
	 * 
	 * Sprint #:=
	 */
	
	public static void drop_down_byvalue(WebElement element,String value){
		Select obj=new Select(element);
		obj.selectByValue(value);
		
	}
	

	
}
