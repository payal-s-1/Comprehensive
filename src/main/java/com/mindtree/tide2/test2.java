package com.mindtree.tide2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		System.out.println(driver.getTitle());
		
		// To verify whether the Shop Products Dropdown works
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Shop Products"))).build().perform();
		
		driver.findElement(By.xpath("//a[@data-action-detail='Pacs']")).click();
		driver.findElement(By.linkText("Browse other products")).click();
		driver.findElement(By.linkText("Stain Remover")).click();
		driver.navigate().back();
		driver.navigate().back();
		
		// To verify whether the How to Wash Clothes Dropdown works
		a.moveToElement(driver.findElement(By.linkText("How to Wash Clothes"))).build().perform();
		driver.findElement(By.linkText("How to Remove Stains")).click();
		driver.navigate().back();
	}

}
