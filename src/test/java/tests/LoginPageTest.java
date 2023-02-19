package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Utility.CapctureScreenShot;
import pages.LoginPage;

public class LoginPageTest extends LoginPage {
	
	LoginPage login;
	@BeforeMethod(alwaysRun = true)
	public void setup()
	{
		initialization();
		login = new LoginPage();
		
	}
	
	@Test(enabled = true,groups = {"sanity","smoke"})
		public void VerifyTitleTest() throws InterruptedException
		{
			
			String actualtitle = login.verifyTitle();
			Assert.assertEquals(actualtitle, "Swag Labs");
			Reporter.log("VerifyTitleTest",true);
		}
	@Test(enabled = true,groups = {"smoke"})
		public void VerifyURLTest() throws InterruptedException
		{
			String actualURL=login.verifyurl();
			assertEquals(actualURL, "https://www.saucedemo.com/");
//			assertTrue(false, "intentionally test case failed to check screenshot method");
		
			Reporter.log(actualURL,true);
		}
	@Test(enabled = true,groups = {"sanity","regression"})
		public void VerifyLogoTest()
		{
			boolean actual = login.verifylogo();
			assertEquals(actual, true);
//			assertFalse(true);
			Reporter.log("logo tested");
		}
	@Test(enabled = true, /*dependsOnMethods = "VerifyURLTest()",*/groups = {"sanity"})
		public void loginPageTest() throws InterruptedException, IOException
		{
			String currentURL=login.loginPageInApp();
			assertEquals(currentURL, "https://www.saucedemo.com/inventory.html");
			Reporter.log("login sucessfully");
		}
	@AfterMethod(alwaysRun = true)
		public void CloseBrowser(ITestResult it) throws IOException, InterruptedException
		{
			if(ITestResult.FAILURE == it.getStatus())
			{
				CapctureScreenShot.screenshot(it.getName());
			}
			driver.close();
		}
}


/*git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/aditypanat/saucelabs.git
git push -u origin main*/

/*git remote add origin https://github.com/aditypanat/saucelabs.git
git branch -M main
git push -u origin main*/
