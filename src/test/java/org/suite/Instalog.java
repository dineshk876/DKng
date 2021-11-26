package org.suite;

import org.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Instalog extends Base{
	@Test(priority=1)
	private void testCase3() {
		launch();
		url("https://www.instagram.com/accounts/login/");
		maximize();
		waits();
		driver.findElement(By.name("username")).sendKeys("dinesh");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//form[@id='loginForm']/descendant::div[9]")).click();
		//driver.quit();
		}
	@Test(priority=3)
	private void testCase2() {
		launch();
		url("https://www.instagram.com/accounts/login/");
		maximize();
		waits();
		driver.findElement(By.name("username")).sendKeys("dinesh");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("(//form[@id='loginForm']/descendant::div)[8]")).click();		
		driver.quit();
		}
	@Test(priority=2,invocationCount=2)
	private void testCase1() {
		launch();
		url("https://www.instagram.com/accounts/login/");
		maximize();
		waits();
		driver.findElement(By.name("username")).sendKeys("dinesh");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("(//form[@id='loginForm']/descendant::div)[8]")).click();		
		//driver.quit();
	}
}
