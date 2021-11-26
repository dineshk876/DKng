package org.demo;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demoimp extends Base{
	@Test
	private void testcase1() throws Throwable {
		launch();
		url("https://demoqa.com/automation-practice-form");
		maximize();
		WebElement first = driver.findElement(By.id("firstName"));
		tofill(first, "Dinesh");
		WebElement last = driver.findElement(By.id("lastName"));
		tofill(last, "Kumar");
		WebElement email = driver.findElement(By.id("userEmail"));
		tofill(email, "Dinesh@gmail.com");
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));
		buttonclick(gender);
		WebElement mob = driver.findElement(By.id("userNumber"));
		tofill(mob, "7894561230");
		WebElement Dob = driver.findElement(By.id("dateOfBirthInput"));
		buttonclick(Dob);
		WebElement month = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"));
		dropdown(month, "March");
		WebElement yr = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		dropdown(yr, "1998");
		WebElement day = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[5]"));
		actions(day);
		buttonclick(day);
		WebDriverWait w=new WebDriverWait(driver, 30);
		/*WebElement sub = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		w.until(ExpectedConditions.elementToBeClickable(sub));
		Actions a=new Actions(driver);
		
		a.moveToElement(sub).click().sendKeys("java").perform();*/	
		
		subject();
		Thread.sleep(5000);
		WebElement music = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		//w.until(ExpectedConditions.elementToBeClickable(music));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",music);
		
		WebElement add = driver.findElement(By.id("currentAddress"));
		tofill(add, "Chennai");
		WebElement state = driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[2]/div"));
		buttonclick(state);
		keyDown();
		keyEnter();
		WebElement city = driver.findElement(By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]"));
		buttonclick(city);
		keyDown();
		keyEnter();

	}
	public static void subject() {
		WebDriverWait w=new WebDriverWait(driver, 30);
		WebElement sub = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		w.until(ExpectedConditions.elementToBeClickable(sub));
		Actions a=new Actions(driver);
		a.moveToElement(sub).click().sendKeys("JAVA is Programming Language").build().perform();

	}
}
