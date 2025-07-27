package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningMouseHower {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningMouseHower learningMouseHower =  new LearningMouseHower();
		learningMouseHower.openBrowser("https://tutorialsninja.com/demo/");
		learningMouseHower.hoverMouse();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void hoverMouse() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("Desktops"))).perform();  
	}
	

}
