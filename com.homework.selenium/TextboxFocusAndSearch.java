package com.homework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxFocusAndSearch {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextboxFocusAndSearch textboxFocusAndSearch = new TextboxFocusAndSearch();
		textboxFocusAndSearch.openBrowser("https://www.amazon.in/");
	 	textboxFocusAndSearch.textEnter("Learning java");
		textboxFocusAndSearch.closeBrowser();
	}
	//method for Open Browser
		public void openBrowser(String url) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			System.out.println(driver.getTitle());
			
		}
		
		//method for focus on search box and enter value
		public void textEnter(String search) {
			WebElement element =  driver.findElement(By.name("field-keywords"));
			element.click();
			element.sendKeys(search); 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			element.clear();  //clear the entered value
			//when clear the value search bar is not appear in default state
			element.sendKeys("learn ai");
			System.out.println(element.getDomProperty("value"));
			
		}
		
		public void closeBrowser() {
			driver.quit();
		}


}
