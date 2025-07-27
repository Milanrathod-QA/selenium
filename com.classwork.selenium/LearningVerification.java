package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningVerification {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningVerification learningVerification = new LearningVerification();
		learningVerification.openBrowser("https://tutorialsninja.com/demo/");
		learningVerification.implementVerification();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void implementVerification() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		boolean verification = driver.findElement(By.name("search")).isEnabled(); // to check that text box is enable or not
		System.out.println(verification);
		
		boolean display = driver.findElement(By.name("search")).isDisplayed();
		System.out.println(display);
		
	}

}
