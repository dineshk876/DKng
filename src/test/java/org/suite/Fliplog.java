package org.suite;

import org.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fliplog extends Base{
	@Test(priority=4,enabled=false)
	private void testCase1() {
		launch();
		url("https://www.flipkart.com/account/login");
		maximize();
		waits();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("dinesh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.quit();
		}

	@Test(priority=5)
	private void testCase2() {
		launch();
		url("https://www.flipkart.com/account/login");
		maximize();
		waits();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1123456");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.quit();
		}

	@Test(priority=6,invocationCount=3)
	private void testCase3() {
		launch();
		url("https://www.flipkart.com/account/login");
		maximize();
		waits();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ani");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12855585");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.quit();
		}
}
