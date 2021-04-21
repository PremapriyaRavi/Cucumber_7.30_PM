package org.runner;
import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\PREMA\\eclipse-workspace\\Cucumber_7.30PM\\src\\test\\resources\\Features\\login.feature",
glue="org.stepdefinition",
//dryRun=true,
dryRun=false,
monochrome=true,
tags="@Sanity",
plugin={"pretty",
		//location 
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\report.json",
		"junit:src\\test\\resources\\Reports\\output.xml",
		// rerun capture the failed scenario
"rerun:src\\test\\resources\\FailedScenarios\\failed.txt"},
snippets=SnippetType.CAMELCASE,
strict=true)
//once the snippets generated we have to change dryrun=false 
//then only it excute or else it gets skipped
public class TestRunner{
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport("src\\test\\resources\\Reports\\newreport.json");
		System.out.println("Done!!!....");
	}

}
