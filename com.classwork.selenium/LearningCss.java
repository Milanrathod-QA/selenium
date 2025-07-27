package com.classwork.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningCss {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningCss learningCss = new LearningCss();
		learningCss.openBrowser("https://tutorialsninja.com/demo/");
		learningCss.implementCss();
	}
		
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void implementCss() {
		//driver.findElement(By.cssSelector("#cart-total")).click();  //using id attribute
		//driver.findElement(By.cssSelector(".btn.btn-default.btn-lg")).click();  //using class attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search']")).click();  //using other attribute
		//driver.findElement(By.cssSelector("h4>a")).click();
		
		List<WebElement> lstcategory = driver.findElements(By.cssSelector("h4>a"));
		for (WebElement element : lstcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("iPhone")) {
				element.click();
				break;
			}else {
				System.out.println(getcategory);
			}
			
		}
	}
	

}
//Rule1: if we have use 'id' attribute value then put the # sign fist and then attribute values
//Rule2: if we have use 'class' attribute value then put the dot(.) sign first and replace the space with dot(.)
//Rule3: if we have use other attributes then rule is =>  tag name[attributes='attribute value']   
//Rule4: define parent child relationship 

//css -> attribute || Xpath -> tag 
//css selector