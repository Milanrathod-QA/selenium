package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningTextbox {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningTextbox learningTextbox = new LearningTextbox();
		learningTextbox.openBrowser("https://tutorialsninja.com/demo/");
		learningTextbox.enterText("iphone");
		
	}
	public void openBrowser(String url) {
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
				
	}
	public void enterText(String search) {
		WebElement element = driver.findElement(By.name("search"));
		element.click();
		element.sendKeys(search);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.clear();
		element.sendKeys("mac");
		System.out.println(element.getDomProperty("value")); // print the entered value 
	}
	
	

}
