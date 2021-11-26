package org.demo;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Click extends Base{
	@Test
	private void simple() throws Throwable {
		launch();
		url("https://demoqa.com/automation-practice-form");
		maximize();
		WebDriverWait w=new WebDriverWait(driver, 30);
		WebElement sub = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		w.until(ExpectedConditions.elementToBeClickable(sub));
		Actions a=new Actions(driver);
		a.moveToElement(sub).click().sendKeys("Raja").perform();
		Thread.sleep(5000);
		//sub.sendKeys("dinesh");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','simple')", sub);
		
		
	}
}
