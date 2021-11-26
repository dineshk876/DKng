package org.redbus;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base {
	public Pojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="src")
	private WebElement from;
	@FindBy(xpath="//*[@id=\"dest\"]")
	private WebElement to;
	@FindBy(xpath="//*[@id=\"onward_cal\"]")
	private WebElement date;
	@FindBy(xpath="//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[5]")
	private WebElement day;
	
	////td[text()='19']
	
	@FindBy(xpath="//*[@id=\"search_btn\"]")
	private WebElement search;

	List<WebElement> findElements = driver.findElements(By.xpath("//ul[@Class='autoFill']/li"));

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getSearch() {
		return search;
	}

	public List<WebElement> getFindElements() {
		return findElements;
	}
}
