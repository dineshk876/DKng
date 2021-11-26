package org.datprov;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoParametr extends Base{
public PojoParametr() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="username")
private WebElement user;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login")
private WebElement login;
@FindBy(name="location")
private WebElement loca;
@FindBy(id="hotels")
private WebElement hotel;
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}
public WebElement getLoca() {
	return loca;
}
public WebElement getHotel() {
	return hotel;
}

}
