package com.homework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OpenBrowser openBrowser =  new OpenBrowser();
		openBrowser.openEdge("https://www.amazon.in/");
	}
	
	public void openEdge(String url) {
		driver = new EdgeDriver();
		driver.manage().window().maximize(); //maximize the browser screen
		driver.get(url);
		//driver.close();	 //appear socket error in console 
		driver.quit();		// no any error 
	}

}
