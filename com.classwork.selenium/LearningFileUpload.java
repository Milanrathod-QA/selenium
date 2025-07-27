package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFileUpload {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningFileUpload learningFileUpload= new LearningFileUpload();
		learningFileUpload.openBrowser("https://demo.automationtesting.in/Register.html");
		learningFileUpload.fileUpload();
		
	}
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void fileUpload() {
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\A\\Pictures\\sign-.jpg"); 
		
	}
		
}
