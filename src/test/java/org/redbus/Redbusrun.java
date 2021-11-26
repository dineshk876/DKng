package org.redbus;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Redbusrun extends Base{
	@Test(priority=1)
	private void Testcase1() {
		launch();
		url("https://www.redbus.in/");
		maximize();
		waits();
		getdate();
	}

	@Test(priority=2)
	private void Testcase2() throws Throwable {
		
		//FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				//.pollingEvery(Duration.ofSeconds(1)).ignoring(Throwable.class);
		//WebDriverWait w=new WebDriverWait(driver,10);
		//TestPojo t = new TestPojo();
		WebElement src = driver.findElement(By.id("src"));
		tofill(src, "Chennai");
		clickAutoFill("Porur, Chennai");
		/*WebElement result = driver.findElement(By.className("autoFill"));
		w.until(ExpectedConditions.visibilityOf(result));
		result.click();*/
		
	}
	@Test(priority=3)
	private void to() {
		WebElement to = driver.findElement(By.id("dest"));
		tofill(to, "Kerala");
		clickAutoFill("Ranny (kerala)");

	}
	@Test(priority=4)
	private void date() {
		Pojo t=new Pojo();
		WebElement day = t.getDay();
		actions(day);
		day.click();

	}
	@Test(priority=5)
	private void search() {
		Pojo t=new Pojo();
		t.getSearch().click();
	}
	public void clickAutoFill(String from)
	{
	
		try {
		java.util.List<WebElement> findElements = driver.findElements(By.xpath("//ul[@Class='autoFill homeSearch']/li"));
		for(WebElement ele : findElements)
		{
			if(ele.getText().equals(from))
			{
				ele.click();
				
			}
		}}
		catch (StaleElementReferenceException e) {
			clickAutoFill(from);
		}
		}
}
