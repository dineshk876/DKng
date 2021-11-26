package org.datprov;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataFb extends Base{
	@DataProvider(name = "testdata")
	private Object[][] data() {
		return new Object[][] { { "Selenium", "12345" }, { "Java", "987654" }, { "python", "12345678" }

		};
	}

	@Test(dataProvider = "testdata")
	private void testcase1(String user, String pass) {
		launch();
		url("https://www.facebook.com/");
		WebElement u = driver.findElement(By.id("email"));
		tofill(u, user);
		WebElement p = driver.findElement(By.id("pass"));
		tofill(p, pass);
		driver.findElement(By.name("login")).click();
		waits();
	}
}
