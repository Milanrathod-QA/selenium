package com.classwork.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFindLink {
	WebDriver driver;
	
	public static void main(String[] args) {
		LearningFindLink learningFindLink = new LearningFindLink();
		learningFindLink.openWeb("https://tutorialsninja.com/demo/");
		learningFindLink.implementLink();
		learningFindLink.closeBrowser();
		

	}
	public void openWeb(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the browser screen
		driver.get(url); 
		 
	}
	
	public void implementLink() {
		List<WebElement> lstLinks = driver.findElements(By.tagName("a"));
		for (WebElement getlink :lstLinks) {
			System.out.println(getlink.getText());
			System.out.println(getlink.getDomAttribute("href"));
			
		}
	}
	public void closeBrowser() {
		driver.quit();
	}

}
