package com.adactinrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature\\adactin.feature",
glue = "com.adactin.stepdefinition",
monochrome = true,
//dryRun = true,
plugin = {"pretty","html:target/cucu-report",
          "pretty"
		}
//  "json:Repott/adactin.json"

)

public class Test_Runner extends Base_Class {

	public static WebDriver driver;

	@BeforeClass

	public static void setup() {
		driver = launch("chrome");
	//  System.setProperty("webdriver.chrome.driver",
	//			"D:\\eclipse\\eclipse\\Adactin_Project\\Driver\\chromedriver.exe");
	//	 driver = new ChromeDriver();
	}
	@AfterClass

	public static void teardown() {
	//	driver.close();
	}
}

