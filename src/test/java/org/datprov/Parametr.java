package org.datprov;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parametr extends Base{
	public static PojoParametr p;
	@Test
	private void testcase1() {
		launch();
		url("http://www.adactin.com/HotelApp/");
		maximize();
		waits();

	}

	@Test
	@Parameters({"user1","pass1"})
	private void testcase2(String U1,String p1) {
		 p=new PojoParametr();
		WebElement user = p.getUser();
		tofill(user, U1);
		WebElement pass = p.getPass();
		tofill(pass, p1);
		p.getLogin().click();
	}
	@Parameters({"Location"})
	@Test
	private void testcase3(@Optional("Sydney")String lo) {
		 p=new PojoParametr();
		WebElement loca = p.getLoca();
		dropdown(loca, lo);
	}

	//@Optional("dinesh789") @Optional("dineshnaveen")
}
