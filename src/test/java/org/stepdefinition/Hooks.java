package org.stepdefinition;

import java.io.File;
import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hooks extends BaseClass{
	@Before()
	public void beforeScenario1() {
		System.out.println("BeforeScenario1");
		launchBrowser();
		launchUrl("https://www.crazysales.com.au/");
		//maximizeWindow();
		impWait();
	}
	@After()
	public void afterScenario1(Scenario s) {
		System.out.println("AfterScenario1");
		driver.quit();
	}	

	@Before(value="@Sanity",order=1)
	public void beforeScenario2(){
		System.out.println("BeforeScenario 2....");
	}
	@After("@Sanity")
	public void afterScenario2(){
		System.out.println("AfterScenario 2....");
	}
}
