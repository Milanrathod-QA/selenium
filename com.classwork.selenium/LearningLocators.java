package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearningLocators {
	WebDriver driver;
	
	public static void main(String[] args) {
	LearningLocators learningLocators = new LearningLocators();
	learningLocators.openWeb("https://tutorialsninja.com/demo/");
	learningLocators.implementLocators();
	//learningLocators.close();
	}
	public void openWeb(String url) {
		driver = new EdgeDriver();
		driver.manage().window().maximize(); //maximize the browser screen
		driver.get(url); 
		 
	}
	
	public void implementLocators() {
		//driver.findElement(By.id("cart-total")).click();
		//driver.findElement(By.name("search")).click();
		//driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.partialLinkText("About")).click();
	}
	
	public void close() {
		driver.quit();
	}
}
