package com.classwork.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNavigation {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningNavigation learningNavigation = new LearningNavigation();
		learningNavigation.openBrowser("https://demo.automationtesting.in/Register.html");
		learningNavigation.implementNavigation();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void implementNavigation() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().refresh();  //page refresh 
		driver.get("https://www.google.com");
		driver.navigate().back();  //redirect back page
		driver.navigate().forward(); 
	}

}
//amazon + automation practise