package org.suite;

import org.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Fblog extends Base{
	@Test(priority=7,invocationCount=3)
	private void testCase1() {
		launch();
		url("https://www.facebook.com/");
		maximize();
		waits();
		driver.findElement(By.id("email")).sendKeys("dinesh");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		driver.quit();
		}

	@Test(priority=8,enabled=false)
	private void testCase2() {
		launch();
		url("https://www.facebook.com/");
		maximize();
		waits();
		driver.findElement(By.id("email")).sendKeys("kumar");
		driver.findElement(By.id("pass")).sendKeys("757524");
		driver.findElement(By.name("login")).click();
		driver.quit();
		}

	@Test(priority=9)
	private void testCase3() {
		launch();
		url("https://www.facebook.com/");
		maximize();
		waits();
		driver.findElement(By.id("email")).sendKeys("rahman");
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		driver.quit();
		}
}
