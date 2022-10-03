package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Login {

	private static String url = "https://www.amazon.in/";

	public static void main(String[] args) throws InterruptedException {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\phase 5\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();

		System.out.println("For login");

		Loginform(webdriver, "sriram123@gmail.com", "123456");
	}

	private static void Loginform(WebDriver webdriver, String email, String password) throws InterruptedException {

		webdriver.get(url);
		webdriver.findElement(By.id("nav-link-accountList")).click();
		System.out.println("signin from opened");

		webdriver.findElement(By.id("ap_email")).sendKeys(email);
		System.out.println("Email field is filled");
		
		Thread.sleep(5000);

		webdriver.findElement(By.id("continue")).click();
		System.out.println("Moved to next page successfully");

		webdriver.findElement(By.id("ap_password")).sendKeys(password);
		System.out.println("Password field is filled");
		
		Thread.sleep(5000);
		
		webdriver.findElement(By.id("signInSubmit")).click();
		System.out.println("Login successfully");

	//	webdriver.quit();
	//	System.out.println("test ended successfully and Web driver closed");

	}
}