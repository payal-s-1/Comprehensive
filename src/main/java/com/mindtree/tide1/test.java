package com.mindtree.tide1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		System.out.println(driver.getTitle());

		// To verify if a user can successfully register an new account.
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("Sign up now")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("David");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("david@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.navigate().to("https://tide.com/en-us");
		
		// To verify if a user can successfully search
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("tide");
		driver.findElement(By.id("Line"));
	}

}
