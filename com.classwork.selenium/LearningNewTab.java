package com.classwork.selenium;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningNewTab {
	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningNewTab learningNewTab = new LearningNewTab();
		learningNewTab.browserOpen("https://tutorialsninja.com/demo/");
		learningNewTab.openNewTab();
	}
	
	public void browserOpen(String url ) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void openNewTab() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in");
		
		ArrayList<String> lsttab = new ArrayList<String>(driver.getWindowHandles()); //switching tab
		driver.switchTo().window(lsttab.get(0));
		System.out.println(driver.getTitle());
		
		//driver.switchTo().newWindow(WindowType.WINDOW);
	}
	
}
