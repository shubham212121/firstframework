package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CheckoutStage2;

public class CheckoutStage2Test extends CheckoutStage2 {
	CheckoutStage2 check;
	@BeforeMethod(alwaysRun = true)
	public void setup()
	{
		initialization();
		check = new CheckoutStage2();
	}
	
	@Test(enabled = true,groups = {"sanity","regression"})
	public void FinalCartDetailsTest() throws InterruptedException, IOException
	{
		check.loginPageInApp();
		check.addinventory();
		check.addinventory1();
		check.Checkout();
		check.CheckoutDetail();

		String actual = check.finalcartdetails();
		assertEquals(actual, "THANK YOU FOR YOUR ORDER");
	}
	@AfterMethod(alwaysRun = true)
	public void CloseBrowser()
	{
		driver.close();
		
	}
}
