package com.homework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOrangeHRM {
WebDriver driver;
	public static void main(String[] args) {
	PracticeOrangeHRM practiceOrangeHRM = new PracticeOrangeHRM();
	practiceOrangeHRM.openBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login/");

	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);	
	}
	

}
