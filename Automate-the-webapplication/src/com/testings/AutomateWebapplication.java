package com.testings;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AutomateWebapplication {
	
	private static String url = "https://www.amazon.in/";

	WebDriver webdriver = null;

	
	@BeforeTest
	public void start() {
		System.setProperty("webdriver.chrome.driver", "D:\\phase 5\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();
	}
	
	@Test(priority=1)
	public void signupform() throws InterruptedException {
		webdriver.get(url);
		
		webdriver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
		
	    webdriver.findElement(By.id("createAccountSubmit")).click();
	    Thread.sleep(5000);
	    
		webdriver.findElement(By.id("ap_customer_name")).sendKeys("ABCDEF");
		Thread.sleep(5000);
		System.out.println("fullname Entered successfully");

		webdriver.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
		Thread.sleep(5000);
		System.out.println("Mobile Number entered successfully");

		webdriver.findElement(By.id("ap_email")).sendKeys("ABCDEF@gmail.com");
		Thread.sleep(5000);
		System.out.println("Email entered successfully");

		webdriver.findElement(By.id("ap_password")).sendKeys("12345678");
		Thread.sleep(5000);
		System.out.println("Password entered successfully");
		
		webdriver.findElement(By.id("continue")).click();
		System.out.println("Signup done successfully");

	}  
	
	@Test(priority=2)
	public void Login() throws InterruptedException {
		webdriver.get(url);
		webdriver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(5000);
		System.out.println("signin form opened");

		webdriver.findElement(By.id("ap_email")).sendKeys("ABCDEF@gmail.com");
		Thread.sleep(5000);
		System.out.println("Email field is filled");

		webdriver.findElement(By.id("continue")).click();
		Thread.sleep(5000);
		System.out.println("Moved to next page successfully");

		webdriver.findElement(By.id("ap_password")).sendKeys("12345");
		System.out.println("Password field is filled");

		//webdriver.findElement(By.id("signInSubmit")).click();
		
	}   
	
	 @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
		 	webdriver.get(url);
		    System.out.println(webdriver.getTitle());
		    System.out.println(webdriver.getCurrentUrl());
		    webdriver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		    Thread.sleep(5000);
		    webdriver.findElement(By.id("nav-search-submit-button")).submit();
		    Thread.sleep(5000);
		    webdriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		    Thread.sleep(5000);
		    Set<String> ids = webdriver.getWindowHandles();
			Iterator<String> it = ids.iterator();
			String parentId = it.next();
			String childId = it.next();
			webdriver.switchTo().window(childId);
			webdriver.findElement(By.id("add-to-cart-button")).click();
	 }   
}

