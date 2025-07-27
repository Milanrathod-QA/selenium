package com.classwork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningXpath {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningXpath lrarningxXpath = new LearningXpath();
		lrarningxXpath.openBrowser("https://tutorialsninja.com/demo/");
		lrarningxXpath.learnXpath();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
//absolute         / relative
	
	public void learnXpath() {
		//WebElement elemet = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")); //absolute Xpath
		//WebElement elemet = driver.findElement(By.xpath("//*[@placeholder='Search']"));   //relative Xpath with '*' symbol 
		//WebElement elemet = driver.findElement(By.xpath("//input[@placeholder='Search']"));  //relative Xpath
		//elemet.click();
		
		//driver.findElement(By.xpath("//*[text()='About Us']")).click();   //Xpath for- visible text
		//driver.findElement(By.xpath("//*[@name='search' and @placeholder='Search']")).click();  //xpath withh and condition => both are true then xpath work
		driver.findElement(By.xpath("//*[@name='search' or  @placeholder='Search']")).click();  //xapth with or condition => true any one then work
		
	}
}
//Xpath
