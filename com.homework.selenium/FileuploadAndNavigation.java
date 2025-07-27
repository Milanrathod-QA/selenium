package com.homework.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadAndNavigation {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileuploadAndNavigation fileuploadAndNavigation = new FileuploadAndNavigation();
		fileuploadAndNavigation.openBrowser("https://demo.automationtesting.in/Register.html");
		
		fileuploadAndNavigation.fileUpload();
		fileuploadAndNavigation.implementNavigation();

	}
	//method for Open Browser
		public void openBrowser(String url) {
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(url);
				System.out.println(driver.getTitle());
			}
			
		//method for upload file 
		public void fileUpload() {
			driver.findElement(By.id("imagesrc")).sendKeys("F:\\Automation classes\\Java exam paper-1.docx");
			 
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.id("imagesrc")).clear();  //to clear uploaded file
		}
		
		public void implementNavigation() {
			driver.get("https://demo.automationtesting.in/WebTable.html");
			driver.navigate().back(); //redirect to back page <-
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.navigate().forward(); //redirect to previous page ->
		}
	
}
