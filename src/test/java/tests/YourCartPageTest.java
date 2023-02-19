package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.YourCartPage;

public class YourCartPageTest extends YourCartPage {
	YourCartPage check;
//	InventoryPage inventory;
	@BeforeMethod(alwaysRun = true)
	public void setup()
	{
		initialization();
		check = new YourCartPage();
//		inventory = new InventoryPage();
	}
	@Test(enabled = true,groups = {"sanity","smoke","regression"})
	public void addcarttest() throws InterruptedException, IOException
	{
		check.loginPageInApp();
		check.addinventory();
		check.addinventory1();
		String actuallable = check.Checkout();
		assertEquals(actuallable, "CHECKOUT: YOUR INFORMATION");
		
	}
	@AfterMethod(alwaysRun = true)
	public void CloseBrowser()
	{
		driver.close();
	}

}
