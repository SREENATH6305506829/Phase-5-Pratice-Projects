package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	private static String url = "https://www.amazon.in/register/";

	public static void main(String[] args) throws InterruptedException {
		WebDriver webdriver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\phase 5\\chromedriver_win32\\chromedriver.exe");
		webdriver = new ChromeDriver();

		signupform(webdriver, "Vishnu", "9876543212", "vishnu@gmail.com", "vishnu@124");


	}

	private static void signupform(WebDriver webdriver, String fullname, String mobilenumber, String email,
			String password) throws InterruptedException {

		webdriver.get(url);

		webdriver.findElement(By.id("ap_customer_name")).sendKeys(fullname);
		System.out.println("fullname Entered successfully");

		webdriver.findElement(By.id("ap_phone_number")).sendKeys(mobilenumber);
		System.out.println("Mobile Number entered successfully");

		webdriver.findElement(By.id("ap_email")).sendKeys(email);
		System.out.println("Email entered successfully");

		webdriver.findElement(By.id("ap_password")).sendKeys(password);
		System.out.println("Password entered successfully");
		
		Thread.sleep(5000);

		webdriver.findElement(By.id("continue")).click();
		System.out.println("Signup done successfully");
		
	//	webdriver.quit();
	//	System.out.println("test ended successfully and Web driver closed");

	}

}