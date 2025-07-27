package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningScroll {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningScroll learningScroll = new LearningScroll();
		learningScroll.openBrowser("https://tutorialsninja.com/demo/");
		learningScroll.implementScroll();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void implementScroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();", driver.findElement(By.linkText("About Us")));
		
		
		
	}

}
