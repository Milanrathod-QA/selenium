package com.homework.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	WebDriver driver; //declare global variable
	
	public static void main(String[] args) {
		//instance 
		Locators locators =  new Locators();
		locators.openBrowser("https://www.amazon.in/");
		//locators.findlocators();
		locators.findingLinks();
		locators.close();
	}
	
	//method for open browser
	public void openBrowser(String url) {
		// Initialize a WebDriver instance
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the size of browser
		driver.get(url);
		driver.getTitle();
		
		// Retrieve the page title using getTitle()
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public void findlocators() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");   //click on search box and enter input 'mobile'
		driver.findElement(By.id("nav-search-submit-button")).click(); 		   //click on search icon on search bar and it will redirect with entered values
		//driver.findElement(By.partialLinkText("Bestsellers")).click(); 	   //click on link with their name, input is also case sensitive
		//driver.findElement(By.linkText("Bestsellers")).click();  			   //click using linkText
		//driver.findElement(By.name(""));
	}
	
	//method for get links
	public void findingLinks() {
		//To get link list of web elements with tagName is - a
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		//List<WebElement> Links = driver.findElements(By.tagName("option"));
		for (WebElement getlink : Links) {
			System.out.println(getlink.getText());					//get  text 
			System.out.println(getlink.getDomAttribute("href")); 	//get url
		}
					
	}
	//method for quite browser- stop execution
	public void close() {
		driver.quit();
	}

}
