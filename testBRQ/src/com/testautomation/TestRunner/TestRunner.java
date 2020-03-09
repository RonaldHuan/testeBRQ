package com.testautomation.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = "./features/realizarCompra.feature",
		glue = {"com.testautomation.StepDef"},
		tags = {"@UATTesting"},
		plugin = {"pretty", "html:target/site/cucumber-pretty",
				"json:target/cucumber.json"},
		monochrome = true)
public class TestRunner {
	
	private TestNGCucumberRunner testNHCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception{
		testNHCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNHCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features(){
		return testNHCucumberRunner.provideFeatures();
	}
	
	@AfterClass
	public void tearDownClass() throws Exception{
		testNHCucumberRunner.finish();
	}
}
