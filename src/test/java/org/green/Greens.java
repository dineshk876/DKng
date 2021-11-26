package org.green;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Greens extends Base{
	@Test(priority=1)
	private void Testcase1() {
		launch();
		url("http://www.greenstechnologys.com/index.html");
		maximize();
		waits();
		getdate();
	}
	@Test(priority=2)
	private void testcase2() {
		WebElement pagedown = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/div[6]/p/b/strong/span"));
		scrollDown(pagedown);
		WebElement perum = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/div[6]"));
		System.out.println(perum.getText());
		waits();
		WebElement pageup = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/h1"));
		scrollUp(pageup);
		System.out.println(pageup.getText());

	}
	@Test(priority=3)
	private void testcase3() {
		driver.findElement(By.xpath("//*[@id=\"nav-wrapper\"]/ul/li[2]/a")).click();
		WebElement selenium = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/ul/li[30]/span/a"));
		scrollDown(selenium);
		selenium.click();

	}
}
