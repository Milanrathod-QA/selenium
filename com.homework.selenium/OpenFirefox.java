package com.homework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
	WebDriver driver; //declare global variable 
	
	public static void main(String[] args) {
		//instance 
		OpenFirefox openFirefox =  new OpenFirefox();
		openFirefox.openFirefox("https://www.google.com/");
		openFirefox.openTab();
		openFirefox.closeBrowser();
		
	}
	//method for open fire-fox browser
	public void openFirefox(String url) {
		// Initialize a WebDriver instance
		driver = new FirefoxDriver();
		driver.get(url);
		
		// Retrieve the page title using getTitle()
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	//method for open new tab
	public void openTab() {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	
	//method for closing browser
	public void closeBrowser() {
		//driver.close();  //close the browser
		driver.quit();
	}

}
