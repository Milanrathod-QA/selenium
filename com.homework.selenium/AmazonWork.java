package com.homework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonWork {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonWork amazonWork = new AmazonWork();
		amazonWork.openBrowser("https://www.amazon.in/");
		amazonWork.dropdownSelection();
		amazonWork.enterValue("prompt engineering");
		//amazonWork.implementScroll(); //this is not working here 
		amazonWork.selectItems();
		amazonWork.addCart();
		amazonWork.verifyCart();
		amazonWork.closeBrowser();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("page title is > " + driver.getTitle());
	} 
	
	//method for selecting drop-down values
	public void dropdownSelection() {
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByVisibleText("Books");  //select drop-down values in amazon 
		
		
	}
	//method for enter value in search box and click 
	public void enterValue(String search) {
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys(search);
		element.submit();
	}//btn locator + add wait
	
	public void implementScroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();", driver.findElement(By.linkText("Prompt Engineering for Generative AI: Future-Proof Inputs for Reliable AI Outputs (Grayscale Indian Edition)")));
	}
	
	public void selectItems() {
		//driver.findElement(By.linkText("")).click();
		WebElement element = driver.findElement(By.linkText("Prompt Engineering for Generative AI: Future-Proof Inputs for Reliable AI Outputs (Grayscale Indian Edition)"));
		element.click();
	}
	
	
	//method for click on add to cart button
	public void addCart() {
		//driver.findElement(By.linkText("Add to Cart")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		//"Added to cart"
		
		
	}
	
	//method for verify the item is added on cart
	public void verifyCart() {
		//driver.get(url);
		WebElement cartcount = driver.findElement(By.id("nav-cart-count"));
		System.out.println("Selected item count is " + cartcount.getText());
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
