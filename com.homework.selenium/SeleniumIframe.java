package com.homework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SeleniumIframe {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumIframe seleniumIframe = new SeleniumIframe();
		seleniumIframe.openBrowser("https://demo.automationtesting.in/Register.html");
		seleniumIframe.hoverMouse();
		seleniumIframe.implementIframe();

	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
			
	}
	
	public void hoverMouse() {
		WebElement element =  driver.findElement(By.linkText("SwitchTo"));
		element.click();
		
		Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.linkText("SwitchTo"))).perform();  
		actions.moveToElement(driver.findElement(By.linkText("Frames"))).perform();
		actions.click().perform();
	}
	
	public void implementIframe() {
		//driver.switchTo().frame(driver.findElement(By.linkText("Iframe with in an Iframe")));   //jump into Iframe
		 //driver.switchTo().frame(driver.findElement(By.linkText("Iframe with in an Iframe")));
		 //driver.switchTo().frame("Iframe with in an Iframe");
		 //driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")));
		
		//driver.switchTo().frame(driver.findElement(By.id("Iframe with in an Iframe")));
		//driver.switchTo().frame(driver.findElement(By.linkText("SingleFrame.html")));
		
		//driver.findElement(By.cssSelector("ul.nav-tabs > li:nth-child(2) > a:nth-child(1)")).click();  //this is working
		//driver.switchTo().frame(driver.findElement(By.linkText("#Multiple")));
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
		
		WebElement element = driver.findElement(By.cssSelector(".col-xs-6 > input:nth-child(1)"));
		element.click();
	}

}
