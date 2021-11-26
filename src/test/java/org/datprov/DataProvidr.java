package org.datprov;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProvidr extends Base{
	public static PojoParametr p;
	@DataProvider(name = "testdata")
	private Object[][] data() {
		return new Object[][] { { "Selenium", "12345" }, { "Java", "123456" }, { "python", "12345678" }

		};
	}
	
	@Test(dataProvider = "testdata")
	private void testcase2(String U1,String p1) {
		launch();
		url("http://www.adactin.com/HotelApp/");
		maximize();
		waits();
		 p=new PojoParametr();
		WebElement user = p.getUser();
		tofill(user, U1);
		WebElement pass = p.getPass();
		tofill(pass, p1);
		p.getLogin().click();
	}
}
