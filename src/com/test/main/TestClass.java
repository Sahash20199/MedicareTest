package com.test.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\tools\\servers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost:9000/adminlogin");

		
		driver.findElement(By.name("admin_id")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("admin_pwd")).sendKeys("pass");
		Thread.sleep(1000);
		driver.findElement(By.name("admin_login")).click();
		Thread.sleep(1000);
		
		
		Thread.sleep(3000);
		driver.close();
		}

}
