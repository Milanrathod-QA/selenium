package com.classwork.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {
	
	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenWebsite openWebsite = new OpenWebsite();
		openWebsite.openBrowaser("https://tutorialsninja.com/demo/");
		openWebsite.closeBrowser();
	}
	
	public void openBrowaser(String url) {
		 driver = new ChromeDriver();
	//interface object key constructor of chrom.. class
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void closeBrowser() {
		//driver.close();// it will close the current tab
		driver.quit();		//it will close the all running tabs 
	}

}
