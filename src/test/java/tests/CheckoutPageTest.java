package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckoutPage;

public class CheckoutPageTest extends CheckoutPage {
	CheckoutPage check;
	@BeforeMethod(alwaysRun = true)
	public void setup()
	{
		initialization();
		check = new CheckoutPage();
	}
	@Test(enabled = true,groups = {"sanity","smoke","regression"})
	public void CheckoutTest() throws InterruptedException, IOException
	{
		check.loginPageInApp();
		check.addinventory();
		check.addinventory1();
		check.Checkout();
		String actuallabel = check.CheckoutDetail();
		assertEquals(actuallabel, "CHECKOUT: OVERVIEW");
		
	}
	@AfterMethod(alwaysRun = true)
	public void CloseBrowser()
	{
		driver.close();
	}

}
