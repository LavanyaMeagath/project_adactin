package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	
		public static WebDriver driver;
		
		public static WebDriver launch(String value) {
			if (value.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse\\Adactin_Project\\Driver\\chromedriver.exe");
				 driver = new ChromeDriver();			
			}
			else if (value.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "D:\\eclipse\\eclipse\\Adactin_Project\\Driver\\IEDriverServer.exe");
				driver= new InternetExplorerDriver();
			}
			return driver;
		}
		public static void url(String geturl) {
			driver.get(geturl);
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void navigateTo(String url) {
			driver.navigate().to(url);
		}
		public static void navigate_back() {
			driver.navigate().back();
		}
		public static void navigate_forward() {
			driver.navigate().forward();
		}
		public static void navigate_Refresh() {
			driver.navigate().refresh();
		}
		public static void quit() {
			driver.quit();
		}
		public static void close() {
			driver.close();
		}
		public static void time() throws InterruptedException {
			Thread.sleep(3000);
		}
	public static void inputvalue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void screenshot() throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("D:\\eclipse\\eclipse\\Adactin_Project\\screenshot\\error1.png");
	FileUtils.copyFile(source, destination);
	}
	public static void dropdownindex(WebElement value, int a) {
		Select s = new Select(value);
		s.selectByIndex(a);
}
	public static void dropdownvalue(WebElement value, String a) {
		Select s = new Select(value);
		s.selectByValue(a);
	}
	public static void dropdowntext(WebElement value, String text) {
		Select s = new Select(value);
		s.selectByVisibleText(text);
		
	}
	
	public static void single_frame(String element) {
		click(driver.findElement(By.xpath("//a[@href='#Single']")));
		driver.switchTo().frame(element);
		
		
	}
	public static void multiframe(WebElement element1,WebElement element2) {
		driver.switchTo().defaultContent();
		click(driver.findElement(By.xpath("(//a[@class='analystic'])[2]")));
		driver.switchTo().frame(element1);
		driver.switchTo().frame(element2);
	}
	public static void impli_wait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
