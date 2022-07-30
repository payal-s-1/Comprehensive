package com.mindtree.tide3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		System.out.println(driver.getTitle());
		
		// To verify whether Shop Now button works
		driver.findElement(By.linkText("Shop now")).click();
		driver.findElement(By.linkText("Find Retailers")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		// To verify whether Coupons and Rewards work
		driver.findElement(By.linkText("Coupons and Rewards")).click();
		driver.findElement(By.linkText("Save Now")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Peter");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("peter@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("passWord@1");
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		
	}

}
