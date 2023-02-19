package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.InventoryPage;


public class inventoryPageTest extends InventoryPage {
	InventoryPage inventory;
	@BeforeMethod(alwaysRun = true)
	public void Setup()
	{
		initialization();
		inventory = new InventoryPage();
		
	}
	

	
	@Test(enabled = true,groups = {"sanity"})
	public void AddInventoryTest() throws InterruptedException, IOException
	{
		inventory.loginPageInApp();
		inventory.addinventory();
	}
	@Test(enabled = true,groups = {"smoke"})
	public void AddInventoryTest1() throws EncryptedDocumentException, InterruptedException, IOException
	{
		inventory.loginPageInApp();
		String actual = inventory.addinventory1();
		assertEquals(actual, "1");
	}
	@AfterMethod(alwaysRun = true)
	public void CloseBrowser(ITestResult it) throws IOException, InterruptedException
	{
		if (ITestResult.FAILURE==it.getStatus())
		{
			Utility.CapctureScreenShot.screenshot(it.getName());
		}
		
		driver.close();
	}
	

}
