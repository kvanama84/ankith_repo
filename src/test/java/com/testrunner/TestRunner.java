package com.testrunner;

import org.junit.runner.RunWith;

import com.genericmethods.Genericmethods;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Features"},
		glue={"com.stepdefinations"},
		monochrome=true
//it will check if any step is not defind in step defination file
//dryRun=false//to check mapping is proper b/w feature file and step defination file
)

public class TestRunner {
	

}
