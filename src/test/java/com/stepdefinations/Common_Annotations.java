package com.stepdefinations;

import org.junit.AfterClass;
import org.junit.BeforeClass;


import com.application.pages.Login;
import com.application.pages.My_account;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import com.utils.MakeExtentReport;


public class Common_Annotations {
	
	
	public static MakeExtentReport mkreports;

	@Before
	public void initialize_report() {
		
	mkreports.initialize_Report();
		mkreports.startReport("summary");
	}
	
	@After
	public void pulishReport() {
		
		mkreports.endReport();
	}
	
}
